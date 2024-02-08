package formulaUno;

import java.util.Random;

public class Ingeniero extends Persona {

	// ATRIBUTOS

	private final int INTELIGENCIA;
	private final int INNOVACION;

	// CONSTRUCTOR

	public Ingeniero(int edad, String nombre, int dni) {
		super(edad, nombre, dni);
		Random aleatorio = new Random();
		this.INTELIGENCIA = aleatorio.nextInt(10);
		this.INNOVACION = aleatorio.nextInt(10);

	}

	public Ingeniero(Persona persona) {
		super(persona.getEdad(), persona.getNombre(), persona.getDni());
		Random aleatorio = new Random();
		this.INTELIGENCIA = aleatorio.nextInt(10);
		this.INNOVACION = aleatorio.nextInt(10);

	}

	// GETTERS Y SETTERS

	public int getInteligencia() {
		return INTELIGENCIA;
	}

	public int getInnovacion() {
		return INNOVACION;
	}

	public String toString() {
		return (super.toString() + ", [" + "Inteligencia: " + INTELIGENCIA + ", Innovacion: " + INNOVACION + "]");
	}

	// devuelve un valor del trabajo entre 0 y 10
	public int trabajo() {
		return ((getExperiencia() + INNOVACION + INTELIGENCIA) / 3);
	}

}
