package artificeEncapsulatedCluster;

import akka.actor.*;

/**
 * Created by artifice on 24/04/15.
 */
public class ArtificeBackend extends UntypedActor {
    private String name;
    //private FruitActor f;
    //private CactusActorImpl b;

    public ArtificeBackend(String name) {
        this.name = name;
    }

    @Override
    public void onReceive(Object o) throws Exception {
        if (o.equals("createFruit")) {
            ObjectSequentialNumber seq = ObjectSequentialNumber.getNextSuperKey();

            ActorRef fruit = context().actorOf(Props.create(FruitActorImpl.class, seq, 1, 1, 1), String.valueOf(seq.getKeySuper()));

        } else if (o.equals("createCactus")) {
            ObjectSequentialNumber seq = ObjectSequentialNumber.getNextSuperKey();

            ActorRef cactus = context().actorOf(Props.create(CactusActorImpl.class, seq, 1, 1, 1), String.valueOf(seq.getKeySuper()));

        }
    }
}