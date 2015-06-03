package Creature;

import Stimuli.*;
import akka.actor.UntypedActor;

public class MouthActor extends UntypedActor {

    @Override
    public void onReceive(Object arg0) throws Exception {
        if (arg0 instanceof SpikeStimulusMessage) {
            System.out.println(this.getSelf().toString() + "Ouch! A spike!" + getSender().toString() + " Ref.: " + ((SpikeStimulusMessage) arg0).getSequenceNumber());
        } else if (arg0 instanceof TickleStimulusMessage) {
            System.out.println(this.getSelf().toString() + "Tickle stimulus received. Ref.: " + ((TickleStimulusMessage) arg0).getSequenceNumber());
        } else if (arg0 instanceof EnergeticStimulusMessage) {
            System.out.println(this.getSelf().toString() + "Energetic stimulus received. Ref.: " + ((SpikeStimulusMessage) arg0).getSequenceNumber());
        } else if (arg0 instanceof MechanicalStimulusMessage) {
            System.out.println(this.getSelf().toString() + "Mechanical stimulus received. Ref.: " + ((MechanicalStimulusMessage) arg0).getSequenceNumber());
        } else if (arg0 instanceof StimulusMessage) {
            System.out.println(this.getSelf().toString() + "Unknown stimulus received.\n" + ((StimulusMessage) arg0).getMessage() + "\nDiscarding ref. " + ((StimulusMessage) arg0).getMessage());
        } else {
            throw new Exception(this.getSelf().toString() + "Message type not supported.");
        }

    }

}
