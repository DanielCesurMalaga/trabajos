package practicas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class listaYoutube {

	public static void main(String[] args) throws IOException  {
		
		// 45 bloques
		// cada bloque tiene 9 lineas
		// 1,3,5 linea me interesa
		// 2,4,6,7,8,9 linea NO me interesa
		// cada linea q me interesa la almaceno en un String.
		// al final de cada bloque almaceno en otro fichero la union de las 3 lineas
		// orden: num - nombre - tiempo
		// creamos un directorio dentro del workspace y ahí almacenamos el fin.txt
		
		File directorio = null;
		BufferedReader lector = null;
		BufferedWriter escritor = null;
		String num = null;
		String tiempo = null;
		String nombre = null;
		String frase = null;
		try {
			directorio = new File("dirFinal");
			directorio.mkdir();
			lector = (new BufferedReader(new FileReader("inicio.txt")));
			escritor = new BufferedWriter(new FileWriter(".//dirFinal//"+"fin.txt",true));
			
			for (int j = 0; j < 45; j++) {
				for (int i = 0; i < 9; i++) {
					if (i == 0) {
						num = lector.readLine(); // 1 linea
					} else if (i == 2) {
						tiempo = lector.readLine(); // 3 linea
					} else if (i == 4) {
						nombre = lector.readLine(); // 5 linea
					} else {
						lector.readLine(); //  linea q no me interesa
					}
				}
				frase = num + " - " + nombre + " - " + tiempo+"\n";
				escritor.write(frase);
			}
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if (lector!=null) {
				lector.close();
			}
			if (escritor!=null) {
				escritor.close();
			}
		}

	}

}
