package practicas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class EjemploFicheros {
public static void main(String[] args) throws IOException {
	BufferedReader entrada=null;
	BufferedWriter salida = null;
	
	try {
		entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce una frase:");
		String frase = entrada.readLine();
		System.out.println(frase);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}finally {
		if (entrada!=null) {
			entrada.close();
		}
	}

	}
}
