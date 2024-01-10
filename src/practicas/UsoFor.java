package practicas;

public class UsoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int filas = 3;
		for (int filaActual = 1; filaActual <= filas; filaActual++) {

			for (int i = 1; i <= filaActual; i++) {
				for (int k = 1; k <= filas; k++) {
					System.out.print(k);
				}

				switch (filaActual) {
				case 1: 
					System.out.print("*");
					break;
				case 2:
					System.out.print("**");
					break;
				case 3:
					System.out.print("***");
					break;
				}
			}
			System.out.println();
		}
	}

}
