package artificeEncapsulatedCluster;

public class CactusActorImpl implements CactusActor extends WorldObjectActor {

    private int x;
    private int y;
    private int z;

    public CactusActorImpl() {
        this.x = (int) (Math.random() * 10);
        this.y = (int) (Math.random() * 10);
    }

//	public CactusActorImpl(AtomicReference proxyVar, Function0 createInstance,
//			Seq interfaces) {
//		super(proxyVar, createInstance, interfaces);
//		// TODO Auto-generated constructor stub
//	}

//	@Override
//	public void onReceive(Object arg0) throws Exception {
//		if(arg0 instanceof LuminousStimulusMessage) {
//			System.out.println(this.getSelf().toString()+"A can see something! "+((LuminousStimulusMessage) arg0).getMessage()+"! Ref.: " + ((StimulusMessage) arg0).getSequenceNumber());
//		} else if(arg0 instanceof TouchStimulusMessage) {
//			System.out.println(this.getSelf().toString()+": "+getSender().toString()+" toched me! Spiking it back! =P Ref.: " + ((StimulusMessage) arg0).getSequenceNumber());
//			getSender().tell(new SpikeStimulusMessage("Don't touch me! I am a cactus!"),this.getSelf());
//			getSender().forward(new SpikeStimulusMessage("Don't touch me! I am a cactus!"),this.context());
//		} else if(arg0 instanceof StimulusMessage) {
//			System.out.println("Unknown stimulus received.\n"+((StimulusMessage)arg0).getMessage()+"\nDiscarding ref. " + ((StimulusMessage) arg0).getMessage());
//		} else {
//			throw new Exception("Message type not supported.");
//		}
//		
//	}

    public int getXPosition() {
        return this.x;
    }

    public int getYPosition() {
        return this.y;
    }

    public int getZPosition() { return this.z; }

}