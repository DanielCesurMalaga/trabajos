package formulaUno;

import java.util.Random;

public class Neumatico {
	private enum tipoDureza {
		Blando, Medio, Duro
	}
	// ATRIBUTOS

	private final int IDNEUMATICO;
	private final int MATERIAL;
	private tipoDureza dureza;
	private final Ingeniero INGENIERO;
	private final int TRABAJOING;

	// CONSTRUCTOR

	public Neumatico(int idNeumatico, int material, Ingeniero ingeniero) {
		this.TRABAJOING = ingeniero.trabajo();
		Random aleatorio = new Random();

		this.IDNEUMATICO = idNeumatico;
		this.MATERIAL = aleatorio.nextInt(10);
		this.dureza = tipoDureza.Blando;
		this.INGENIERO = ingeniero;
	}

	// GETTERS Y SETTERS

	public int getIdNeumatico() {
		return IDNEUMATICO;

	}

	public int getMaterial() {
		return MATERIAL;
	}

	public tipoDureza getDureza() {
		return dureza;
	}

	public void setDureza(String dureza) {

		switch (dureza) {
		case "Blando":
			this.dureza = tipoDureza.Blando;
			break;
		case "Medio":
			this.dureza = tipoDureza.Medio;
			break;
		case "Duro":
			this.dureza = tipoDureza.Duro;
			break;

		default:
			this.dureza = tipoDureza.Blando;
		}

	}
	
	public void setDureza(tipoDureza dureza) {
		this.dureza = dureza;
		
	}

	public Ingeniero getIngenieroNeu() {
		return INGENIERO;
	}

	public int construido() {

		return ((MATERIAL + TRABAJOING) / 2);
	}

}
