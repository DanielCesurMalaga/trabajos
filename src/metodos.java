
public class metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor;
		int max;
		int min;
		valor=5;
		min = 1;
		max = 10;
		
		(metodos.comprobarValor(max, min, valor)==false)
			
			
			
		System.out.println("Es cierto que el valor " + valor + " esta entre "+ min + " y "+max+" ?");
		System.out.println(metodos.comprobarValor(max, min, valor));
	}
	static boolean comprobarValor(int max, int min, int valor) {
		if ((valor<=max)&&(valor>=min)) {
			return true;
		} else {
			return false;
		}
	}
}
