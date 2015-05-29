package artificeEncapsulatedCluster;

public class FruitActorImpl implements FruitActor {

    private int x;
    private int y;

    public FruitActorImpl() {
        this.x = (int) (Math.random() * 10);
        this.y = (int) (Math.random() * 10);
    }

    public int getXPosition() {
        return this.x;
    }

    public int getYPosition() {
        // TODO Auto-generated method stub
        return this.y;
    }

//	@Override
//	public void onReceive(Object arg0) throws Exception {
//		if(arg0 instanceof LuminousStimulusMessage) {
//			System.out.println(this.getSelf().toString()+"A can see something! "+((LuminousStimulusMessage) arg0).getMessage()+"! Ref.: " + ((StimulusMessage) arg0).getSequenceNumber());
//		} else if(arg0 instanceof TouchStimulusMessage) {
//			System.out.println(this.getSelf().toString()+": "+getSender().toString()+" toched me! Ref.: " + ((StimulusMessage) arg0).getSequenceNumber());
//		} else if(arg0 instanceof DestructiveStimulusMessage) {
//			System.out.println(this.getSelf().toString()+"Destructive stimulus?! Bye, bye, world! Ref.: " + ((StimulusMessage) arg0).getSequenceNumber());
//			//TODO destruct itself.
//			try {
//				this.finalize();
//			} catch (Throwable e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		} else if(arg0 instanceof StimulusMessage) {
//			System.out.println("Unknown stimulus received.\n"+((StimulusMessage)arg0).getMessage()+"\nDiscarding ref. " + ((StimulusMessage) arg0).getMessage());
//		} else {
//			throw new Exception("Message type not supported.");
//		}
//		
//	}

}
