package Stimuli;

public class DestructiveStimulusMessage extends StimulusMessage {
	private static int counter = 0; 
	private final int destructiveSequenceNumber;
	
	public DestructiveStimulusMessage(String text) {
		super(text);
		this.destructiveSequenceNumber = counter;
		counter++;
	}
	
	public int getSequenceNumber() {
		return this.destructiveSequenceNumber;
	}

}
