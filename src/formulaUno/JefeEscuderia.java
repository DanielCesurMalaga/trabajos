package formulaUno;
import java.util.Random;

public class JefeEscuderia extends Persona {

	// ATRIBUTOS

	private final int INTELIGENCIA;
	private final int LIDERAZGO;
	private final int COSTE;

	// CONSTRUCTOR

	public JefeEscuderia(int edad, String nombre, int dni) {
		super(edad, nombre, dni);
		Random aleatorio = new Random();
		this.INTELIGENCIA = aleatorio.nextInt(10);
		this.LIDERAZGO = aleatorio.nextInt(10);
		this.COSTE = (this.INTELIGENCIA + this.LIDERAZGO)/2;
	}
	
	public JefeEscuderia(Persona persona) {
		this(persona.getEdad(), persona.getNombre(),persona.getDni());
	}

	// GETTERS Y SETTERS

	public int getInteligencia() {
		return INTELIGENCIA;
	}

	public int getLiderazgo() {
		return LIDERAZGO;
	}

	public int getCoste() {
		return COSTE;
	}

}
