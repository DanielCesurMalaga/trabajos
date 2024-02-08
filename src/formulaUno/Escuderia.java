package formulaUno;

public class Escuderia {

	// ATRIBUTOS

	private static final int NUMING = 4;
	private static final int NUMMEC = 6;
	private static final int NUMPIL = 2;
	private static final int NUMCOC = 2;

	private final String NOMBRE;
	private JefeEscuderia jefe;
	private ArrayIngeniero ingenieros;
	private ArrayMecanico mecanicos;
	private ArrayPiloto pilotos;
	private ArrayCoche coches;

	// CONSTRUCTOR

	public Escuderia(String nombre) {

		this.NOMBRE = nombre;
		this.jefe = null;
		this.coches = new ArrayCoche(NUMCOC);
		this.ingenieros = new ArrayIngeniero(NUMING);
		this.mecanicos = new ArrayMecanico(NUMMEC);
		this.pilotos = new ArrayPiloto(NUMPIL);

	}

	// GETTERS Y SETTTERS

	public String getNombre() {
		return NOMBRE;
	}

	public JefeEscuderia getJefe() {
		return jefe;
	}

	public void setJefe(JefeEscuderia jefe) {
		this.jefe = jefe;
	}

	public ArrayIngeniero getIngenieros() {
		return ingenieros;
	}

	public ArrayMecanico getMecanicos() {
		return mecanicos;
	}

	public ArrayPiloto getPilotos() {
		return pilotos;
	}

	public ArrayCoche getCoches() {
		return coches;
	}

	public static int getNuming() {
		return NUMING;
	}

	public static int getNummec() {
		return NUMMEC;
	}

	public static int getNumpil() {
		return NUMPIL;
	}

	public static int getNumcoc() {
		return NUMCOC;
	}
}
