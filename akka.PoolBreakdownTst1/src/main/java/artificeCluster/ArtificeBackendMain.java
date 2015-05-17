package artificeCluster;

import akka.actor.ActorSystem;
import akka.actor.Props;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class ArtificeBackendMain {

    public static void main(String[] args) {
        // Override the configuration of the port when specified as program argument
        final String port = args.length > 0 ? args[0] : "0";
        final Config config = ConfigFactory.parseString("akka.remote.netty.tcp.port=" + port).
                withFallback(ConfigFactory.parseString("akka.cluster.roles = [backend]")).
                withFallback(ConfigFactory.load("artifice"));

        System.err.println("Criando actorSystem em backend.");
        ActorSystem system = ActorSystem.create("ClusterSystem", config);

        System.err.println("Criando ator em backend.");
        system.actorOf(Props.create(ArtificeBackend.class), "artificeBackend");

        System.err.println("Criando ator metricsListener em backend.");
        system.actorOf(Props.create(MetricsListener.class), "metricsListener");

    }

}
