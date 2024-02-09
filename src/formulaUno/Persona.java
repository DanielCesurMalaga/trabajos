package formulaUno;

public class Persona {

	// ATRIBUTOS

	private int edad;
	private String nombre;
	private int dni;
	private int experiencia;

	// CONSTRUCTOR

	public Persona(int edad, String nombre, int dni) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.dni = dni;
		this.experiencia = 0;
	}

	// GETTERS Y SETTERS

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void aumentaExperiencia(int aumenta) {
		this.experiencia = this.experiencia + aumenta;
	}

	public String toString() {
		
		return ("[" + dni + "]");
	}

	public String muestraElemCompleto() {
		return ("[Nombre: " + nombre + ", dni: " + dni + ", edad: " + edad + ", experiencia: " + experiencia + "]");
	}

}
