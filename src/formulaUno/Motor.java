package formulaUno;

public class Motor {

	// ATRIBUTOS.

	private final int idMotor;
	private final Cilindro cilindro;
	private final Turbo turbo;
	private final Ingeniero ingeniero;
	private final int trabajoCil;
	private final int trabajoTur;
	private final int trabajoIng;

	// CONSTRUCTOR

	public Motor(int idMotor, Cilindro cilindro, Turbo turbo, Ingeniero ingeniero) {
		this.trabajoCil = cilindro.construido();
		this.trabajoTur = turbo.construido();
		this.trabajoIng = ingeniero.trabajo();
		this.idMotor = idMotor;
		this.cilindro = cilindro;
		this.turbo = turbo;
		this.ingeniero = ingeniero;
	}

	// GETTERS Y SETTERS

	public int getIdMotor() {
		return idMotor;
	}

	public Cilindro getCilindroMot() {
		return cilindro;
	}

	public Turbo getTurboMot() {
		return turbo;
	}

	public Ingeniero getIngenieroMot() {
		return ingeniero;
	}
	
	public int construido () {
		
		return ((trabajoCil +trabajoTur +trabajoIng)/3);
	}

}
