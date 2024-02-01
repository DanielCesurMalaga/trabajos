package formulaUno;

public class Cilindro {

	// ATRIBUTOS.

	private final int idCilindro;
	private final int capacidad;
	private final int material; // calidad del material entre 0 y 10. 10 es el mejor
	private final Ingeniero ingeniero;
	private final int trabajoIng;

	// CONSTRUCTOR

	public Cilindro(int idCilindro, int capacidad, int material, Ingeniero ingeniero) {
		this.trabajoIng = ingeniero.trabajo();
		this.idCilindro = idCilindro;
		this.capacidad = capacidad;
		this.material = material;
		this.ingeniero = ingeniero;

	}

	// GETTERS Y SETTERS

	public int getIdCilindro() {
		return idCilindro;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public int getMaterial() {
		return material;
	}

	public Ingeniero getIngeniero() {
		return ingeniero;
	}

	public int construido() {

		return ((capacidad + material + trabajoIng) / 3);
	}

}
