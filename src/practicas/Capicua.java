package practicas;

import java.util.Scanner;

public class Capicua {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numInicial = 0;
		int numFinal = 0;
		int digito = 0;
		int numTemp = 0;

		do {
			System.out.print("Introduce numero para ver si es capicua: ");
			numInicial = teclado.nextInt();
			numTemp = numInicial;

			while (numTemp != 0) {
				digito = numTemp % 10;
				numFinal = (numFinal * 10 + digito);
				numTemp = numTemp / 10;
			}

			if (numInicial == numFinal) {
				System.out.println("el numero es capicua");
			} else {
				System.out.println("El numero NO es capicua");
			}
			System.out.println("SEGUIR? [si = 1]: ");
		} while (teclado.nextInt() == 1);

		teclado.close();
	}

}
