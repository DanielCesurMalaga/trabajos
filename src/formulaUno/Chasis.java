package formulaUno;

public class Chasis {

	// ATRIBUTOS

	private final int idChasis;
	private int material; // Calidad del material
	private final Ingeniero ingeniero;
	private final int trabajoIng;

	// CONSTRUCTOR

	public Chasis(int idChasis, int material, Ingeniero ingeniero) {
		this.trabajoIng = ingeniero.trabajo();
		this.idChasis = idChasis;
		this.material = material;
		this.ingeniero = ingeniero;
	}

	// GETTERS Y SETTERS

	public int getIdChasis() {
		return idChasis;
	}

	public int getMaterial() {
		return material;
	}

	public Ingeniero getIngenieroCha() {
		return ingeniero;
	}

	public int construido() {
		
		return ((material+trabajoIng)/2);
	}
}
