package factorial;

import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.cluster.Cluster;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class FactorialFrontendMain {

    public static void main(String[] args) {
        final int upToN = 200;

        final Config config = ConfigFactory.parseString(
                "akka.cluster.roles = [frontend]").withFallback(
                ConfigFactory.load("factorial"));

        final ActorSystem system = ActorSystem.create("ClusterSystem", config);
        system.log().info(
                "Factorials will start when 2 backend members in the cluster.");
        //#registerOnUp
        System.err.println("Frontend: registrando...");
        Cluster.get(system).registerOnMemberUp(new Runnable() {
            public void run() {
                System.err.println("Frontend: running!");
                system.actorOf(Props.create(FactorialFrontend.class, upToN, true),
                        "factorialFrontend");
                System.err.println("Frontend: router registrado!");
            }
        });
        //#registerOnUp
    }

}
