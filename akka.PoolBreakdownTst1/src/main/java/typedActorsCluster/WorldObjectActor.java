package typedActorsCluster;

import akka.actor.ActorRef;
import akka.actor.UntypedActor;

import java.util.Random;

/**
 * Created by lsi on 20/05/15.
 */
public class WorldObjectActor extends UntypedActor implements WorldComponent {
    /**
     * Identifier of the object
     */
    private ActorRef objectSuperKey;

    /**
     * Auxiliary variables
     */
    public static Random generator = new Random();

    private double positionX;

    private double positionY;

    private double positionZ;

    private boolean remove;

    /**
     * Reference to artificial world. Used by objects that add new
     * world objects to the simulation.
     */
    private ArtificialWorld artificialWorld;

	/*TODO: check the consequences of the EnvStimuliPool removal */
    // private EnvStimuliPool env

    /**
     *  atributos visiveis deste componente e referencia para o pool da interface
     *  @deprecated
     */
    private LuminousStimulus myStimulus;

    public WorldObject(/* TODO: remover: EnvironmentalStimuliPool envEstimulPool,*/ double positionX, double positionY, double positionZ) {

        this.setRemove(false);
        // TODO: check the consequences of the setEnvStimuliPool(...) removal
        // this.setEnvSharedPool(envEstimulPool);
        this.setObjectSuperKey(ObjectSequentialNumber.getNextSuperKey());
        this.setPositionX(positionX);
        this.setPositionY(positionY);
        this.setPositionZ(positionZ);
    }

    public ActorRef getObjectSuperKey() {
        return objectSuperKey;
    }

    public void setObjectSuperKey(ObjectSequentialNumber mySequentialNumber) {
        this.objectSuperKey = mySequentialNumber;
    }


    // TODO: check the consequences of the getEnvSharedPool() removal
    // public EnvironmentalStimuliPool getEnvSharedPool() { return envSharedPool; }

    // TODO: check the consequences of the setEnvSharedPool(...) removal
    // public void setEnvSharedPool(EnvironmentalStimuliPool envSharedPool) { this.envSharedPool = envSharedPool; }

    /**
     * @return the 'remove'
     */
    public boolean isRemove() {
        return remove;
    }

    // TODO: check the consequences of the setRemove(...) removal
	/*
	 * This method set the 'remove'
	 * @param remove, is the new value
	 */
	/*public void setRemove(boolean remove) {
		this.remove = remove;
		setChanged();
		notifyObservers();
	}*/

    /**
     * @return the stimuli
     */
    public LuminousStimulus getMyStimulus() {
        return myStimulus;
    }







    /**
     * Substitui changeState
     * @param o
     * @throws Exception
     */
    @Override
    public void onReceive(Object o) throws Exception {

    }
}
