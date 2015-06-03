package artificeEncapsulatedCluster;

import java.io.Serializable;
import java.util.Hashtable;

/**
 * @author Luciana Maria de Assis Campos
 */
public class ObjectSequentialNumber implements Serializable {
    private static final long serialVersionUID = -6565155363060088736L;

    private static Hashtable<Integer, Integer> objectSequentialNumberController = new Hashtable<Integer, Integer>();

    private static int lastSuperKey = 0;

    private int keySuper;

    private int sequential;

    public ObjectSequentialNumber(int superkey, int sequential) {
        setKeySuper(superkey);
        setSequential(sequential);
    }

    public ObjectSequentialNumber() {
        setKeySuper(0);
        setSequential(0);
    }

    /**
     * Create identifiers for superclass objects.
     *
     * @return ObjectSequentialNumber
     */
    public synchronized static ObjectSequentialNumber getNextSuperKey() {

        lastSuperKey++;

        objectSequentialNumberController.put(lastSuperKey, 0);

        return new ObjectSequentialNumber(lastSuperKey, 0);
    }

    /**
     * Create identifiers for subclass, which pass to superclass.
     *
     * @param superObjectSequentialNumber
     * @return
     */
    public synchronized static ObjectSequentialNumber getNextSequentialNumber(
            ObjectSequentialNumber superObjectSequentialNumber) {

        int superKey = superObjectSequentialNumber.getKeySuper();
        int superSequentialNumber = objectSequentialNumberController
                .get(superKey) + 1;

        objectSequentialNumberController.put(superKey, superSequentialNumber);

        return new ObjectSequentialNumber(superKey, superSequentialNumber);
    }

    public int getKeySuper() {
        return keySuper;
    }

    public void setKeySuper(int keySuper) {
        this.keySuper = keySuper;
    }

    public int getSequential() {
        return sequential;
    }

    public void setSequential(int sequential) {
        this.sequential = sequential;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + keySuper;
        result = prime * result + sequential;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ObjectSequentialNumber other = (ObjectSequentialNumber) obj;
        if (keySuper != other.keySuper)
            return false;
        if (sequential != other.sequential)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return getKeySuper() + ":" + getSequential();
    }
}
