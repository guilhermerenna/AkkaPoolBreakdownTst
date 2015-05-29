package artificeEncapsulatedCluster;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class TypedActorsClusterApp {
    public static void main(String[] args) {

        ActorSystem s = ActorSystem.create("System");

        ActorRef frontend = s.actorOf(Props.create(ArtificeFrontend.class), "frontend");


    }

}