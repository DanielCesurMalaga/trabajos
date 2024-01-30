package formulaUno;

public class Piloto extends Persona {

	//ATRIBUTOS
	
	private int reflejos;
	private int inteligencia;
	private int agresividad;
	private int experiencia;
	
	//CONSTRUCTOR
	
	public Piloto(int edad, String nombre, int dni, int reflejos, int inteligencia, int agresividad, int experiencia) {
		super(edad, nombre, dni);
		this.reflejos = reflejos;
		this.inteligencia = inteligencia;
		this.agresividad = agresividad;
		this.experiencia = experiencia;
	}

	//GETTERS Y SETTERS
	
	public int getReflejos() {
		return reflejos;
	}

	public void setReflejos(int reflejos) {
		this.reflejos = reflejos;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getAgresividad() {
		return agresividad;
	}

	public void setAgresividad(int agresividad) {
		this.agresividad = agresividad;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
	
	
	
	
	
}
