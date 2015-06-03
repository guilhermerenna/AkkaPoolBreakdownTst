package Creature.nervousSystem.electricalSignallingSystem.electricalStimulus;

import Creature.nervousSystem.electricalSignallingSystem.CurrentStimulus;
import artificeEncapsulatedCluster.ObjectSequentialNumber;

/**
 * Classe que extende de <code>EnviromentalStimulus</code> e representa o estimulo que um componete emite ao outro quando enconstam nele.
 * 
 * @author Luciana Maria de Assis Campos
 */
public class MechanicalStimulus extends EnvironmentalStimulus {


	
	/**
	 * Construtor com parametros. Constroi um estimulo com o identificador do componente emissor
     * e as suas caracteristicas, a estrutura interna do estimulo, o identificador do componente receptor
     * e a intensidade do estimulo.
     *
	 * @param emmiter Identificador do componente emissor
	 * @param current Objeto que forma o estimulo
	 * @param shape Forma geometrica do componente emissor
	 * @param target Identificador do componente receptor
	 * @param intensity Intensidade do estimulo
	 */
	public MechanicalStimulus( ObjectSequentialNumber emmiter,
			CurrentStimulus current,
			ObjectSequentialNumber target, int intensity) {
		
		super(emmiter, current, target, intensity);
	}
	
	/**
	 * Construtor com parametros. Constroi um estimulo com o identificador do componente emissor
     * e suas caracteristicas, a estrutura interna do estimulo e o identificador do componente receptor.
     *
	 * @param emmiter Identificador do componente emissor
	 * @param current Objeto que forma o estimulo
	 * @param shape Forma geometrica do componente emissor
	 * @param target Identificador do componente receptor
	 */
	public MechanicalStimulus( ObjectSequentialNumber emmiter,
			CurrentStimulus current, ObjectSequentialNumber target) {

		super(emmiter, current, target);
	}
	
	/**
	 * Construtor com parametros. Constroi um estimulo com o identificador do componente emissor
     * e as suas caracteristicas e o identificador do componente receptor.
     * 
	 * @param emmiter Identificador do componente emissor
	 * @param shape Forma geometrica do componente emissor
	 * @param target Identificador do componente receptor
	 */
	public MechanicalStimulus(ObjectSequentialNumber emmiter, 
			ObjectSequentialNumber target) {
		
		super(emmiter, target);
	}
	
	/**
	 * Construtor default.
	 */
	public MechanicalStimulus() {
		super();
	}
}
