package formulaUno;

import java.util.Random;

public class Turbo {

	// ATRIBUTOS

	private final int IDTURBO;
	private final int RPM;
	private final int TAMA�O;
	private final Ingeniero INGENIERO;
	private final int TRABAJOING;

	// ATRIBUTOS

	public Turbo(int idTurbo, int rpm, int tama�o, Ingeniero ingeniero) {
		this.TRABAJOING = ingeniero.trabajo();
		Random aleatorio = new Random();
		this.IDTURBO = idTurbo;
		this.RPM = aleatorio.nextInt(10);
		this.TAMA�O = aleatorio.nextInt(10);
		this.INGENIERO = ingeniero;
	}

	// GETTERS Y SETTERS

	public int getIdTurbo() {
		return IDTURBO;
	}

	public int getRpm() {
		return RPM;
	}

	public int getTama�o() {
		return TAMA�O;
	}

	public Ingeniero getIngeniero() {
		return INGENIERO;
	}

	public int construido() {

		return ((RPM + TAMA�O + TRABAJOING) / 3);
	}
}
