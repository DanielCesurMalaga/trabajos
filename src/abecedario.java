
import java.util.Random;

public class abecedario {

	public static void main(String[] args) {
		Random aleatorio;
		aleatorio = new Random();

		int[] listaInteger = new int[10];
		int numPares = 0;

		int[] listaPares;
		int[] listaImpares;
		
		int contador;

		// relleno array con valores enteros
		System.out.print("el array inicial es: [");
		for (int indice = 0; indice < listaInteger.length; indice++) {
			listaInteger[indice] = aleatorio.nextInt(1000);
			System.out.print(listaInteger[indice]+" ");
		}
		System.out.println("]");
		
		for (int indice = 0; indice < listaInteger.length; indice++) {
			if ((listaInteger[indice] % 2) == 0) { // es par
				numPares = numPares + 1;
			}
		}
		listaPares = new int[numPares];
		contador = 0;
		
		System.out.print("el array de pares es: [");
		for (int indice = 0; indice < listaInteger.length; indice++) {
			if ((listaInteger[indice] % 2)==0) {
				listaPares[contador]= listaInteger[indice];
				System.out.print(listaPares[contador]+ " ");
				contador++;
			}
			
		}
		System.out.println("]");
		
		listaImpares = new int[listaInteger.length-numPares];
		contador = 0;
		
		System.out.print("el array de impares es: [");
		for (int indice = 0; indice < listaInteger.length; indice++) {
			if ((listaInteger[indice] % 2)!=0) {
				listaImpares[contador]= listaInteger[indice];
				System.out.print(listaImpares[contador]+ " ");
				contador++;
			}
			
		}
		System.out.println("]");
		
	}

}
