package Creature.nervousSystem.electricalSignallingSystem;

import akka.actor.ActorRef;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 * Created by lsi on 28/05/15.
 */
public class CurrentStimulus {
    private ActorRef emmiterComponent;

    private ArrayList<Perception> conjunto;

    //////////////////////
    private String action;
    private String affect;
    //////////////////////

    private double angle;
    private double apathy;
    private double apathyNew;
    private double apathyOld;
    private double arousal;

    private double calory;
    private int chooseExperience;
    private String complexAffect;
    private String contactWith;
    private double curiosity;
    private double delta;
    private double deltaShock;
    private double direction;
    private double distance;
    private boolean eat;
    private String eated;
    private String emmiter;
    private String emotion;
    private String emotionAssociate;
    private double expectancy;
    private double fear;
    private double fertility;
    private int focus;
    private double hunger;
    private int numberObjects;
    private String objectsNumber;
    private String origin;
    private double pain;
    private int perception;
    private String possibleActions;
    private boolean play;
    private String played;
    private String salivation;
    private String seeing;
    private double sleep;
    private String smelling;
    private double startAngle;
    private double speed;
    private int stimulus;
    private double stress;
    private double stressNew;
    private double stressOld;
    private String target;
    private String targetComponent;
    private int task;
    private double taskComplexityDegree;
    private double tedium;
    private boolean touch;
    private String touched;
    private double value;
    private String vendo;

    private boolean salivating;
    private boolean shocked;

    public static final int INVALID_VALUE = Integer.MIN_VALUE;

    private Hashtable<String, String> c;

    public CurrentStimulus() {

        emmiterComponent = null;

        conjunto = new ArrayList<Perception>();

        c = new Hashtable<String, String>();

        action = null;
        affect = null;
        angle = 0;
        apathy = INVALID_VALUE;
        apathyNew = INVALID_VALUE;
        apathyOld = INVALID_VALUE;
        arousal = INVALID_VALUE;
        calory = INVALID_VALUE;
        chooseExperience = 0;
        complexAffect = null;
        //ContactWith n�o pode ser null deve ser NOTHING
        contactWith = "NOTHING";
        curiosity = INVALID_VALUE;
        delta = INVALID_VALUE;
        deltaShock = INVALID_VALUE;
        direction = INVALID_VALUE;
        distance = INVALID_VALUE;
        eat = false;
        eated = null;
        emmiter = null;
        emotion = null;
        emotionAssociate = null;
        expectancy = INVALID_VALUE;
        fear = INVALID_VALUE;
        fertility = INVALID_VALUE;
        focus = INVALID_VALUE;
        hunger = INVALID_VALUE;
        numberObjects = 0;
        objectsNumber = null;
        origin = null;
        pain = INVALID_VALUE;
        perception = INVALID_VALUE;
        possibleActions = null;
        play = false;
        played = null;
        salivation = null;
        //Seeing n�o pode ser null deve ser NOBODY
        seeing = "NOBODY";
        sleep = INVALID_VALUE;
        startAngle = INVALID_VALUE;
        speed = INVALID_VALUE;
        stimulus = INVALID_VALUE;
        stress = INVALID_VALUE;
        stressNew = INVALID_VALUE;
        stressOld = INVALID_VALUE;
        target = null;
        targetComponent = null;
        task = INVALID_VALUE;
        taskComplexityDegree = 0;
        tedium = INVALID_VALUE;
        touch = false;
        touched = null;
        value = INVALID_VALUE;
        vendo = null;
        salivating = false;
        shocked = false;
    }

    public boolean isSalivating() {
        return salivating;
    }

    public void setSalivating(boolean salivating) {
        this.salivating = salivating;
    }

    public boolean isShocked() {
        return shocked;
    }

    public void setShocked(boolean shocked) {
        this.shocked = shocked;
    }

    /**
     *
     * @return
     */
    public synchronized Hashtable<String, String> getC() {
        return c;
    }

    /**
     *
     * @param c
     */
    public synchronized void setC(Hashtable<String, String> c) {
        this.c = c;
    }

    /**
     *
     * @return
     */
    public synchronized ActorRef getEmmiterComponent() {
        return emmiterComponent;
    }

    /**
     *
     * @param emmiterComponent
     */
    public synchronized void setEmmiterComponent(
            ActorRef emmiterComponent) {
        this.emmiterComponent = emmiterComponent;
    }

    /**
     *
     * @return
     */
    public synchronized ArrayList<Perception> getConjunto() {
        return conjunto;
    }

    /**
     *
     * @param conjunto
     */
    public synchronized void setConjunto(ArrayList<Perception> conjunto) {
        this.conjunto = conjunto;
    }

    /**
     *
     * @return
     */
    public synchronized String getAction() {
        return action;
    }

    /**
     *
     * @param action
     */
    public synchronized void setAction(String action) {
        this.action = action;
    }

    public synchronized String getAffect() {
        return affect;
    }

    public synchronized void setAffect(String affect) {
        this.affect = affect;
    }

    public synchronized double getAngle() {
        return angle;
    }

    public synchronized void setAngle(double angle) {
        this.angle = angle;
    }

    public synchronized double getApathy() {
        return apathy;
    }

    public synchronized void setApathy(double apathy) {
        this.apathy = apathy;
    }

    public synchronized double getApathyNew() {
        return apathyNew;
    }

    public synchronized void setApathyNew(double apathyNew) {
        this.apathyNew = apathyNew;
    }

    public synchronized double getApathyOld() {
        return apathyOld;
    }

    public synchronized void setApathyOld(double apathyOld) {
        this.apathyOld = apathyOld;
    }

    public synchronized double getArousal() {
        return arousal;
    }

    public synchronized void setArousal(double arousal) {
        this.arousal = arousal;
    }

    public synchronized double getCalory() {
        return calory;
    }

    public synchronized void setCalory(double calory) {
        this.calory = calory;
    }

    public synchronized int getChooseExperience() {
        return chooseExperience;
    }

    public synchronized void setChooseExperience(int chooseExperience) {
        this.chooseExperience = chooseExperience;
    }

    public synchronized String getComplexAffect() {
        return complexAffect;
    }

    public synchronized void setComplexAffect(String complexAffect) {
        this.complexAffect = complexAffect;
    }

    public synchronized String getContactWith() {
        return contactWith;
    }

    public synchronized void setContactWith(String contactWith) {
        this.contactWith = contactWith;
    }

    public synchronized double getCuriosity() {
        return curiosity;
    }

    public synchronized void setCuriosity(double curiosity) {
        this.curiosity = curiosity;
    }

    public synchronized double getDelta() {
        return delta;
    }

    public synchronized void setDelta(double delta) {
        this.delta = delta;
    }

    public synchronized double getDeltaShock() {
        return deltaShock;
    }

    public synchronized void setDeltaShock(double deltaShock) {
        this.deltaShock = deltaShock;
    }

    public synchronized double getDirection() {
        return direction;
    }

    public synchronized void setDirection(double direction) {
        this.direction = direction;
    }

    public synchronized double getDistance() {
        return distance;
    }

    public synchronized void setDistance(double distance) {
        this.distance = distance;
    }

    public synchronized boolean getEat() {
        return eat;
    }

    public synchronized void setEat(boolean eat) {
        this.eat = eat;
    }

    public synchronized String getEated() {
        return eated;
    }

    public synchronized void setEated(String eated) {
        this.eated = eated;
    }

    public synchronized String getEmitter() {
        return emmiter;
    }

    public synchronized void setEmitter(String emmiter) {
        this.emmiter = emmiter;
    }

    public synchronized String getEmotion() {
        return emotion;
    }

    public synchronized void setEmotion(String emotion) {
        this.emotion = emotion;
    }

    public synchronized String getEmotionAssociate() {
        return emotionAssociate;
    }

    public synchronized void setEmotionAssociate(String emotionAssociate) {
        this.emotionAssociate = emotionAssociate;
    }

    public synchronized double getExpectancy() {
        return expectancy;
    }

    public synchronized void setExpectancy(double expectancy) {
        this.expectancy = expectancy;
    }

    public synchronized double getFear() {
        return fear;
    }

    public synchronized void setFear(double fear) {
        this.fear = fear;
    }

    public double getFertility() {
        return fertility;
    }

    public void setFertility(double fertility) {
        this.fertility = fertility;
    }

    public synchronized int getFocus() {
        return focus;
    }

    public synchronized void setFocus(int focus) {
        this.focus = focus;
    }

    public synchronized double getHunger() {
        return hunger;
    }

    public synchronized void setHunger(double hunger) {
        this.hunger = hunger;
    }

    public synchronized int getNumberObjects() {
        return numberObjects;
    }

    public synchronized void setNumberObjects(int numberObjects) {
        this.numberObjects = numberObjects;
    }

    public synchronized String getObjectsNumber() {
        return objectsNumber;
    }

    public synchronized void setObjectsNumber(String objectsNumber) {
        this.objectsNumber = objectsNumber;
    }

    public synchronized String getOrigin() {
        return origin;
    }

    public synchronized void setOrigin(String origin) {
        this.origin = origin;
    }

    public synchronized double getPain() {
        return pain;
    }

    public synchronized void setPain(double pain) {
        this.pain = pain;
    }

    public synchronized int getPerception() {
        return perception;
    }

    public synchronized void setPerception(int perception) {
        this.perception = perception;
    }

    public synchronized String getPossibleActions() {
        return possibleActions;
    }

    public synchronized void setPossibleActions(String possibleActions) {
        this.possibleActions = possibleActions;
    }

    public synchronized boolean getPlay() {
        return play;
    }

    public synchronized void setPlay(boolean play) {
        this.play = play;
    }

    public synchronized String getPlayed() {
        return played;
    }

    public synchronized void setPlayed(String played) {
        this.played = played;
    }

    public synchronized String getSalivation() {
        return salivation;
    }

    public synchronized void setSalivation(String salivation) {
        this.salivation = salivation;
    }

    public synchronized String getSeeing() {
        return seeing;
    }

    public synchronized void setSeeing(String seeing) {
        this.seeing = seeing;
    }

    public synchronized double getSleep() {
        return sleep;
    }

    public synchronized void setSleep(double sleep) {
        this.sleep = sleep;
    }

    public synchronized double getStartAngle() {
        return startAngle;
    }

    public synchronized void setStartAngle(double startAngle) {
        this.startAngle = startAngle;
    }

    public synchronized double getSpeed() {
        return speed;
    }

    public synchronized void setSpeed(double speed) {
        this.speed = speed;
    }

    public synchronized int getStimulus() {
        return stimulus;
    }

    public synchronized void setStimulus(int stimulus) {
        this.stimulus = stimulus;
    }

    public synchronized double getStress() {
        return stress;
    }

    public synchronized void setStress(double stress) {
        this.stress = stress;
    }

    public synchronized double getStressNew() {
        return stressNew;
    }

    public synchronized void setStressNew(double stressNew) {
        this.stressNew = stressNew;
    }

    public synchronized double getStressOld() {
        return stressOld;
    }

    public synchronized void setStressOld(double stressOld) {
        this.stressOld = stressOld;
    }

    public synchronized String getTarget() {
        return target;
    }

    public synchronized void setTarget(String target) {
        this.target = target;
    }

    public synchronized String getTargetComponent() {
        return targetComponent;
    }

    public synchronized void setTargetComponent(String targetComponent) {
        this.targetComponent = targetComponent;
    }

    public synchronized int getTask() {
        return task;
    }

    public synchronized void setTask(int task) {
        this.task = task;
    }

    public synchronized double getTaskComplexityDegree() {
        return taskComplexityDegree;
    }

    public synchronized void setTaskComplexityDegree(double taskComplexityDegree) {
        this.taskComplexityDegree = taskComplexityDegree;
    }

    public synchronized double getTedium() {
        return tedium;
    }

    public synchronized void setTedium(double tedium) {
        this.tedium = tedium;
    }

    public synchronized boolean getTouch() {
        return touch;
    }

    public synchronized void setTouch(boolean touch) {
        this.touch = touch;
    }

    public synchronized String getTouched() {
        return touched;
    }

    public synchronized void setTouched(String touched) {
        this.touched = touched;
    }

    public synchronized double getValue() {
        return value;
    }

    public synchronized void setValue(double value) {
        this.value = value;
    }

    public synchronized String getVendo() {
        return vendo;
    }

    public synchronized void setVendo(String vendo) {
        this.vendo = vendo;
    }

    public void setSmelling(String smelling) {
        this.smelling = smelling;
    }

    public String getSmelling() {
        return smelling;
    }
}
