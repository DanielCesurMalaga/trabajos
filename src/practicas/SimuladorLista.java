package practicas;
import java.util.Random;

public class SimuladorLista {

	public static void main(String[] args) {
		
		
		MiArrayInt yo = new MiArrayInt(10);
		Random aleatorio = new Random();
	
		// Rellena el array
		for(int x = 0; x<10;x++) {
			yo.insertarValor(aleatorio.nextInt(10));
			System.out.print(yo.getIntMiArray(x)+" ");
		}
		System.out.println();
		
		
		MiArrayInt pares = new MiArrayInt(yo.numDePares());
		MiArrayInt impares = new MiArrayInt(yo.getNumElem()-yo.numDePares());
		
		
		
		//separa par e impar
		for(int x = 0; x<yo.getNumElem(); x++) {
			if((yo.getIntMiArray(x)%2)==0) {
				pares.insertarValor(yo.getIntMiArray(x));
			}else {
				impares.insertarValor(yo.getIntMiArray(x));
			}
		}
		
		
		//muestra par e impar por pantalla
		System.out.println("Array de pares:");
		for(int x = 0; x<pares.getNumElem();x++) {
			System.out.print(pares.getIntMiArray(x)+" ");
		}
		System.out.println();
		System.out.println("Array de impares:");
		for(int x = 0; x<impares.getNumElem();x++) {
			System.out.print(impares.getIntMiArray(x)+" ");
		}
		
		
		
		yo.resetear();
		
		//par e impar alternando
		for(int x = 0; x<(pares.getNumElem()+impares.getNumElem()); x++) {
			if (x<pares.getNumElem()) {
				yo.insertarValor(pares.getIntMiArray(x));
			}
			if (x<impares.getNumElem()) {
				yo.insertarValor(impares.getIntMiArray(x));
			}
		}
		
		//muestra el array ordenado
		System.out.println();
		System.out.println("Array ordenado:");
		for(int x = 0; x<yo.getNumElem();x++) {
			System.out.print(yo.getIntMiArray(x)+" ");
		}
		
		
		
	}

} // cierra SimuladorLista
	// almacena enteros postivos










