package Creature.nervousSystem.electricalSignallingSystem.electricalStimulus;

import Creature.nervousSystem.electricalSignallingSystem.CurrentStimulus;
import artificeEncapsulatedCluster.ObjectSequentialNumber;

/**
 * Classe que extende de <code>EnviromentalStimulus</code> e representa os estimulos
 * emitidos quando o ASCS exibe um reflexo, por exemplo, ver uma abelha.
 *
 * @author Luciana Maria de Assis Campos
 */
public class ShockStimulus extends EnvironmentalStimulus {

	/**
	 * Construtor com parametros. Constroi um estimulo com identificador do componente emissor
         * e suas caracterisiticas, a estrutura interna do estimulo, e o identificador
         * do componente receptor.
         *
         * @param emmiter Identificador do componente emissor
         * @param current Formacao interna do estimulo
         * @param shape Forma geometrica do componente emissor
         * @param target Identificador do componente receptor
         * @param intensity Intensidade do estimulo
	 */
	public ShockStimulus( ObjectSequentialNumber emmiter,
			CurrentStimulus current,
			ObjectSequentialNumber target, int intensity) {
		
		super(emmiter, current, target, intensity);
	}
	
	/**
	 * Construtor com parametros. Constroi um estimulo com o identificador do componente emissor
         * e suas caracterisiticas, a estrutura interna do estimulo, e o indentificador
         * do componente receptor.
         *
         * @param emmiter Identificador do componente emissor
         * @param current Formacao interna do estimulo
         * @param shape Forma geometrica do componente emissor
         * @param target Identificador do componente receptor
	 */
	public ShockStimulus( ObjectSequentialNumber emmiter,
			CurrentStimulus current, ObjectSequentialNumber target) {

		super( emmiter, current, target);
	}
	
	/**
	 * Construtor com parametros. Constroi um estimulo com o identificado do componente emissor
         * e as suas caracterisiticas, e o identificador do componente receptor.
         *
         * @param emmiter Identificador do componente emissor
         * @param shape Forma geometrica do componente emissor
         * @param target Identificador do componente receptor
	 */
	public ShockStimulus(ObjectSequentialNumber emmiter,
			ObjectSequentialNumber target) {
		
		super(emmiter, target);
	}
	
	/**
	 * Construtor default.
	 */
	public ShockStimulus() {
		super();
	}
}
