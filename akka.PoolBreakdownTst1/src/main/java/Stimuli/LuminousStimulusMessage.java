package Stimuli;

public class LuminousStimulusMessage extends StimulusMessage {
	private static int counter = 0; 
	private final int luminousSequenceNumber;
	
	public LuminousStimulusMessage(String text) {
		super(text);
		this.luminousSequenceNumber = counter;
		counter++;
	}
	
	public int getSequenceNumber() {
		return this.luminousSequenceNumber;
	}

}
