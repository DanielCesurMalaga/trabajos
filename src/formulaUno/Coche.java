package formulaUno;

public class Coche {

	// ATRIBUTOS

	private final String MODELO;
	private Chasis chasis;
	private Neumatico neumatico;
	private final Ingeniero INGENIERO;
	private Motor motor;

	private final int TRABAJONEU;
	private final int TRABAJOCHA;
	private final int TRABAJOMOT;
	private final int TRABAJOING;

	// CONSTRUCTOR

	public Coche(String modelo, Chasis chasis, Neumatico neumatico, Ingeniero ingeniero, Motor motor) {
		this.TRABAJOCHA = chasis.construido();
		this.TRABAJOING = ingeniero.trabajo();
		this.TRABAJONEU = neumatico.construido();
		this.TRABAJOMOT = motor.construido();
		this.MODELO = modelo;
		this.chasis = chasis;
		this.neumatico = neumatico;
		this.INGENIERO = ingeniero;
		this.motor = motor;
	}

	// GETTERS Y SETTERS

	public String getModelo() {
		return MODELO;
	}

	public Chasis getChasis() {
		return chasis;
	}

	public Neumatico getNeumatico() {
		return neumatico;
	}

	public Ingeniero getIngeniero() {
		return INGENIERO;
	}

	public Motor getMotor() {
		return motor;
	}

	public int getTrabajoNeu() {
		return TRABAJONEU;
	}

	public int getTrabajoCha() {
		return TRABAJOCHA;
	}

	public int getTrabajoMot() {
		return TRABAJOMOT;
	}

	public int getTrabajoIng() {
		return TRABAJOING;
	}

	public int construido() {

		return ((TRABAJONEU + TRABAJOCHA + TRABAJOMOT + TRABAJOING) / 4);
	}

}
