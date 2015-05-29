package artificeEncapsulatedCluster;

import Creature.nervousSystem.electricalSignallingSystem.electricalStimulus.Stimulus;
import akka.actor.ActorRef;
import akka.actor.UntypedActor;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by lsi on 20/05/15.
 */
public abstract class WorldObjectActor extends UntypedActor {
    /**
     * Identifier of the object
     */
    private ObjectSequentialNumber sequentialNumber;

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
    //private ArtificialWorld artificialWorld;

	/*TODO: check the consequences of the EnvStimuliPool removal */
    // private EnvStimuliPool env

    /**
     *  atributos visiveis deste componente e referencia para o pool da interface
     *  @deprecated
     */
    //private LuminousStimulus myStimulus;

    public WorldObjectActor(ObjectSequentialNumber number, double positionX, double positionY, double positionZ) {
    }

    public ObjectSequentialNumber getSequentialNumber() {
        return sequentialNumber;
    }

    public void setSequentialNumber(ObjectSequentialNumber sequentialNumber) {
        this.sequentialNumber = sequentialNumber;
    }

    public double getPositionX() {
        return positionX;
    }

    public void setPositionX(double positionX) {
        this.positionX = positionX;
    }

    public double getPositionY() {
        return positionY;
    }

    public void setPositionY(double positionY) {
        this.positionY = positionY;
    }

    public double getPositionZ() {
        return positionZ;
    }

    public void setPositionZ(double positionZ) {
        this.positionZ = positionZ;
    }

    public boolean isRemove() {
        return remove;
    }

    public void setRemove(boolean remove) {
        this.remove = remove;
    }
}
