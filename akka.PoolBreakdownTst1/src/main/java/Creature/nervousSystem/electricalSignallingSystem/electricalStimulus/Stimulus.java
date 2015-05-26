package Creature.nervousSystem.electricalSignallingSystem.electricalStimulus;

import akka.actor.ActorRef;

import java.util.UUID;

/**
 * Classe abstrata que generaliza um estímulo qualquer, tando do ambiente quanto interoceptivo. Todo estímulo
 * é uma subclasse desta classe. É composto de uma intensidade (intensity), o identificador do componente emissor (emitterComponent),
 * o estímulo corrente (currentStimulus), uma forma (shape), o identificador do componente receptor (target), o (weigth),
 * e de uma valência (stimulusValence).
 *
 * @author		Anderson Grandi Pires
 * @author		Bruno Andre Santos
 * @version		0.6.0, 09/24/05
 */
public abstract class Stimulus {

    /** */
    private int intensity;

    /** */
    private ActorRef emitterComponent;

    /** */
    private CurrentStimulus currentStimulus;

    /**  */
    private ObjectSequentialNumber target;

    /**  true = appetitive ; false = aversive */
    private boolean stimulusValence;

    private UUID hash;
    /** Is the initial value of the intensity */
    public static final int INITIAL_INTENSITY = 1;

    /**
     * Construtor com parâmetros. Constroi um estímulo em estado integro.
     * @param intensity Intensidade do estímulo
     * @param emmiter Identificador do componente emissor
     * @param current Estímulo corrente
     * @param shape Forma
     * @param target Identificador do componente receptor
     */
    public Stimulus(ObjectSequentialNumber emmiter,
                    CurrentStimulus current, ObjectSequentialNumber target,
                    int intensity) {

        setIntensity(intensity);
        setEmitterComponent(emmiter);
        setCurrentStimulus(current);
        setTarget(target);
        setHash(UUID.randomUUID());
    }

    /**
     * Construtor com parâmetros. Constroi um estímulo em estado integro com valor de intensidade inicial igual a {@link Stimulus#INITIAL_INTENSITY}.
     * @param emmiter Identificador do componente emissor
     * @param current Estímulo corrente
     * @param shape Forma
     * @param target Identificador do componente receptor
     */
    public Stimulus(ObjectSequentialNumber emmiter,
                    CurrentStimulus current, ObjectSequentialNumber target) {

        setIntensity(INITIAL_INTENSITY);
        setEmitterComponent(emmiter);
        setCurrentStimulus(current);
        setTarget(target);
        setHash(UUID.randomUUID());
    }

    /**
     * Construtor com parâmetros. Constroi um estímulo em estado integro com valor de intensidade inicial igual a {@link Stimulus#INITIAL_INTENSITY}
     * e com um uma nova instância de estímulo corrente.
     *
     * @param intensity Intensidade do estímulo
     * @param emmiter Identificador do componente emissor
     * @param shape Forma
     * @param target Identificador do componente receptor
     */
    public Stimulus(ObjectSequentialNumber emmiter, ObjectSequentialNumber target) {

        setIntensity(INITIAL_INTENSITY);
        setEmitterComponent(emmiter);
        setCurrentStimulus(new CurrentStimulus());
        setTarget(target);
        setHash(UUID.randomUUID());
    }

    /**
     * Construtor default. Constroi um estímulo em estado integro com valor de intensidade zero.
     */
    public Stimulus() {
        setIntensity(INITIAL_INTENSITY);
        setEmitterComponent(new ObjectSequentialNumber());
        setCurrentStimulus(new CurrentStimulus());
        setTarget(new ObjectSequentialNumber());
        setHash(UUID.randomUUID());
    }

    /**
     * Recupera o valor de currentStimulus
     * @return currentStimulus
     */
    public CurrentStimulus getCurrentStimulus() {
        return currentStimulus;
    }

    /**
     * Recupera o valor de emitterComponent
     * @return emitterComponent
     */
    public ObjectSequentialNumber getEmitterComponent() {
        return emitterComponent;
    }

    /**
     * Define o valor de emmiterComponent
     * @param emitterComponent Novo valor de emitterComponent
     */
    public void setEmitterComponent(ObjectSequentialNumber emitterComponent) {
        this.emitterComponent = emitterComponent;
    }

    /**
     * Recupera o valor de intensity
     * @return intensity
     */
    public int getIntensity() {
        return intensity;
    }

    /**
     * Define o valor de intensity
     * @param intensity Novo valor de intensity
     */
    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    /**
     * Define o valor de currentStimulus
     * @param currentStimulus Novo valor de currentStimulus
     */
    public void setCurrentStimulus(CurrentStimulus currentStimulus) {
        this.currentStimulus = currentStimulus;
    }

    /**
     * Recupera o valor de target
     * @return target
     */
    public ObjectSequentialNumber getTarget() {
        return target;
    }

    /**
     * Define o valor de target
     * @param target Novo valor de target
     */
    public void setTarget(ObjectSequentialNumber target) {
        this.target = target;
    }


    /**
     * Recupera o valor de stimulusValence
     * @return true se o estímulo for apetitivo e false se o estímulo for aversivo
     */
    public boolean isStimulusValence() {
        return stimulusValence;
    }

    /**
     * Define o valor de stimulusValence
     * @param stimulusValence true para estímulos apetitivos e false para estímulos aversivos
     */
    public void setStimulusValence(boolean stimulusValence) {
        this.stimulusValence = stimulusValence;
    }

    public UUID getHash() {
        return hash;
    }

    private void setHash(UUID hash) {
        this.hash = hash;
    }
}

