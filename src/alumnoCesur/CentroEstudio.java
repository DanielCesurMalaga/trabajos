package alumnoCesur;

public class CentroEstudio {

	// ATRIBUTOS

	private String nombre;
	private Administrativo[] administrativos;
	private Clase[] clases;
	private final int MAX_CLASES;
	private final int MAX_ADMIN;

	// CONSTRUCTOR

	public CentroEstudio(String nombre, int mAX_CLASES, int mAX_ADMIN) {
		this.nombre = nombre;
		MAX_CLASES = mAX_CLASES;
		MAX_ADMIN = mAX_ADMIN;
		clases = new Clase[MAX_CLASES];
		administrativos = new Administrativo[MAX_ADMIN];
	}

	public CentroEstudio(String nombre) {
		this.nombre = nombre;
		MAX_ADMIN = 10;
		MAX_CLASES = 10;
		administrativos = new Administrativo[MAX_ADMIN];
		clases = new Clase[MAX_CLASES];
		
	}

	// GETTERS Y SETTERS

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Administrativo[] getAdministrativos() {
		return administrativos;
	}

	public void setAdministrativos(Administrativo[] administrativos) {
		this.administrativos = administrativos;
	}

	public Clase[] getClases() {
		return clases;
	}

	public void setClases(Clase[] clases) {
		this.clases = clases;
	}

	public int getMAX_CLASES() {
		return MAX_CLASES;
	}

	public int getMAX_ADMIN() {
		return MAX_ADMIN;
	}
	
	public String toString() {
		return ("["+"Centro: "+nombre+", CAPACIDAD { Clases: "+MAX_CLASES+", Admin: "+MAX_ADMIN+"}]");
	}
	public void listadoClases() {
		for (int i=0; i<clases.length;i++) {
			System.out.println(clases[i]);
		}
	}
	public void listadoAdministrativos() {
		for (int j = 0; j < administrativos.length; j++) {
			System.out.println(administrativos[j]);
		}
	}

}
