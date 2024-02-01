package formulaUno;

public class Turbo {

	// ATRIBUTOS.

	private final int idTurbo;
	private final int rpm;
	private final int tamaño;
	private final Ingeniero ingeniero;
	private final int trabajoIng;

	// ATRIBUTOS

	public Turbo(int idTurbo, int rpm, int tamaño, Ingeniero ingeniero) {
		this.trabajoIng = ingeniero.trabajo();
		this.idTurbo = idTurbo;
		this.rpm = rpm;
		this.tamaño = tamaño;
		this.ingeniero = ingeniero;
	}

	// GETTERS Y SETTERS

	public int getIdTurbo() {
		return idTurbo;
	}

	public int getRpm() {
		return rpm;
	}

	public int getTamaño() {
		return tamaño;
	}

	public Ingeniero getIngeniero() {
		return ingeniero;
	}

	public int construido() {
		
		return ((rpm+tamaño+trabajoIng)/3);
	}
}
