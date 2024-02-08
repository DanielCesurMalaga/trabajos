package formulaUno;
import java.util.Random;
public class Cilindro {

	// ATRIBUTOS

	private final int IDCILINDRO;
	private final int CAPACIDAD;
	private final int MATERIAL; // calidad del material entre 0 y 10. 10 es el mejor
	private final Ingeniero INGENIERO;
	private final int TRABAJOING;

	// CONSTRUCTOR

	public Cilindro(int idCilindro, int capacidad, int material, Ingeniero ingeniero) {
		this.TRABAJOING = ingeniero.trabajo();
		Random aleatorio = new Random();
		this.IDCILINDRO = idCilindro;
		this.CAPACIDAD = aleatorio.nextInt(10);
		this.MATERIAL = aleatorio.nextInt(10);
		this.INGENIERO = ingeniero;

	}

	// GETTERS Y SETTERS

	public int getIdCilindro() {
		return IDCILINDRO;
	}

	public int getCapacidad() {
		return CAPACIDAD;
	}

	public int getMaterial() {
		return MATERIAL;
	}

	public Ingeniero getIngeniero() {
		return INGENIERO;
	}

	public int construido() {

		return ((CAPACIDAD + MATERIAL + TRABAJOING) / 3);
	}

}
