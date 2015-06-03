package ArtificeMailbox.messageQueue;

import Creature.nervousSystem.electricalSignallingSystem.electricalStimulus.Stimulus;
import akka.actor.ActorRef;
import akka.dispatch.Envelope;
import akka.dispatch.MessageQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class StimuliMessageQueue implements MessageQueue,
        ArtificeMessageQueueSemantics {

    private final Queue<Envelope> queue =
            new ConcurrentLinkedQueue<Envelope>();

    private List<String> text = new ArrayList<String>();
    private List<Stimulus> stimuli = new ArrayList<Stimulus>();

    /**
     * Produtor de mensagens da mailbox. Disparado quando chega uma nova mensagem. Se chegar uma mensagem contendo um estimulo, ela vai pro ArrayList. Caso contrario, vai para a <i>queue</i>.
     *
     * @param receiver Referencia para o remetente.
     * @param handle   Mensagem fechada.
     */
    public void enqueue(ActorRef receiver, Envelope handle) {
        /*if (handle.message() instanceof String) {
            String message = (String) handle.message();
            text.add((String) handle.message());
            // System.out.println("text added: "+handle.message());
        } else */
        if (handle.message() instanceof Stimulus) {
            Stimulus stimulus = (Stimulus) handle.message();
            stimuli.add((Stimulus) handle.message());
        } else {
            queue.offer(handle);
        }
    }

    /**
     * Consumidor de mensagens da mailbox. Disparado quando o Ator verifica se há mensagem.
     * @return Se houver algum estimulo no ArrayList, retorna o ArrayList e cria um novo ArrayList limpo. Se o ArrayList estiver limpo, retorna o primeiro elemento da fila, se houver.
     */
    public Envelope dequeue() {
        if (!stimuli.isEmpty()) {
            List<Stimulus> temp = stimuli;
            stimuli = new ArrayList<Stimulus>();
            // System.out.println("Dequeuing...");
            return new Envelope(temp, null);
        } else return queue.poll();
    }

    public int numberOfMessages() {
        return queue.size();
    }

    public boolean hasMessages() {
        return !queue.isEmpty();
    }

    public void cleanUp(ActorRef owner, MessageQueue deadLetters) {
        for (Envelope handle : queue) {
            deadLetters.enqueue(owner, handle);
        }
    }
}