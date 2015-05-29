package artificeEncapsulatedCluster;

import akka.actor.*;

//#frontend
public class ArtificeFrontend extends UntypedActor {
    private ActorRef backend1 = context().system().actorOf(Props.create(ArtificeBackend.class, "backend1"), "backend1");
    private ActorRef backend2 = context().system().actorOf(Props.create(ArtificeBackend.class, "backend2"), "backend2");
    private ActorRef backend3 = context().system().actorOf(Props.create(ArtificeBackend.class, "backend3"), "backend3");

//  LoggingAdapter log = Logging.getLogger(getContext().system(), this);
//
//  //Roteador de backends
//  ActorRef backend = getContext().actorOf(FromConfig.getInstance().props(),
//      "artificeBackendRouter");

    public ArtificeFrontend() {
//    this.upToN = upToN;
//    this.repeat = repeat;
    }

    @Override
    public void preStart() throws Exception {
        backend1.tell("createFruit", getSelf());
        backend2.tell("createFruit", getSelf());
        backend3.tell("createFruit", getSelf());
    }

    @Override
    public void onReceive(Object o) throws Exception {
        if (o.equals("created")) {
            System.out.println("Created");

            // Recupera o Proxy (UntypedActor) para o ActorRef
            FruitActor c = TypedActor.get(context().system()).typedActorOf(new TypedProps<FruitActor>(FruitActor.class), getSender());

            System.out.println(getSender());

            System.out.println(c.getXPosition() + ", " + c.getYPosition());
        }
    }

}
//#frontend
