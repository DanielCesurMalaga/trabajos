package retuUD5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1 {
	public static void main(String[] args) {

	}

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
				salida.write((char) cont);
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
				salida.write((char) cont);
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
			while (caracter!=-1) {
				salida.write((char)caracter);
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
			while (caracter!=-1) {
				salida.write((char)caracter);
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
