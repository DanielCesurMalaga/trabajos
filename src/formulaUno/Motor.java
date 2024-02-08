package formulaUno;

public class Motor {

	// ATRIBUTOS

	private final int IDMOTOR;
	private Cilindro cilindro;
	private Turbo turbo;
	private final Ingeniero INGENIERO;
	private final int TRABAJOCIL;
	private final int TRABAJOTUR;
	private final int TRABAJOING;

	// CONSTRUCTOR

	public Motor(int idMotor, Cilindro cilindro, Turbo turbo, Ingeniero ingeniero) {
		this.TRABAJOCIL = cilindro.construido();
		this.TRABAJOTUR = turbo.construido();
		this.TRABAJOING = ingeniero.trabajo();
		this.IDMOTOR = idMotor;
		this.cilindro = cilindro;
		this.turbo = turbo;
		this.INGENIERO = ingeniero;
	}

	// GETTERS Y SETTERS

	public int getIdMotor() {
		return IDMOTOR;
	}

	public Cilindro getCilindroMot() {
		return cilindro;
	}

	public Turbo getTurboMot() {
		return turbo;
	}

	public Ingeniero getIngenieroMot() {
		return INGENIERO;
	}
	
	public int construido () {
		
		return ((TRABAJOCIL +TRABAJOTUR +TRABAJOING)/3);
	}

}
