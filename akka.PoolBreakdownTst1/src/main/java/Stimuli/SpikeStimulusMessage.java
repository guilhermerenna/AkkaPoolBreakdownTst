package Stimuli;

public class SpikeStimulusMessage extends StimulusMessage {
    private static int counter = 0;
    private final int spikeSequenceNumber;
    private String text;

    public SpikeStimulusMessage(String text) {
        super(text);
        this.spikeSequenceNumber = counter;
        counter++;
    }

    public int getSequenceNumber() {
        return this.spikeSequenceNumber;
    }

}
