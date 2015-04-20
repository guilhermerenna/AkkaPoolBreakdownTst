package Stimuli;

public class MechanicalStimulusMessage extends StimulusMessage {
	private static int counter = 0; 
	private final int mechanicalSequenceNumber;
	
	public MechanicalStimulusMessage(String text) {
		super(text);
		this.mechanicalSequenceNumber = counter;
		counter++;
	}
	
	public int getSequenceNumber() {
		return this.mechanicalSequenceNumber;
	}

}
