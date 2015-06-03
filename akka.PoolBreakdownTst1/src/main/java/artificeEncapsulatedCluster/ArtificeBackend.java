package artificeEncapsulatedCluster;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.UntypedActor;

/**
 * Created by artifice on 24/04/15.
 */
public class ArtificeBackend extends UntypedActor {
    private String name;
    private ActorRef fruit;
    private ActorRef cactus;
    private ActorRef creature;

    public ArtificeBackend(String name) {
        this.name = name;
    }

    public void preStart() {

        // Creating fruit...
        ObjectSequentialNumber seq = ObjectSequentialNumber.getNextSuperKey();
        fruit = context().actorOf(Props.create(FruitActorImpl.class, seq, 1, 1, 1), String.valueOf(seq.getKeySuper()));

        // Creating cactus...
        seq = ObjectSequentialNumber.getNextSuperKey();
        cactus = context().actorOf(Props.create(CactusActor.class, seq, 1, 1, 1), String.valueOf(seq.getKeySuper()));

        // Creating creature...
        seq = ObjectSequentialNumber.getNextSuperKey();
        creature = context().actorOf(Props.create(CreatureActor.class, seq, 1, 1, 1), String.valueOf(seq.getKeySuper()));
    }

    @Override
    public void onReceive(Object o) throws Exception {
        if(o.equals("spike creature *")) {
            creature.tell(new Stimulus(),);
        }
    }
}