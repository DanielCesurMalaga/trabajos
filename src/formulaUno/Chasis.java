package formulaUno;
import java.util.Random;
public class Chasis {

	// ATRIBUTOS

	private final int IDCHASIS;
	private final int MATERIAL; // Calidad del material
	private final Ingeniero INGENIERO;
	private final int TRABAJOING;

	// CONSTRUCTOR

	public Chasis(int idChasis, int material, Ingeniero ingeniero) {
		this.TRABAJOING = ingeniero.trabajo();
		Random aleatorio = new Random();
		this.IDCHASIS = idChasis;
		this.MATERIAL = aleatorio.nextInt(10);
		this.INGENIERO = ingeniero;
	}

	// GETTERS Y SETTERS

	public int getIdChasis() {
		return IDCHASIS;
	}

	public int getMaterial() {
		return MATERIAL;
	}

	public Ingeniero getIngenieroCha() {
		return INGENIERO;
	}

	public int construido() {
		
		return ((MATERIAL+TRABAJOING)/2);
	}
}
