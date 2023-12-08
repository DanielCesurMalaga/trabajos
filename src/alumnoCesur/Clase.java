package alumnoCesur;

class Clase {

	// ATRIBUTOS

	private int numAlumnos;
	private Alumno[] alumnos;
	private static final int TOTALALUMNOS = 15;
	private String nombre;
	private Profesor profesor;

	// GETTERS Y SETTERS

	public int getNumAlumnos() {
		return numAlumnos;
	}

	public void setNumAlumnos(int numAlumnos) {
		this.numAlumnos = numAlumnos;
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}

	public static int getTotalalumnos() {
		return TOTALALUMNOS;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// CONSTRUCTOR

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Clase(String nombre) {

		numAlumnos = 0;

		alumnos = new Alumno[TOTALALUMNOS];

		this.nombre = nombre;

	}

	// METODOS

	public String toString() {

		return ("[Clase: " + nombre + ", NumAlumnos: " + numAlumnos + "]");
	}

	public void add(Alumno nuevoAlu) {

		if (numAlumnos < TOTALALUMNOS) {
			alumnos[numAlumnos] = nuevoAlu;

			numAlumnos++;
		}

	}

	public void delete(String nombre) {

		for (int i = 0; i < getNumAlumnos(); i++) {
			if (getAlumnos()[i].getNombre() == nombre) {

			}
		}
	}

} // fin CLASE