package Stimuli;

public class EnergeticStimulusMessage extends StimulusMessage {
    private static int counter = 0;
    private final int touchSequenceNumber;

    public EnergeticStimulusMessage(String text) {
        super(text);
        this.touchSequenceNumber = counter;
        counter++;
    }

    public int getSequenceNumber() {
        return this.touchSequenceNumber;
    }

}
