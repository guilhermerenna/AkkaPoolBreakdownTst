package artificeEncapsulatedCluster;

import Creature.nervousSystem.electricalSignallingSystem.electricalStimulus.*;
import akka.actor.ActorSelection;

import java.util.ArrayList;
import java.util.List;

public class CactusActor extends WorldObjectActor {


    public CactusActor(ObjectSequentialNumber number, double x, double y, double z) {
        super(number, x, y, z);
        context().parent().tell(number,self());
    }

    /**
     * Recebe um ArrayList com estímulos, processa, e retorna um ArrayList com outros estímulos.
     * @param o
     * @throws Exception
     */
    @Override
    public void onReceive(Object o) throws Exception {
        if(o instanceof List) {
            ArrayList<Stimulus> stimuli = (ArrayList) o;
            ArrayList<Stimulus> produced = new ArrayList<Stimulus>();

            for (Stimulus stimulus : stimuli) {
                if (stimulus instanceof TouchStimulus) {
                    Stimulus spike = new ShockStimulus(getSequentialNumber(), stimulus.getEmitterComponent());
                    produced.add(spike);
                } else {
                    // TODO: Se o estímulo for mecânico ou visual, faz alguma coisa?
                }
            }
            sendStimuli(produced);
        } else {
            System.out.println("Received message is not supported.");
        }
    }

    public void sendStimuli(List<Stimulus> stimuli) {
        for (Stimulus stimulus : stimuli) {
            //String s = "//creatures/1/1";

            ActorSelection ref = context().system().actorSelection(String.format("akka.tcp://ArtificeSystem@127.0.0.1:2552/creatures/%d/%d",
                    stimulus.getTarget().getKeySuper(), stimulus.getTarget().getSequential()));

            ref.tell(stimulus, getSelf());
        }
    }
}