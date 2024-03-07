package retuUD5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner(System.in);
		String nombre1;
		String nombre2;
		boolean correcto = false;
		do {
			System.out.print("Introduce nombre del primer fichero: ");
			nombre1 = teclado.nextLine();
			if (nombre1.length() > 2) {
				correcto = true;
			}
		} while (!correcto);
		System.out.println("el nombre del fichero " + nombre1 + " es válido");
		correcto = false;
		do {
			System.out.print("Introduce nombre del segundo fichero: ");
			nombre2 = teclado.nextLine();
			if (nombre2.length() > 2) {
				correcto = true;
			}
		} while (!correcto);
		System.out.println("el nombre del fichero " + nombre1 + " es válido");

		// ya tengo los nombres de los ficheros: fichero1 y fichero2
		teclado.close();

		// System.out.println(System.getProperty("user.dir"));
		String directorioActual = System.getProperty("user.dir");
		String rutaCompletaFich1 = directorioActual + File.separator + nombre1;
		// System.out.println(File.separator);
		// System.out.println(rutaCompletaFich1);
		File fichero1 = new File(rutaCompletaFich1);
		if (comprobarExiste(rutaCompletaFich1)) {
			System.out.println("el fichero: " + nombre1 + " ya existe.");
		} else {
			fichero1.createNewFile();
		}

		String rutaCompletaFich2 = directorioActual + File.separator + nombre2;
		File fichero2 = new File(rutaCompletaFich2);
		if (comprobarExiste(rutaCompletaFich2)) {
			System.out.println("el fichero: " + nombre2 + " ya existe.");
		} else {
			fichero2.createNewFile();
		}

		if (comprobarExiste(rutaCompletaFich1)) {
			escribirEnFichero(fichero1);
		}

		if (comprobarExiste(rutaCompletaFich1)) {
			leerDeFichero(rutaCompletaFich1);
		}

		if (comprobarExiste(rutaCompletaFich1)) {
			System.out.println(fichero1.getName());
			System.out.println(fichero1.getAbsolutePath());
			System.out.println(fichero1.getParent());
			System.out.println(fichero1.length());
			System.out.println("es directorio?: " + fichero1.isDirectory());
		} else {
			System.out
					.println("no existe y por tanto no se puede realizar la acción de mostrar propiedades del fichero");
		} // fin if

		duplicarFicheros(fichero1, fichero2);

		borrarFichero(fichero1);

		leerDeFichero(fichero2);

		File directorio = new File("dirEjer1");
		if (comprobarExiste(directorio)) {
			System.out.println("ya existe");
		} else {
			directorio.mkdir();
		}

	} // fin del main

	static boolean leerDeFichero(File miFichero) throws IOException {
		FileReader entrada = null;
		try {
			entrada = new FileReader(miFichero);
			int caracter = entrada.read();
			while (caracter != -1) {
				System.out.print((char) caracter);
				caracter = entrada.read();
			}

			return true;
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			if (entrada != null) {
				entrada.close();
			}
		}
	}

	static boolean leerDeFichero(String miFichero) throws IOException {
		FileReader entrada = null;
		try {
			entrada = new FileReader(miFichero);
			int caracter = entrada.read();
			while (caracter != -1) {
				System.out.print((char) caracter);
				caracter = entrada.read();
			}

			return true;
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			if (entrada != null) {
				entrada.close();
			}
		}

	}

	static boolean escribirEnFichero(String miFichero) throws IOException {
		/*
		 * método escribirEnFichero (nombreArchivo1) que contiene el código necesario
		 * para grabar en dicho fichero los números del 0-10, cada uno en una línea
		 * diferente y utilizando un bucle for. Usa la clase FileWriter.
		 */
		FileWriter salida = null;
		try {
			salida = new FileWriter(miFichero);

			for (int cont = 0; cont < 11; cont++) {
				salida.write("" + cont);
				salida.write('\n');
			}
			return true;
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			if (salida != null) {
				salida.close();
			}
		}

	}

	static boolean escribirEnFichero(File miFichero) throws IOException {
		FileWriter salida = null;
		try {
			salida = new FileWriter(miFichero);

			for (int cont = 0; cont < 11; cont++) {
				salida.write(String.valueOf(cont));
				salida.write('\n');
			}
			return true;
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			if (salida != null) {
				salida.close();
			}
		}
	}

	static boolean borrarFichero(File miFichero) {
		return miFichero.delete();
	}

	static boolean borrarFichero(String miFichero) {
		File fichero = new File(miFichero);
		return fichero.delete();
	}

	static boolean comprobarExiste(File fichero) {
		return fichero.exists();
	}

	static boolean comprobarExiste(String fichero) {
		File mifichero = new File(fichero);
		return mifichero.exists();
	}

	static boolean duplicarFicheros(File origen, File destino) throws IOException {
		FileReader entrada = null;
		FileWriter salida = null;
		try {
			entrada = new FileReader(origen);
			salida = new FileWriter(destino);

			int caracter = entrada.read();
			while (caracter != -1) {
				salida.write((char) caracter);
				caracter = entrada.read();
			}

			return true;
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			return false;
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			if (entrada != null)
				entrada.close();
			if (salida != null)
				salida.close();
		}

	}

	static boolean duplicarFicheros(String origen, String destino) throws IOException {
		FileReader entrada = null;
		FileWriter salida = null;
		try {
			entrada = new FileReader(origen);
			salida = new FileWriter(destino);

			int caracter = entrada.read();
			while (caracter != -1) {
				salida.write((char) caracter);
				caracter = entrada.read();
			}

			return true;
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			return false;
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			if (entrada != null)
				entrada.close();
			if (salida != null)
				salida.close();
		}

	}
} // fin Ejercicio1
