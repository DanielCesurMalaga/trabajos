package practicas;

public class abecedario {
	public static void main(String[] args) {
		String[] cadenaInicial = new String[10];
		for (int i=0; i<10;i++) {
			cadenaInicial[i]="hola";
		}
		ListaFijaCadena cadena1;
		cadena1= new ListaFijaCadena(10,cadenaInicial);
		System.out.println("num elementos: "+ cadena1.getNumElem());
		for (int i=0; i<cadena1.getNumElem();i++){
			System.out.println(cadena1.getArray()[i]);
		}
		
		// crear listaFijaCadena.
		// metemos 3 elementos.
		// sacamos por pantalla el total de elementos y los elementos.

	} // end of main

} // end of abecedario

class ListaFijaCadena { // ahora va a ser inmutable.
	// atributos:
	// numero de elementos
	// array de Strings.
	// MAXNUM de elementos.
	private int numElem;
	private String[] array = new String[MAXNUM];
	private static final int MAXNUM = 10;

	// metodos:
	
	// constructor con parámetros de todos sus atributos.
	public ListaFijaCadena(int numElem, String[] array) {
		this.numElem = numElem;
		this.array = array;
	}

	// setter y getter de cada atributo.

	public int getNumElem() {
		return numElem;
	}

	public void setNumElem(int numElem) {
		this.numElem = numElem;
	}

	public String[] getArray() {
		return array;
	}

	public void setArray(String[] array) {
		this.array = array;
	}

	public static int getMaxnum() {
		return MAXNUM;
	}

	public void introduceString(String cadena) {
		
	}
}
