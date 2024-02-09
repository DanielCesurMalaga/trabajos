package formulaUno;

import java.util.Random;

public class Turbo {

	// ATRIBUTOS

	private final int IDTURBO;
	private final int RPM;
	private final int TAMAÑO;
	private final Ingeniero INGENIERO;
	private final int TRABAJOING;

	// ATRIBUTOS

	public Turbo(int idTurbo, int rpm, int tamaño, Ingeniero ingeniero) {
		this.TRABAJOING = ingeniero.trabajo();
		Random aleatorio = new Random();
		this.IDTURBO = idTurbo;
		this.RPM = aleatorio.nextInt(10);
		this.TAMAÑO = aleatorio.nextInt(10);
		this.INGENIERO = ingeniero;
	}

	// GETTERS Y SETTERS

	public int getIdTurbo() {
		return IDTURBO;
	}

	public int getRpm() {
		return RPM;
	}

	public int getTamaño() {
		return TAMAÑO;
	}

	public Ingeniero getIngeniero() {
		return INGENIERO;
	}

	public int construido() {

		return ((RPM + TAMAÑO + TRABAJOING) / 3);
	}
}
