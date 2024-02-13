package animales;
import java.util.Random;
public class UsoAnimales {

	public static void main(String[] args) {
		// crear array de 10 enteros q se llame enteros
		Random aleatorio = new Random();
		int[] enteros;
		enteros = new int[10];
		enteros[0] = 9;
		for (int i=1; i<enteros.length; i++) {
			enteros[i]= aleatorio.nextInt(10);
		}
		
		for (int i=0; i<enteros.length;i++) {
			System.out.print(enteros[i]+" ");
		}
		System.out.println();
		int numero = 9;
			//	aleatorio.nextInt(10);
		
		// quiero saber si está numero en el array.
		
		boolean encontrado = false;
		int i = 0;
		int contador = 0;
		int posicion=-1;
		int[] posiciones = new int[enteros.length];
		while (i<enteros.length) {
			if (numero==enteros[i]) {
				encontrado=true;
				posiciones[contador] = i;
				contador++;
			}
			i++;
		} // fin while
		
		if (encontrado) {
			System.out.println("Encontrado "+ numero+":"+ encontrado);
			System.out.println("numero de ocurrencias: "+contador);
			for (int j=0; j<contador; j++) {
				System.out.print(posiciones[j]+" ");
			}
			
		} else {
			System.out.println("no encontrado");
			System.out.println("Posición: "+posicion);
		}
		
		
		
		
		
	}
}