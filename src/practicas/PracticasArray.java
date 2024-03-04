package practicas;

import java.util.Random;

public class PracticasArray {
	// pedir por teclado el tamaño del array.
	// construir array de int de ese tamaño.
	// pedir rango de valores q se quieren introducir:
	// máximo y mínimo. [max..min]
	// introducir esos valores en el array de forma
	// aleatoria hasta llenarlo.
	// valores positivos.

	// almacenar en un array los numeros pares y en otro
	// los impares.
	// para ello lo primero es saber cuantos hay de cada

	// pedir por teclado el tamaño del array.
	// construir array de char de ese tamaño.

	// rellenarlo de valores aleatorios
	// pedir caracter a buscar y mostrar cuantas
	// ocurrencias del mismo hay.
	public static void main(String[] args) {
		Random al = new Random();
		char[] caracteres = new char[10];
		caracteres[0] = (char) al.nextInt(97, 122);
		System.out.println(caracteres[0]);

		String cadena = "";
		System.out.println(cadena.length());
		cadena = null;
		System.out.println(cadena.length());
	}
}
