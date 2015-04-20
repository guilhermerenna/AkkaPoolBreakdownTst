package Stimuli;

import java.io.Serializable;

public final class TouchStimulusMessage extends StimulusMessage {
	private static int counter = 0; 
	private final int energeticSequenceNumber;
	
	public TouchStimulusMessage(String text) {
		super(text);
		this.energeticSequenceNumber = counter;
		counter++;
	}
	
	public int getSequenceNumber() {
		return this.energeticSequenceNumber;
	}

}