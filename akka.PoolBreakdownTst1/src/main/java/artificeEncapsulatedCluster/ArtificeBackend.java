package artificeEncapsulatedCluster;

import akka.actor.ActorRef;
import akka.actor.TypedActor;
import akka.actor.TypedProps;
import akka.actor.UntypedActor;

/**
 * Created by artifice on 24/04/15.
 */
public class ArtificeBackend extends UntypedActor {
    private String name;
    private FruitActor f;
    private CactusActor b;

    public ArtificeBackend(String name) {
        this.name = name;
    }

    @Override
    public void onReceive(Object o) throws Exception {
        if (o.equals("createFruit")) {
            f = TypedActor.get(context().system()).typedActorOf(new TypedProps<FruitActorImpl>(FruitActor.class, FruitActorImpl.class), (name + ".fruit"));

            // Recupera um ActorRef para o Proxy (UntypedActor)
            ActorRef ref = TypedActor.get(context().system()).getActorRefFor(f);

            getSender().tell("created", ref);

        } else if (o.equals("createCactus")) {
            b = TypedActor.get(context().system()).typedActorOf(new TypedProps<CactusActorImpl>(CactusActor.class, CactusActorImpl.class), (name + ".cactus"));

            // Recupera um ActorRef para o Proxy (UntypedActor)
            ActorRef ref = TypedActor.get(context().system()).getActorRefFor(f);

            getSender().tell("created", ref);

        }
    }
}