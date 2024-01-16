package practicas;
import java.util.Scanner;

public class Palindromo {
	
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.print("Introduce una palabra para ver si es Palindroma: ");
	char[] cadena = teclado.nextLine().toCharArray();
	// longitud par.
	int j = cadena.length;
	int i = 0;
	boolean esPalindromo = true;
	
	while (esPalindromo && (i<cadena.length/2)) {
		j--;
		if (cadena[i]!=cadena[j]) {
			esPalindromo = false;
		}
		i++;
	}
	System.out.println("la palabra es palindroma?: "+esPalindromo);
	}

}
