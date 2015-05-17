package artificeCluster;

import Stimuli.StimulusMessage;
import akka.actor.UntypedActor;

import java.math.BigInteger;

//#backend
public class ArtificeBackend extends UntypedActor {

    @Override
    public void onReceive(Object message) {
        if (message instanceof StimulusMessage) {
            // TODO: what If Stimulus Received?
        } else if (message instanceof Integer) {
            // 1: add random new creature
            if (message.toString() == "1") {
                //TODO: nova criatura neste backend
                //context().actorOf(Props.create(CreatureActor.class), "artificeCreature");
                System.err.println("Backend: nova criatura gerada!");
            } else {
                System.err.println("Backend: Comando invalido!");
            }

//			final Integer n = (Integer) message;
//			Future<BigInteger> f = future(new Callable<BigInteger>() {
//				public BigInteger call() {
//					return factorial(n);
//				}
//			}, getContext().dispatcher());
//
//			Future<FactorialResult> result = f.map(
//					new Mapper<BigInteger, FactorialResult>() {
//						public FactorialResult apply(BigInteger factorial) {
//							return new FactorialResult(n, factorial);
//						}
//					}, getContext().dispatcher());
//
//			pipe(result, getContext().dispatcher()).to(getSender());

        } else {
            System.err.println("Backend: Recebida mensagem: unhandled!");
            unhandled(message);
        }
    }

    BigInteger factorial(int n) {
        System.err.println("Backend: calculando fatorial!");
        BigInteger acc = BigInteger.ONE;
        for (int i = 1; i <= n; ++i) {
            acc = acc.multiply(BigInteger.valueOf(i));
        }
        return acc;
    }
}
// #backend

