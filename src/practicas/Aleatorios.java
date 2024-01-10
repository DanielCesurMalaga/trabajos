package practicas;
import java.util.Random;

public class Aleatorios {

	public static void main(String[] args) {
		Random aleatorio;
		aleatorio = new Random();
		int filas = (int) (aleatorio.nextDouble() * 10 + 1);
		
		for (int filaActual = 0; filaActual < filas; filaActual++) {
			
			for (int i = 0; i < filas; i++) {
				for (int k = 0; k < filas - filaActual - 1; k++) {
					System.out.print(" ");
				}
				// for de los *
				for (int j = 0; j < (filaActual); j++) {
					System.out.print(filaActual+1);
				}
				for (int l = 0; l < filaActual; l++) {
					System.out.print(filaActual+1);

				}
				System.out.print(filaActual+1);
				for (int k = 0; k < filas - filaActual - 1; k++) {
					System.out.print(" ");
				} 
			}
			System.out.println();
		}
		for (int filaActual = 0; filaActual < filas-1; filaActual++) {
			
			for (int i = 0; i < filas; i++) {
				for (int k = 0; k < filaActual + 1; k++) {
					System.out.print(" ");
				}
				// for de los *
				for (int j = 0; j < (filas - filaActual - 2); j++) {
					System.out.print(filas - filaActual-1);
				}
				for (int l = 0; l < filas - filaActual - 2; l++) {
					System.out.print(filas - filaActual-1);
				}
				System.out.print(filas - filaActual-1);
				for (int k = 0; k < filaActual + 1; k++) {
					System.out.print(" ");
				} 
			}
			System.out.println();
		}
	}
}

//(int) (rnd.nextDouble() * cantidad_números_rango + término_inicial_rango) PARA CALCULAR PORCENTAJES ENTEROS