package practicas;

import java.util.Scanner;

public class Capicua {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num = 0;

		do {
			do {
				System.out.print("Introduce numero de tres cifras: ");
				num = teclado.nextInt();
			} while ((num > 999) || (num < 100));
			if (num / 100 == num % 10) {
				System.out.println("el número es capicua");
			}
			System.out.println("SEGUIR? [si = 1]: ");
		} while (teclado.nextInt() == 1);

		teclado.close();
	}

}
