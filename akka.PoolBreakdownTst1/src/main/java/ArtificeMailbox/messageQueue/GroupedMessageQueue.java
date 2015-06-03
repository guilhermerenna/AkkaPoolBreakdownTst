package mailbox.messageQueue;

import akka.actor.ActorRef;
import akka.dispatch.Envelope;
import akka.dispatch.MessageQueue;
import mailbox.MyUnboundedMessageQueueSemantics;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class GroupedMessageQueue implements MessageQueue,
        MyUnboundedMessageQueueSemantics {

    private String hello = "";
    private String world = "";

    private String I = "";
    private String am = "";
    private String groot = "";

    private final Queue<Envelope> queue =
            new ConcurrentLinkedQueue<Envelope>();

    private List<String> text = new ArrayList<String>();

    public void enqueue(ActorRef receiver, Envelope handle) {
        if (handle.message() instanceof String) {
            String message = (String) handle.message();
            text.add((String) handle.message());
            // System.out.println("text added: "+handle.message());
        } else {
            queue.offer(handle);
        }
    }

    public Envelope dequeue() {
        if(queue.isEmpty()) {
            List<String> temp = text;
            text = new ArrayList<String>();
            // System.out.println("Dequeuing...");
            return new Envelope(temp,null);
        }
        else return queue.poll();
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