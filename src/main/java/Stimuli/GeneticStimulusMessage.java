package Stimuli;

public class GeneticStimulusMessage extends StimulusMessage {
	private static int counter = 0; 
	private final int geneticSequenceNumber;
	
	public GeneticStimulusMessage(String text) {
		super(text);
		this.geneticSequenceNumber = counter;
		counter++;
	}
	
	public int getSequenceNumber() {
		return this.geneticSequenceNumber;
	}

}
