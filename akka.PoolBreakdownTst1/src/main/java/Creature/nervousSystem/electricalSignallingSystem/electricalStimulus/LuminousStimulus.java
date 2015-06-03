package Creature.nervousSystem.electricalSignallingSystem.electricalStimulus;


import Creature.nervousSystem.electricalSignallingSystem.CurrentStimulus;
import artificeEncapsulatedCluster.ObjectSequentialNumber;

/**
 * Classe que extende de <code>EnviromentalStimulus</code> e representa o estimulo luminoso de todos os componentes de software, ou seja, o que o ASCS pode enchergar
 * no seu campo de visao.
 * 
 * @author		Bruno Andre Santos
 * @author		Anderson Grandi Pires
 * @version		0.6.0, 09/24/05
 */
public class LuminousStimulus extends EnvironmentalStimulus {

	private double xPosition, yPosition, zPosition;
	
	
	/**
	 * Construtor com parametros. Constroi um estimulo com o identificador do componente emissor
     * e as suas caracteristicas, a estrutura  interna do estimulo, o identificador do componente receptor
     * e a intensidade do estimulo.
     *
	 * @param emmiter Identificador do componente emissor
	 * @param current Objeto que forma o estimulo
	 * @param shape Forma geometrica do componente emissor
	 * @param target Identificador do componente receptor
	 * @param intensity Intensidade do estimulo
	 */
	public LuminousStimulus(ObjectSequentialNumber emmiter,
			CurrentStimulus current,
			ObjectSequentialNumber target, int intensity) {
		
		super(emmiter, current, target, intensity);
		
	}
	
	/**
	 * Construtor com parametros. Constroi um estimulo com o identificador do componente emissor
     * e as suas caracteristicas, a estrutura interna do estimulo e o identificador do componente
     * emissor.
     *
	 * @param emmiter Identificador do componente emissor
	 * @param current Objeto que forma o estimulo 
	 * @param shape Forma geometrica do componente emissor
	 * @param target Identificador do compoente receptor
	 */
	public LuminousStimulus(ObjectSequentialNumber emmiter,
			CurrentStimulus current, ObjectSequentialNumber target) {

		super( emmiter, current, target);
		
	}
	
	/**
	 * Construtor com parametros. Constroi um estimulo com o identificador do componente emissor
     * e as suas caracteristicas e o identificador do componente receptor.
     * 
	 * @param emmiter Identificador do componente emissor
	 * @param shape Forma geometrica do componente emissor
	 * @param target Identificador do componente receptor
	 */
	public LuminousStimulus(ObjectSequentialNumber emmiter,
			ObjectSequentialNumber target) {
		
		super(emmiter, target);
		
	}
	
	/**
	 * Construtor default.
	 */
	public LuminousStimulus() {
		super();
		
	}

	public double getxPosition() {
		return xPosition;
	}

	public void setxPosition(double xPosition) {
		this.xPosition = xPosition;
	}

	public double getyPosition() {
		return yPosition;
	}

	public void setyPosition(double yPosition) {
		this.yPosition = yPosition;
	}

	public double getzPosition() {
		return zPosition;
	}

	public void setzPosition(double zPosition) {
		this.zPosition = zPosition;
	}
}