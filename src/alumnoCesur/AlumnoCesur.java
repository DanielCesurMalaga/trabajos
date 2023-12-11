package alumnoCesur;

import practicas.Creator;

public class AlumnoCesur {

	// MAIN

	public static void main(String[] args) {

		Profesor teacher = new Profesor("Daniel",47,"DAM");
		System.out.println(teacher.getNombre());
		
		Clase premiumPlus = new Clase("Premium Plus");
		System.out.println(premiumPlus);
		premiumPlus.setProfesor(teacher);
		System.out.println(premiumPlus);
		
		
		

		for (int i = 0; i < 15; i++) {
			premiumPlus.add(new Alumno(Creator.newName(), Creator.newAge(), "DAM"));
		}
		
		
		
		
		
		
		
		
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
