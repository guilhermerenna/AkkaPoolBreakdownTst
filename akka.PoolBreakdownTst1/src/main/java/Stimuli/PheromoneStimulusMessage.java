package Stimuli;

public class PheromoneStimulusMessage extends StimulusMessage {
    private static int counter = 0;
    private final int pheromoneSequenceNumber;

    public PheromoneStimulusMessage(String text) {
        super(text);
        this.pheromoneSequenceNumber = counter;
        counter++;
    }

    public int getSequenceNumber() {
        return this.pheromoneSequenceNumber;
    }

}
