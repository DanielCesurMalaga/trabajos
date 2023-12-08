package alumnoCesur;

import practicas.GeneradorObjetos;

public class AlumnoCesur {

	// MAIN

	public static void main(String[] args) {

		Clase premiumPlus = new Clase("Premium Plus");

		for (int i = 0; i < 12; i++) {
			premiumPlus.add(new Alumno(GeneradorObjetos.generadorNombre(), GeneradorObjetos.generadorEdad(), "DAM"));
		}
		System.out.println(premiumPlus);

		Clase presencial = new Clase("Presencial");

		for (int i = 0; i < presencial.getTotalalumnos(); i++) {
			presencial.add(new Alumno(GeneradorObjetos.generadorNombre(), GeneradorObjetos.generadorEdad(), "DAM"));
		}
		System.out.println(presencial);
	}// FIN MAIN

} // FIN ALUMNOCESUR
