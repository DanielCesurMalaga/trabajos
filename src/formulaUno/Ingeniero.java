package formulaUno;

import java.util.Random;

public class Ingeniero extends Persona {

	// ATRIBUTOS.

	private final int inteligencia;
	private final int innovacion;
	private int experiencia; // aumenta con las carreras

	// CONSTRUCTOR

	public Ingeniero(int edad, String nombre, int dni) {
		super(edad, nombre, dni);
		Random aleatorio = new Random();
		this.inteligencia = aleatorio.nextInt(10);
		this.innovacion = aleatorio.nextInt(10);

	}

	public Ingeniero(Persona persona) {
		super(persona.getEdad(), persona.getNombre(), persona.getDni());
		Random aleatorio = new Random();
		this.inteligencia = aleatorio.nextInt(10);
		this.innovacion = aleatorio.nextInt(10);

	}

	// GETTERS Y SETTERS

	public int getInteligencia() {
		return inteligencia;
	}

	public int getInnovacion() {
		return innovacion;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
	//devuelve un valor del trabajo entre 0 y 10
	public int trabajo() {
		
		
		return ((experiencia + innovacion + inteligencia)/3);
	}

}
