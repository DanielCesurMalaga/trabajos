package alumnoCesur;

import practicas.Creator;

public class AlumnoCesur {

	// MAIN

	public static void main(String[] args) {

		Clase premiumPlus = new Clase("Premium Plus");
		System.out.println(premiumPlus);
		premiumPlus.setProfesor(new Profesor("Daniel", 47, "DAM"));
		System.out.println(premiumPlus);

		String nombre="";
		int edad=0;
		Alumno alumno = new Alumno(nombre, edad,"DAM");

		for (int i = 0; i < Clase.getTotalalumnos(); i++) {
			nombre = Creator.newName();
			edad = Creator.newAge();
			alumno.setNombre(nombre);
			alumno.setEdad(edad);
			premiumPlus.add(alumno);
			System.out.println(premiumPlus.getAlumnos()[i]);
		}

		premiumPlus.deleteAll();

		System.out.println(premiumPlus);
		System.out.println(premiumPlus.getAlumnos()[4]);

		System.out.println(premiumPlus);
		premiumPlus.listadoAlumnos();

		System.out.println();
		premiumPlus.delete(new Alumno("nombre", 16, "DAM"));
		System.out.println(premiumPlus);
		premiumPlus.listadoAlumnos();

		Clase presencial = new Clase("Presencial");

		for (int i = 0; i < Clase.getTotalalumnos(); i++) {
			presencial.add(new Alumno(Creator.newName(), Creator.newAge(), "DAM"));
		}
		System.out.println(presencial);
	}// FIN MAIN

} // FIN ALUMNOCESUR
