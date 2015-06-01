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
}