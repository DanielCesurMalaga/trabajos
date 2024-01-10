package practicas;

import java.util.Scanner;

public class NumeroCifras {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;

		do {
			System.out.println("Introduce numero positivo: ");
			num = teclado.nextInt();
		} while (num < 0);

		System.out.println("el numero termina en: " + ultimaCifra(num));

		System.out.println("El numero tiene en total " + totalCifras(num) + " cifras");
		System.out.println("el numero empieza en: " + primeraCifra(num));

		teclado.close();
	}

	public static int totalCifras(int num) {
		int contador = 1;
		while ((num / 10) != 0) {
			num = num / 10;
			contador++;
		}
		return contador;
	}

	public static int ultimaCifra(int num) {
		return (num % 10);
	}

	public static int primeraCifra(int num) {
		return (num / (int) Math.pow(10, totalCifras(num) - 1));

	}

}
