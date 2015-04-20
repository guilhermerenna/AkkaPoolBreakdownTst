package Stimuli;

import java.io.Serializable;

public abstract	class StimulusMessage implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int counter = 0; 
	private final int sequenceNumber;
	private String text;
	
	public StimulusMessage(String text) {
		this.text = text;
		this.sequenceNumber = counter;
		counter++;
	}

	public String getMessage() {
		return this.text;
	}
	
	public int getSequenceNumber() {
		return this.sequenceNumber;
	}

}
