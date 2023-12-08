package alumnoCesur;

import practicas.GeneradorObjetos;

public class AlumnoCesur {

	// MAIN

	public static void main(String[] args) {

		Clase premiumPlus = new Clase("Premium Plus");
		premiumPlus.setProfesor(new Profesor("Daniel",47,"DAM"));

		for (int i = 0; i < 15; i++) {
			premiumPlus.add(new Alumno(GeneradorObjetos.generadorNombre(), GeneradorObjetos.generadorEdad(), "DAM"));
		}
		System.out.println(premiumPlus);
		premiumPlus.listadoAlumnos();

		for (int i = 0; i < 15; i++) {
			premiumPlus.delete(premiumPlus.getAlumnos()[0].getNombre());
		}
		System.out.println(premiumPlus);
		premiumPlus.listadoAlumnos();

		Clase presencial = new Clase("Presencial");

		for (int i = 0; i < Clase.getTotalalumnos(); i++) {
			presencial.add(new Alumno(GeneradorObjetos.generadorNombre(), GeneradorObjetos.generadorEdad(), "DAM"));
		}
		//System.out.println(presencial);
	}// FIN MAIN

} // FIN ALUMNOCESUR
