package typedActorsCluster;

import Creature.EyeActor;
import Creature.MouthActor;
import Creature.NoseActor;
import Stimuli.*;
import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.UntypedActor;
import akka.routing.RoundRobinRouter;

public class CreatureActor extends UntypedActor {
    private final ActorRef mouth = getContext().actorOf(Props.create(MouthActor.class).withRouter(new RoundRobinRouter(5)), "mouth");
    private final ActorRef nose = getContext().actorOf(Props.create(NoseActor.class).withRouter(new RoundRobinRouter(5)), "nose");
    private final ActorRef eye = getContext().actorOf(Props.create(EyeActor.class).withRouter(new RoundRobinRouter(5)), "eye");

    public void preStart() {
        // TODO
    }

    @Override
    public void onReceive(Object arg0) throws Exception {


        if (arg0 instanceof SmellStimulusMessage) {
            System.out.println("Smell stimulus received. Forwarding to nose... Ref.: " + ((StimulusMessage) arg0).getSequenceNumber());
            nose.tell(arg0, getSender());
        } else if (arg0 instanceof LuminousStimulusMessage) {
            System.out.println(this.getSelf().toString() + ": Luminous stimulus received. Forwarding to eye... Ref.: " + ((StimulusMessage) arg0).getSequenceNumber());
            eye.tell(arg0, getSender());
        } else if (arg0 instanceof PheromoneStimulusMessage) {
            System.out.println(this.getSelf().toString() + ": Pheromone stimulus received. Forwarding to nose... Ref.: " + ((StimulusMessage) arg0).getSequenceNumber());
            nose.tell(arg0, getSender());
        } else if (arg0 instanceof SpikeStimulusMessage) {
            System.out.println(this.getSelf().toString() + ": Spike stimulus received. Forwarding to mouth... Ref.: " + ((StimulusMessage) arg0).getSequenceNumber());
            mouth.tell(arg0, getSender());
        } else if (arg0 instanceof TickleStimulusMessage) {
            System.out.println(this.getSelf().toString() + ": Tickle stimulus received. Forwarding to mouth... Ref.: " + ((StimulusMessage) arg0).getSequenceNumber());
            mouth.tell(arg0, getSender());
        } else if (arg0 instanceof EnergeticStimulusMessage) {
            System.out.println(this.getSelf().toString() + ": Energetic stimulus received. Forwarding to mouth... Ref.: " + ((StimulusMessage) arg0).getSequenceNumber());
            mouth.tell(arg0, getSender());
        } else if (arg0 instanceof MechanicalStimulusMessage) {
            System.out.println(this.getSelf().toString() + ": Mechanical stimulus received. Forwarding to mouth... Ref.: " + ((StimulusMessage) arg0).getSequenceNumber());
            mouth.tell(arg0, getSender());
        } else if (arg0 instanceof StimulusMessage) {
            System.out.println(this.getSelf().toString() + ": Unknown stimulus received from " + getSender().toString() + ".\n" + ((StimulusMessage) arg0).getMessage() + "\nDiscarding... Ref.: " + ((StimulusMessage) arg0).getSequenceNumber());
        } else if (arg0 instanceof String) {
            System.out.println("Text message received: " + arg0.toString());
        } else {
            throw new Exception(this.getSelf().toString() + ": Message type not supported.");
        }

    }

}
