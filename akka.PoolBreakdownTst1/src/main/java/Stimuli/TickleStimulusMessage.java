package Stimuli;

public class TickleStimulusMessage extends StimulusMessage {
	private static int counter = 0; 
	private final int tickleSequenceNumber;
	
	public TickleStimulusMessage(String text) {
		super(text);
		this.tickleSequenceNumber = counter;
		counter++;
	}
	
	public int getSequenceNumber() {
		return this.tickleSequenceNumber;
	}

}
