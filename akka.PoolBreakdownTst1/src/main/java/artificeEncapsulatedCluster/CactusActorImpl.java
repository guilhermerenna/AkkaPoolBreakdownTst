package artificeEncapsulatedCluster;

import Creature.nervousSystem.electricalSignallingSystem.electricalStimulus.ShockStimulus;
import Creature.nervousSystem.electricalSignallingSystem.electricalStimulus.Stimulus;
import Creature.nervousSystem.electricalSignallingSystem.electricalStimulus.TouchStimulus;
import Stimuli.StimulusMessage;
import Stimuli.TouchStimulusMessage;
import akka.actor.ActorSelection;


import java.util.ArrayList;
import java.util.List;

public class CactusActorImpl extends WorldObjectActor  {


    public CactusActorImpl(ObjectSequentialNumber number, double x, double y, double z) {
        super(number, x, y, z);
    }

    @Override
    public void onReceive(Object o) throws Exception {
        ArrayList<Stimulus> stimuli = (ArrayList) o;
        ArrayList<Stimulus> produced = new ArrayList<Stimulus>();

        for(Stimulus stimulus : stimuli) {
            if(stimulus instanceof TouchStimulus) {
                Stimulus spike = new ShockStimulus(getSequentialNumber(), stimulus.getEmitterComponent());
                produced.add(spike);
            }
        }

        sendStimuli(produced);
    }

    public void sendStimuli(List<Stimulus> stimuli) {
        for(Stimulus stimulus : stimuli) {
            //String s = "//creatures/1/1";

            ActorSelection ref = context().system().actorSelection(String.format("akka.tcp://ArtificeSystem@127.0.0.1:2552/creatures/%d/%d",
                    stimulus.getTarget().getKeySuper(), stimulus.getTarget().getSequential()));

            ref.tell(stimulus, getSelf());
        }
    }

    //	public CactusActorImpl(AtomicReference proxyVar, Function0 createInstance,
//			Seq interfaces) {
//		super(proxyVar, createInstance, interfaces);
//		// TODO Auto-generated constructor stub
//	}

//	@Override
//	public void onReceive(Object arg0) throws Exception {
//		if(arg0 instanceof LuminousStimulusMessage) {
//			System.out.println(this.getSelf().toString()+"A can see something! "+((LuminousStimulusMessage) arg0).getMessage()+"! Ref.: " + ((StimulusMessage) arg0).getSequenceNumber());
//		} else if(arg0 instanceof TouchStimulusMessage) {
//			System.out.println(this.getSelf().toString()+": "+getSender().toString()+" toched me! Spiking it back! =P Ref.: " + ((StimulusMessage) arg0).getSequenceNumber());
//			getSender().tell(new SpikeStimulusMessage("Don't touch me! I am a cactus!"),this.getSelf());
//			getSender().forward(new SpikeStimulusMessage("Don't touch me! I am a cactus!"),this.context());
//		} else if(arg0 instanceof StimulusMessage) {
//			System.out.println("Unknown stimulus received.\n"+((StimulusMessage)arg0).getMessage()+"\nDiscarding ref. " + ((StimulusMessage) arg0).getMessage());
//		} else {
//			throw new Exception("Message type not supported.");
//		}
//
//	}
}