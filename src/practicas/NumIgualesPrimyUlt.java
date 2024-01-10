package practicas;

import java.util.Scanner;

public class NumIgualesPrimyUlt {
	// dados dos números introducidos comprobamos que su primera y última cifra son
	// iguales.

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2;

		System.out.print("Introduce primer numero: ");
		num1 = teclado.nextInt();
		System.out.print("Introduce primer numero: ");
		num2 = teclado.nextInt();

		System.out.print("los dos numeros empiezan por la misma cifra?: ");
		System.out.println(NumeroCifras.primeraCifra(num1) == NumeroCifras.primeraCifra(num2));
		System.out.print("los dos numeros acaban por la misma cifra?: ");
		System.out.println(NumeroCifras.ultimaCifra(num1) == NumeroCifras.ultimaCifra(num2));

		teclado.close();
	}
}
