package Creature;

import Stimuli.*;
import akka.actor.UntypedActor;

public class EyeActor extends UntypedActor {
	
	@Override
	public void onReceive(Object arg0) throws Exception {
		if(arg0 instanceof LuminousStimulusMessage) {
			System.out.println(this.getSelf().toString()+"A can see something! "+((LuminousStimulusMessage) arg0).getMessage()+"! Ref.: " + ((LuminousStimulusMessage) arg0).getSequenceNumber());
		} else if(arg0 instanceof StimulusMessage) {
			System.out.println(this.getSelf().toString()+"Unknown stimulus received.\n"+((StimulusMessage)arg0).getMessage()+"\nDiscarding ref. " + ((StimulusMessage) arg0).getMessage());
		} else {
			throw new Exception(this.getSelf().toString()+"Message type not supported.");
		}
		
	}

}
