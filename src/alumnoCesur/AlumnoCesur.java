package alumnoCesur;
import java.util.Random;
import practicas.Creator;

public class AlumnoCesur {
	public static void main(String[] args) {
		CentroEstudio cesurEste = new CentroEstudio("CESUR El Palo",5,4);
		Random aleatorio = new Random();

		String nombreClaseTemp;	
		for (int i=0;i<5;i++) { // construyo 5 clases.
			nombreClaseTemp = Creator.newClase();
			cesurEste.getClases()[i]= new Clase(nombreClaseTemp);
			cesurEste.getClases()[i].setProfesor(new Profesor(
					Creator.newName(),
					Creator.newAge(),
					nombreClaseTemp
					));
			
			for (int j=0; j<aleatorio.nextInt(16); j++ ) {
				cesurEste.getClases()[i].add(new Alumno(
						Creator.newName(),
						Creator.newAge(),
						nombreClaseTemp));	
			}
			
		}

		for (int i=0; i<4; i++) { 
			cesurEste.getAdministrativos()[i]= new Administrativo(
					Creator.newName(),
					Creator.newAge(),
					aleatorio.nextBoolean()
					);	
		}
		System.out.println(cesurEste);
		cesurEste.listadoClases();
		cesurEste.listadoAdministrativos();
		
	}// FIN MAIN
} // FIN ALUMNOCESUR
