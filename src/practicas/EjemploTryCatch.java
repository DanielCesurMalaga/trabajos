package practicas;

public class EjemploTryCatch {

	public static void main(String[] args) {
		String str = " 12";
		int numero = 0;
		try {
			System.out.println(sacaInt(str));
			numero = numero / 0;
		} catch (ArithmeticException ex) {
			System.out.println(ex.getMessage());
			System.out.println("estoy en main");
		} finally {
			System.out.println("esto se imprime siempre: " + numero);
		}
	}

	public static int sacaInt(String str) {
		return Integer.parseInt(str);
	}
}
