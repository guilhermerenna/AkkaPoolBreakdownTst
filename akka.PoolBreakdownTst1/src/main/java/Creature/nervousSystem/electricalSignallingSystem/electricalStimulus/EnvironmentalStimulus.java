package Creature.nervousSystem.electricalSignallingSystem.electricalStimulus;


import Creature.nervousSystem.electricalSignallingSystem.CurrentStimulus;
import artificeEncapsulatedCluster.ObjectSequentialNumber;

/**
 * Classe que extende de Stimulus e generaliza todos os estímulos do ambiente.
 *
 * @author Bruno Andre Santos
 * @author Anderson Grandi Pires
 * @version 0.6.0, 09/24/05
 */
public class EnvironmentalStimulus extends Stimulus {


    /**
     * Construtor com parâmetros. Constroi um estímulo do ambiente em estado integro.
     *
     * @param emmiter   Identificador do componente emissor
     * @param current   Estímulo corrente
     * @param shape     Forma
     * @param target    Identificador do componente receptor
     * @param intensity Intensidade do estímulo
     * @see Stimulus#Stimulus(ObjectSequentialNumber, CurrentStimulus, Shape, ObjectSequentialNumber, int)
     */
    public EnvironmentalStimulus(ObjectSequentialNumber emmiter,
                                 CurrentStimulus current,
                                 ObjectSequentialNumber target, int intensity) {

        super(emmiter, current, target, intensity);

    }

    /**
     * Construtor com parâmetros. Constroi um estímulo do ambiente em estado integro com valor inicial de intensidade igual à {@link Stimulus#INITIAL_INTENSITY}.
     *
     * @param emmiter Identificador do componente emissor
     * @param current Estímulo corrente
     * @param shape   Forma
     * @param target  Identificador do componente receptor
     */
    public EnvironmentalStimulus(ObjectSequentialNumber emmiter,
                                 CurrentStimulus current, ObjectSequentialNumber target) {

        super(emmiter, current, target);

    }

    /**
     * Construtor com parâmetros. Constroi um estímulo do ambiente em estado integro com valor inicial de intensidade igual à {@link Stimulus#INITIAL_INTENSITY}
     * e com uma nova instância de estímulo corrente.
     *
     * @param emmiter Identifcador do componente emissor
     * @param shape   Forma
     * @param target  Identificador do componente receptor
     * @see Stimulus#Stimulus(ObjectSequentialNumber, Shape, ObjectSequentialNumber)
     */
    public EnvironmentalStimulus(ObjectSequentialNumber emmiter,
                                 ObjectSequentialNumber target) {

        super(emmiter, target);

    }

    /**
     * Construtor default. Constroi um estímulo do ambiente em estado integro com valor de intensidade igual a zero.
     *
     * @see Stimulus#Stimulus()
     */
    public EnvironmentalStimulus() {
        super();

    }
}

