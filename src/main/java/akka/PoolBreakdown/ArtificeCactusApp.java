package akka.PoolBreakdown;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

import Stimuli.*;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

//import akka.kernel.Bootable;

public class ArtificeCactusApp {

	public static void main(String[] args) throws InterruptedException {
		
		// Override the configuration of the port
		Config config = ConfigFactory.parseString(
				"akka.remote.netty.tcp.port=" + 2552).withFallback(
				ConfigFactory.load());

		ActorSystem cactusSystem = ActorSystem.create("ArtificeSystem", config);
		// ConfigFactory.load().getConfig("ArtificeRouter"));
		
		ActorRef fruit = cactusSystem.actorOf(Props.create(FruitActor.class),
				"fruit1");
		ActorRef cactus = cactusSystem.actorOf(Props.create(CactusActor.class),
				"cactus1");

	}
}
