package alumnoCesur;

import practicas.Creator;

public class AlumnoCesur {

	// MAIN

	public static void main(String[] args) {

		Clase premiumPlus = new Clase("Premium Plus");
		premiumPlus.setProfesor(new Profesor("Daniel", 47, "DAM"));

		String nombre="";
		int edad=0;
		for (int i = 0; i < 0; i++) {
			nombre = Creator.newName();
			edad = Creator.newAge();
			Alumno alumno = new Alumno(nombre, edad,"DAM");			
			premiumPlus.add(alumno);
		}
		
		System.out.println();
		premiumPlus.listadoAlumnos();
		System.out.println();
		premiumPlus.delete("1234");
		premiumPlus.listadoAlumnos();

		

		

}// FIN MAIN

} // FIN ALUMNOCESUR
