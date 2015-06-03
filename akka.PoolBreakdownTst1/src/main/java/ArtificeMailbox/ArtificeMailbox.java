package ArtificeMailbox;

import ArtificeMailbox.messageQueue.StimuliMessageQueue;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.dispatch.Envelope;
import akka.dispatch.MailboxType;
import akka.dispatch.MessageQueue;
import akka.dispatch.ProducesMessageQueue;
import com.typesafe.config.Config;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Queue;

import scala.Option;

public class ArtificeMailbox implements MailboxType,
        ProducesMessageQueue<StimuliMessageQueue> {

    // This constructor signature must exist, it will be called by Akka
    public ArtificeMailbox(ActorSystem.Settings settings, Config config) {
        // System.out.println("Initializing Mailbox...");
    }

    // The create method is called to create the MessageQueue
    public MessageQueue create(Option<ActorRef> owner, Option<ActorSystem> system) {
        // System.out.println("Creating StimuliMessageQueue...");
        return new StimuliMessageQueue();
    }
}