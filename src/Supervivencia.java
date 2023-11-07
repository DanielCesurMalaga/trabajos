import java.util.Scanner;
import java.util.Random;

public class Supervivencia {

	public static void main(String[] args) {
		
		final int DIARESCATE = 7;
		int supervivientes;
		int diaActual = 0;
		boolean ataque = false;
		boolean refugio = false;
		boolean armas = false;
		int opcion; 				// para almacenar opción de elección diaria.
		
		Random aleatorio = new Random();
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("HA HABIDO UN APOCALIPSIS ZOMBIE!!!");
		

		System.out.println("Introduce el numero inicial de supervivientes: ");
		supervivientes = teclado.nextInt();

		while ((supervivientes > 0) && (diaActual < DIARESCATE)) {
			diaActual = diaActual + 1;
			System.out.println("dia [" + diaActual + "] Quedan " + supervivientes + " supervivientes");
			System.out.print("Tienes refugio: " + refugio);
			System.out.println(" y tienes armas: " + armas);
			System.out.println();
			System.out.println("Que opcion elijes?:");
			System.out.println(" 1) buscar refugio   (piensa si tienes armas)");
			System.out.println(" 2) buscar armas     (abandonando el refugio)");

			opcion = teclado.nextInt();
			
			while ((opcion != 1) && (opcion != 2)) { // para comprobar q se introduce código correcto
				System.out.println("Escribe opción correcta para poder continuar");
				opcion = teclado.nextInt();
			} 
			
			if (opcion == 1) { // buscar refugio
				refugio = true;
			} else if (opcion == 2) { // buscar armas, pierdes el refugio
				refugio = false;
				armas = true;
			}
			
			ataque = aleatorio.nextBoolean(); // 50% probabilidades
			
			if (ataque) {
				if (refugio) {
					if (armas) { 							// ataque CON refugio CON armas
						supervivientes = supervivientes;
					} else { 								// ataque CON refugio SIN armas
						supervivientes = supervivientes - 1;
					} 
				} else {
					if (armas) {							// ataque SIN refugio CON armas
						supervivientes = supervivientes -2;
					} else {								// ataque SIN refugio SIN armas
						supervivientes = supervivientes -3;
					}
				}
				armas = false; // después de un ataque siempre pierdes las armas.
				System.out.println("Ohhh, Ha habido un ataque hoy");
			} else {
				System.out.println("Que suerte!, hoy no ha habido ataque");
			}
			System.out.println();

		} // fin while
		if (supervivientes > 0) {
			System.out.println("Han sobrevivido " + supervivientes + " supervivientes.");
			System.out.println("ENHORABUENA!!!");
		} else {
			System.out.println("NO HA HABIDO NINGUN SUPERVIVIENTE");
		}
			
			
		teclado.close();

	}

} // (int) (rnd.nextDouble() * cantidad_números_rango + término_inicial_rango) PARA CALCULAR PORCENTAJES ENTEROS
