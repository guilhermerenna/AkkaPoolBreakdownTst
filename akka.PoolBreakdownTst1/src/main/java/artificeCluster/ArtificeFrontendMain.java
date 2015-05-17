package artificeCluster;

import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.cluster.Cluster;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class ArtificeFrontendMain {

    public static ActorSystem main(String[] args) {
        final int upToN = 200;

        final Config config = ConfigFactory.parseString(
                "akka.cluster.roles = [frontend]").withFallback(
                ConfigFactory.load("artifice"));

        final ActorSystem system = ActorSystem.create("ClusterSystem", config);
        system.log().info(
                "Activities will start when 2 backend members in the cluster.");
        //#registerOnUp
        System.err.println("Frontend: registrando...");
        Cluster.get(system).registerOnMemberUp(new Runnable() {
            public void run() {
                System.err.println("Frontend: running!");
                system.actorOf(Props.create(ArtificeFrontend.class, upToN, true),
                        "artificeFrontend");
                System.err.println("Frontend: router registrado!");
            }
        });
        //#registerOnUp
        return system;
    }

}
