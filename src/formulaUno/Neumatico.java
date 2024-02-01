package formulaUno;

public class Neumatico {

	// ATRIBUTOS.

	private final int idNeumatico;
	private final int material;
	private final int tipo;
	private final Ingeniero ingeniero;
	private final int trabajoIng;

	// CONSTRUCTOR

	public Neumatico(int idNeumatico, int material, int tipo, Ingeniero ingeniero) {
		this.trabajoIng = ingeniero.trabajo();
		this.idNeumatico = idNeumatico;
		this.material = material;
		this.tipo = tipo;
		this.ingeniero = ingeniero;
	}

	// GETTERS Y SETTERS

	public int getIdNeumatico() {
		return idNeumatico;
	}

	public int getMaterial() {
		return material;
	}

	public int getTipo() {
		return tipo;
	}

	public Ingeniero getIngenieroNeu() {
		return ingeniero;
	}
	
	public int construido() {
		
		return ((material + tipo+ trabajoIng)/3);
	}

}
