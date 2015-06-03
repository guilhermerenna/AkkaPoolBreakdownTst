package Creature;

import Stimuli.PheromoneStimulusMessage;
import Stimuli.SmellStimulusMessage;
import Stimuli.StimulusMessage;
import akka.actor.UntypedActor;

public class NoseActor extends UntypedActor {
    private MouthActor mouth;
    private NoseActor nose;

    @Override
    public void onReceive(Object arg0) throws Exception {
        if (arg0 instanceof SmellStimulusMessage) {
            System.out.println(this.getSelf().toString() + "Sniff! Smell stimulus received! Ref.: " + ((SmellStimulusMessage) arg0).getSequenceNumber());
        } else if (arg0 instanceof PheromoneStimulusMessage) {
            System.out.println(this.getSelf().toString() + "Pheromone stimulus received. Ref.: " + ((PheromoneStimulusMessage) arg0).getSequenceNumber());
        } else if (arg0 instanceof StimulusMessage) {
            System.out.println(this.getSelf().toString() + "Unknown stimulus received.\n" + ((StimulusMessage) arg0).getMessage() + "\nDiscarding ref. " + ((StimulusMessage) arg0).getMessage());
        } else {
            throw new Exception(this.getSelf().toString() + "Message type not supported.");
        }

    }

}
