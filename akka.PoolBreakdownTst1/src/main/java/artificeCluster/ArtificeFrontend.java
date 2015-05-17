package artificeCluster;

import akka.actor.ActorRef;
import akka.actor.ReceiveTimeout;
import akka.actor.UntypedActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import akka.routing.FromConfig;
import scala.concurrent.duration.Duration;

import java.util.concurrent.TimeUnit;

//#frontend
public class ArtificeFrontend extends UntypedActor {
    final int upToN;
    final boolean repeat;

    LoggingAdapter log = Logging.getLogger(getContext().system(), this);

    //Roteador de backends
    ActorRef backend = getContext().actorOf(FromConfig.getInstance().props(),
            "artificeBackendRouter");

    public ArtificeFrontend(int upToN, boolean repeat) {
        this.upToN = upToN;
        this.repeat = repeat;
    }

    @Override
    public void preStart() {
        sendJobs();
        getContext().setReceiveTimeout(Duration.create(10, TimeUnit.SECONDS));
    }

    @Override
    public void onReceive(Object message) {
        if (message instanceof FactorialResult) {
            System.err.println("Frontend: mensagem recebida: Resultado do fatorial!");
            FactorialResult result = (FactorialResult) message;
            if (result.n == upToN) {
                log.debug("{}! = {}", result.n, result.factorial);
                if (repeat)
                    sendJobs();
                else
                    getContext().stop(getSelf());
            }

        } else if (message instanceof ReceiveTimeout) {
            System.err.println("Frontend: mensagem recebida: Timeout.");
            log.info("Timeout");
            sendJobs();

        } else {
            System.err.println("Frontend: mensagem recebida: unhandled.");
            unhandled(message);
        }
    }

    void sendJobs() {
        log.info("Starting batch of factorials up to [{}]", upToN);
        for (int n = 1; n <= upToN; n++) {
            System.err.println("Frontend: enviando job para backend...");
            backend.tell(n, getSelf());
        }
    }

}

//#frontend
