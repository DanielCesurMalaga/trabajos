package formulaUno;

public class Coche {

	// ATRIBUTOS.

	private final String modelo;
	private final Chasis chasis;
	private final Neumatico neumatico;
	private final Ingeniero ingeniero;
	private final Motor motor;

	private final int trabajoNeu;
	private final int trabajoCha;
	private final int trabajoMot;
	private final int trabajoIng;

	// CONSTRUCTOR

	public Coche(String modelo, Chasis chasis, Neumatico neumatico, Ingeniero ingeniero, Motor motor) {
		this.trabajoCha = chasis.construido();
		this.trabajoIng = ingeniero.trabajo();
		this.trabajoNeu = neumatico.construido();
		this.trabajoMot = motor.construido();
		this.modelo = modelo;
		this.chasis = chasis;
		this.neumatico = neumatico;
		this.ingeniero = ingeniero;
		this.motor = motor;
	}

	// GETTERS Y SETTERS

	public String getModelo() {
		return modelo;
	}

	public Chasis getChasis() {
		return chasis;
	}

	public Neumatico getNeumatico() {
		return neumatico;
	}

	public Ingeniero getIngeniero() {
		return ingeniero;
	}

	public Motor getMotor() {
		return motor;
	}

	public int getTrabajoNeu() {
		return trabajoNeu;
	}

	public int getTrabajoCha() {
		return trabajoCha;
	}

	public int getTrabajoMot() {
		return trabajoMot;
	}

	public int getTrabajoIng() {
		return trabajoIng;
	}

	public int construido() {

		return ((trabajoNeu + trabajoCha + trabajoMot + trabajoIng) / 4);
	}

}
