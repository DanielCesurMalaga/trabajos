package formulaUno;

public class JefeEscuderia extends Persona {
	
	//ATRIBUTOS
	
	private int inteligencia;
	private int liderazgo;
	private int experiencia;
	
	//CONSTRUCTOR
	
	public JefeEscuderia(int edad, String nombre, int dni, int inteligencia, int liderazgo, int experiencia) {
		super(edad, nombre, dni);
		this.inteligencia = inteligencia;
		this.liderazgo = liderazgo;
		this.experiencia = experiencia;
	}

	//GETTERS Y SETTERS
	
	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getLiderazgo() {
		return liderazgo;
	}

	public void setLiderazgo(int liderazgo) {
		this.liderazgo = liderazgo;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
	

	
	
}
