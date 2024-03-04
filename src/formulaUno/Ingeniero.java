package formulaUno;

import java.util.Random;

public class Ingeniero extends Persona implements Comparable {

	// ATRIBUTOS

	private final int INTELIGENCIA;
	private final int INNOVACION;
	private final int COSTE;

	// CONSTRUCTOR

	public Ingeniero(int edad, String nombre, int dni) {
		super(edad, nombre, dni);
		Random aleatorio = new Random();
		this.INTELIGENCIA = aleatorio.nextInt(10);
		this.INNOVACION = aleatorio.nextInt(10);
		this.COSTE = (this.INTELIGENCIA + this.INNOVACION) / 2;

	}

	public Ingeniero(Persona persona) {
		this(persona.getEdad(), persona.getNombre(), persona.getDni());

	}

	// GETTERS Y SETTERS

	public int getInteligencia() {
		return INTELIGENCIA;
	}

	public int getInnovacion() {
		return INNOVACION;
	}

	public int getCoste() {
		return COSTE;
	}

	public String toString() {
		return ("["
				+ "DNI: "+ this.getDni() + "|" +
				"INNOV: "+ this.INNOVACION + " " + 
				"INTEL: "+ this.INTELIGENCIA + " " +
				"COSTE: "+ this.COSTE +
				"]");
	}

	// devuelve un valor del trabajo entre 0 y 10
	public int trabajo() {
		return ((getExperiencia() + INNOVACION + INTELIGENCIA) / 3);
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Persona) {
			int resultado = 0;
			// la fórmula para saber el "valor" del ingeniero se puede cambiar:
			// en principio la inteligencia es más importante q la innovación, pesa más.
			int valorMiIng = this.INNOVACION + this.INTELIGENCIA * 2;
			int valorOtroIng = ((Ingeniero) o).INNOVACION + ((Ingeniero) o).INTELIGENCIA * 2;
			if (valorMiIng > valorOtroIng) {
				return 1;
			} else if (valorMiIng < valorOtroIng) {
				return -1;
			} else {
				return 0;
			}

		}
		return 1; // si o no es siquiera ingeniero, entonces this gana.
	}

}
