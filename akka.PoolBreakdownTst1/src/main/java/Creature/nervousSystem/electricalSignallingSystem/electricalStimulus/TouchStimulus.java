package Creature.nervousSystem.electricalSignallingSystem.electricalStimulus;

import Creature.nervousSystem.electricalSignallingSystem.CurrentStimulus;
import artificeEncapsulatedCluster.ObjectSequentialNumber;

/**
 * Classe que extende de <code>EnviromentalStimulus</code> e representa o estimulo emitido
 * quando o ASCS encosta em um componente de software, como por exemplo uma abelha.
 *
 * @author Luciana Maria de Assis Campos
 */
public class TouchStimulus extends EnvironmentalStimulus {

	/**
	 * Construtor com parametros. Constroi um estimulo com o identificador do
         * componente emissor e suas caracteristicas, a estrutura interna do estimulo,
         * o identificador do componente receptor, e o valor de intensidade.
         *
         * @param emmiter Identificador do componente emissor
         * @param current Estrutura interna do estimulo
         * @param shape Forma geometrica do componente emissor
         * @param target Identificador do componente receptor
         * @param intensity Intensidade do estimulo
         *
	 */
	public TouchStimulus(ObjectSequentialNumber emmiter,
			CurrentStimulus current,
			ObjectSequentialNumber target, int intensity) {
		
		super(emmiter, current, target, intensity);
	}
	
	/**
	 * Construtor com parametros. Constroi um estimulo com o identificador do
         * componente emissor e suas caracteristicas, a estrutura interna do estimulo
         * e o identificador do componente receptor.
         *
         * @param emmiter Identificador do componente emissor
         * @param current Estrutura interna do estimulo
         * @param shape Forma geometrica do componente emissor
         * @param target Identificador do componente receptor
         *
	 */
	public TouchStimulus(ObjectSequentialNumber emmiter,
			CurrentStimulus current, ObjectSequentialNumber target) {
		
		super(emmiter, current, target);
	}
	
	/**
	 * Construtor com parametros. Constroi um estimulo com o identificador do
         * componente emissor e suas caracteristicas e o identificador do componente
         * receptor.
         *
         * @param emmiter Identificador do componente emissor
         * @param shape Forma geometrica do componente emissor
         * @param target Identificador do componente receptor
	 */
	public TouchStimulus(ObjectSequentialNumber emmiter,
			ObjectSequentialNumber target) {
		
		super(emmiter, target);
	}
	
	/**
	 * Construtor default.
	 */
	public TouchStimulus() {
		super();
	}
}
