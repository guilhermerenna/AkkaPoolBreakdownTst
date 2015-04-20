package Stimuli;

public class SmellStimulusMessage extends StimulusMessage {
	private static int counter = 0; 
	private final int smellSequenceNumber;
	
	public SmellStimulusMessage(String text) {
		super(text);
		this.smellSequenceNumber = counter;
		counter++;
	}
	
	public int getSequenceNumber() {
		return this.smellSequenceNumber;
	}

}
