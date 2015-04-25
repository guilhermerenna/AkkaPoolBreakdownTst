package akka.PoolBreakdown;

import java.net.Inet4Address;
import java.net.UnknownHostException;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

import Stimuli.*;
import akka.actor.ActorRef;
import akka.actor.ActorSelection;
import akka.actor.ActorSystem;
import akka.actor.Props;

//import akka.kernel.Bootable;

public class ArtificeCreatureApp {

	public static void main(String[] args) throws InterruptedException {
		if (args.length == 0){
			startup(new String[] { "2551", "2552", "0" });
		} else
			startup(args);
	}

	public static void startup(String[] ports) throws InterruptedException {
		
		// Override the configuration of the port
		Config config = ConfigFactory.parseString(
				"akka.remote.netty.tcp.port=" + 2551).withFallback(
				ConfigFactory.load());

		ActorSystem creatureSystem = ActorSystem.create("ArtificeSystem", config);
		// ConfigFactory.load().getConfig("ArtificeRouter"));
		
		try {
			System.err.println("IP DA MAQUINA: " + Inet4Address.getLocalHost().getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ActorRef creature1 = creatureSystem.actorOf(
				Props.create(CreatureActor.class), "creature1");
		
		ActorSelection selection = creatureSystem.actorSelection("akka.tcp://ArtificeSystem@10.0.2.47:2552/user/cactus1");
		
		Thread.sleep(500);
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Sending touch stimulus to cactus!");
			selection.tell(new TouchStimulusMessage("toca ni mim"), creature1);
		}
		
//		ActorSelection selection = creatureSystem.actorSelection(
//				"akka.tcp://CactusSystem@10.0.2.47:2552/user/cactus1");
//
//		for (int i = 0; i < 20; i++) {
//			System.out.println("Sending touch stimulus to cactus!");
//			selection.tell(new TouchStimulusMessage("toca ni mim"), creature1);
//		}
		
//		ActorRef creature2 = creatureSystem.actorOf(
//				Props.create(CreatureActor.class), "creature2");
//		ActorRef creature3 = creatureSystem.actorOf(
//				Props.create(CreatureActor.class), "creature3");
//		ActorRef creature4 = creatureSystem.actorOf(
//				Props.create(CreatureActor.class), "creature4");
//		ActorRef creature5 = creatureSystem.actorOf(
//				Props.create(CreatureActor.class), "creature5");
//		ActorRef creature6 = creatureSystem.actorOf(
//				Props.create(CreatureActor.class), "creature6");
//		ActorRef creature7 = creatureSystem.actorOf(
//				Props.create(CreatureActor.class), "creature7");
//		ActorRef creature8 = creatureSystem.actorOf(
//				Props.create(CreatureActor.class), "creature8");
		
//		ActorRef listener = creatureSystem.actorOf(Props.create(ArtificeClusterListener.class), "listener");
		
//		for (int i = 0; i < 100000; i++) {
//			creature1.tell(new LuminousStimulusMessage(
//					"image of creature 2"), creature2);
//			creature2.tell(new LuminousStimulusMessage(
//					"~le image of a fruit!"), fruit);
//			cactus.tell(new TouchStimulusMessage("--touched--"), creature1);
//			fruit.tell(new DestructiveStimulusMessage("--touched again--"),
//					creature1);
//		}

	}
}
