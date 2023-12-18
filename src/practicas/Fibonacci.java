package practicas;

public class Fibonacci {
	public static void main(String[] args) {
		int maxNumFib = 10;
		int contador = 0;
		int numActual, numAnt, temp;
		numAnt=1;
		numActual=1;
		temp=0;
		System.out.print(numAnt+" ");
		System.out.print(numActual+" ");
		while (contador<maxNumFib) {
			
			temp=numAnt+numActual;
			numAnt = numActual;
			numActual = temp;
			System.out.print(temp+" ");
			
			contador++;
			
		}
		
	}
	
}
