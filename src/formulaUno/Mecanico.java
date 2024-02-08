package formulaUno;
import java.util.Random;

public class Mecanico extends Persona {
	
	//ATRIBUTOS
	
	private final int VELOCIDAD;
	
	//CONSTRUCTOR
	
	public Mecanico(int edad, String nombre, int dni) {
		super(edad, nombre, dni);
		Random aleatorio = new Random();
		this.VELOCIDAD = aleatorio.nextInt(10);
	}
	
	//GETTERS Y SETTERS

	public int getVelocidad() {
		return VELOCIDAD;
	}

}
