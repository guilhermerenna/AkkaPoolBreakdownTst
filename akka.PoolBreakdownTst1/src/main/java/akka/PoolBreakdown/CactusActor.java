package akka.PoolBreakdown;

import Stimuli.*;
import akka.actor.UntypedActor;

public class CactusActor extends UntypedActor {
	
	@Override
	public void onReceive(Object arg0) throws Exception {
		if(arg0 instanceof LuminousStimulusMessage) {
			System.out.println(this.getSelf().toString()+"A can see something! "+((LuminousStimulusMessage) arg0).getMessage()+"! Ref.: " + ((StimulusMessage) arg0).getSequenceNumber());
		} else if(arg0 instanceof TouchStimulusMessage) {
			System.out.println(this.getSelf().toString()+": "+getSender().toString()+" toched me! Spiking it back! =P Ref.: " + ((StimulusMessage) arg0).getSequenceNumber());
			getSender().tell(new SpikeStimulusMessage("Don't touch me! I am a cactus!"),this.getSelf());
			getSender().forward(new SpikeStimulusMessage("Don't touch me! I am a cactus!"),this.context());
		} else if(arg0 instanceof StimulusMessage) {
			System.out.println("Unknown stimulus received.\n"+((StimulusMessage)arg0).getMessage()+"\nDiscarding ref. " + ((StimulusMessage) arg0).getMessage());
		} else {
			throw new Exception("Message type not supported.");
		}
		
	}

}
