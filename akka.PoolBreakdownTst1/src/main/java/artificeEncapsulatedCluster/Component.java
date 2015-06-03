package artificeEncapsulatedCluster;

import Creature.nervousSystem.electricalSignallingSystem.electricalStimulus.Stimulus;

import java.util.ArrayList;

/**
 * Created by lsi on 29/05/15.
 */
public interface Component {

    /**
     * Method responsible for feeling stimuli.
     *
     * @return
     */
    public ArrayList<Stimulus> feelStimuli();

    /**
     * Method responsible for change the component state.
     *
     * @param feltStimulli
     * @return
     */
    public ArrayList<Stimulus> changeState(ArrayList<Stimulus> feltStimuli);

    /**
     * Method responsible for send the produced stimuli
     *
     * @return
     */
    public void sendStimuli(ArrayList<Stimulus> producedStimuli);
}
