
public class Busquedas {

	public static void main(String[] args) {
		
		System.out.print("Introduce filas de primera matriz: " );
		System.out.print("Introduce columnas de primera matriz: " );
		
		System.out.print("las filas de segunda matriz son: " );
		System.out.print("Introduce columnas de segunda matriz: " );
		int[][] matriz1 = new int[3][3];
		System.out.println(matriz1.length);
		System.out.println(matriz1[0].length);
		// rellenamos matriz 1 con 1s
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				matriz1[i][j] = 1;
			}
		}
		int[][] matriz2 = new int[2][2];

		// rellenamos matriz 2 con 1s
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[i].length; j++) {
				matriz2[i][j] = 1;
			}
		}
		int suma = 0;
		int[][] resultado = new int[2][2];
		for (int i = 0; i < resultado.length; i++) {
			for (int j = 0; j < resultado[i].length; j++) {
				// iteraciones: 00 01 10 11
				// suma
				// cada suma tiene dos multiplicaciones.
				// resultado[i][j];
				// fila i de la 1º * columna j de la 2º
				// iteraciones para cada resultado:
				// num col de 1º * num filas de 2º
				for (int cont = 0; cont < 2; cont++) {
					resultado[i][j] = resultado[i][j] + matriz1[i][cont] * matriz2[cont][j];
				}
				System.out.print(resultado[i][j]);
			}
		}
		

	}
}
