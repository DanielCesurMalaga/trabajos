
public class Busquedas {

	public static void main(String[] args) {
		int[][] matriz1 = new int[3][4];
		System.out.println(matriz1.length);
		System.out.println(matriz1[0].length);
		// rellenamos matriz 1 con 1s
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				matriz1[i][j] = 1;
			}
		}
		int[][] matriz2 = new int[4][3];

		// rellenamos matriz 2 con 1s
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[i].length; j++) {
				matriz2[i][j] = 1;
			}
		}
		int temp = 0;
		int[][] resultado = new int[3][3];

		for (int i = 0; i < resultado.length; i++) {
			for (int j = 0; j < resultado[i].length; j++) {

				for (int a = 0; a < matriz1.length; a++) {
					temp = 0;
					for (int b = 0; b < matriz1[a].length; b++) {
						temp = temp + matriz1[a][b] * matriz2[b][a];
					}
				}
				// temp tiene almacenado el valor correcto.
				resultado[i][j]= temp;
			}
		}

	}
}
