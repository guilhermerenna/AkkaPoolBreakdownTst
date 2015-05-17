package artificeCluster;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.routing.FromConfig;

public class StarterApp1 {

    public static void main(String[] args) throws InterruptedException {
        // starting 3 backend nodes and 1 frontend node
        System.err.println("Iniciando Backend 1 em 2551.");
        ArtificeBackendMain.main(new String[]{"2551"});
        System.err.println("Iniciando Backend 2 em 2552.");
        ArtificeBackendMain.main(new String[]{"2552"});
        System.err.println("Iniciando Frontend em random.");
        ActorSystem system = ArtificeFrontendMain.main(new String[0]);
        System.err.println("Cluster up!!");

        Thread.sleep(5000);

        ActorRef backend = system.actorOf(FromConfig.getInstance().props(),
                "artificeBackendRouter");

        Thread.sleep(5000);
        System.err.println("APP: Enviando estimulo de toque para criatura...");
        //TODO: ask backend for new creature: string message with code 1.
        System.err.println("APP: Enviado!");
    }
}
