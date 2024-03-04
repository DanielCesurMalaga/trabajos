package practicas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class EjemploFicheros2 {
	public static void main(String[] args) throws IOException {
		/*
		 * File fichero = null; fichero = new File("pruebaFichero.txt");
		 * System.out.println(fichero.getAbsolutePath());
		 * System.out.println(fichero.getPath());
		 * 
		 * File miDirectorio = null; miDirectorio = new
		 * File("C:\\Users\\Amra\\eclipse-workspace\\practicas"); String[] miLista;
		 * miLista = miDirectorio.list(); for (int i = 0; i < miLista.length; i++) {
		 * System.out.println(miLista[i]); }
		 * 
		 * File miDirectorio = null; miDirectorio = new
		 * File("C:\\Users\\Amra\\eclipse-workspace\\practicas"); File[] miLista;
		 * miLista= miDirectorio.listFiles(); for (int i = 0; i < miLista.length; i++) {
		 * 
		 * if (miLista[i].isDirectory()) {
		 * System.out.println("	DIRECTORIO: "+miLista[i].getName()); } else {
		 * System.out.println(miLista[i].getName()); } }
		 */
		RandomAccessFile fichero = null;
		try {
			fichero = new RandomAccessFile("ficheroAleatorio.txt", "rw");

			for (int i = 0; i < 10; i++) {
				fichero.writeChar(97 + i);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if (fichero != null)
				fichero.close();
		}

		try {
			fichero = new RandomAccessFile("ficheroAleatorio.txt", "r");
			for (int i = 0; i < 10; i++) {
				System.out.print("[" + fichero.readChar() + " " + fichero.getFilePointer() + "] ");
			}
			System.out.println("\nEl puntero acaba en la posición: " + fichero.getFilePointer());
			
			// quiero empezar a leer de nuevo, pero ahora quiero leer byte a byte y 
			// sacar por pantalla exactamente lo mismo.
			fichero.seek(0);
			System.out.println("El puntero ahora está en la posición: " + fichero.getFilePointer());
			for (int i=0; i<10;i++) {
				System.out.print("[" + (char) fichero.readByte()+ " " + fichero.getFilePointer() + "] ");
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if (fichero != null)
				fichero.close();
		}
	}
}
