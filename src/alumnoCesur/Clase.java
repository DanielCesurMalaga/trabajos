package alumnoCesur;

class Clase {

	// ATRIBUTOS
	private int numAlumnos;
	private Alumno[] alumnos;
	private static final int MAX_ALUMNOS = 15;
	private String nombreClase;
	private Profesor profesor;

	// CONSTRUCTOR
	public Clase(String nombre) {
		numAlumnos = 0;
		alumnos = new Alumno[MAX_ALUMNOS];
		this.nombreClase = nombre;
	}

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
		return MAX_ALUMNOS;
	}

	public String getNombre() {
		return nombreClase;
	}

	public void setNombre(String nombre) {
		this.nombreClase = nombre;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	// METODOS
	public String toString() {

		return ("[Clase: " + nombreClase + ", Profesor: " + profesor + ", NumAlumnos: " + numAlumnos + "]");
	}

	public void add(Alumno nuevoAlumno) {

		if (numAlumnos < MAX_ALUMNOS) {
			alumnos[numAlumnos] = nuevoAlumno;
			numAlumnos++;
		}
	}

	public void delete(String nombre) {
		// solo hay un alumno con el mismo nombre.
		int indice = 0;
		while ((alumnos[indice].getNombre() != nombre) && (indice < alumnos.length)) {
			indice++;
		}
		if (indice < alumnos.length) {
			numAlumnos--;
			for (int i = indice; i < numAlumnos; i++) {
				alumnos[i] = alumnos[i + 1];
			}
			alumnos[numAlumnos] = null;

		} else { // recorrido array sin encontrar el objeto.
			System.out.println("El alumno [" + nombre + "] no se encuentra en la clase [" + nombreClase + "]");
		}

	} // fin delete

	public void listadoAlumnos() {
		System.out.println("Listado alumnos de la clase: "+nombreClase);
		for (int i=0; i<numAlumnos;i++) {
			System.out.println(alumnos[i]);
		}
	}
} // fin CLASE