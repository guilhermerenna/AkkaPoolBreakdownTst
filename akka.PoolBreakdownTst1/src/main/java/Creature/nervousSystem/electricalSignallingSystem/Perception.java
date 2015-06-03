package Creature.nervousSystem.electricalSignallingSystem;

import akka.actor.ActorRef;

/**
 * Created by lsi on 01/06/15.
 */
public class Perception {

    private ActorRef target;
    private String state;
    private String seeing;
    private String smelling;
    private String expectance;
    private double distance;
    private String contactWith;
    private double angle;
    private String actionTendency;

    public Perception() {

    }

    public ActorRef getTarget() {
        return target;
    }

    public void setTarget(ActorRef target) {
        this.target = target;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSeeing() {
        return seeing;
    }

    public void setSeeing(String seeing) {
        this.seeing = seeing;
    }

    public String getSmelling() {
        return smelling;
    }

    public void setSmelling(String smelling) {
        this.smelling = smelling;
    }

    public String getExpectance() {
        return expectance;
    }

    public void setExpectance(String expectance) {
        this.expectance = expectance;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getContactWith() {
        return contactWith;
    }

    public void setContactWith(String contactWith) {
        this.contactWith = contactWith;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public String getActionTendency() {
        return actionTendency;
    }

    public void setActionTendency(String actionTendency) {
        this.actionTendency = actionTendency;
    }

}
