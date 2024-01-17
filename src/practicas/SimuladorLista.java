package practicas;

public class SimuladorLista {

	public static void main(String[] args) {
		MiArray yo = new MiArray(100);
		for (int i = 0; i < 50; i++) {
			yo.insertarValor(i + 10);
			System.out.println(yo.getIntMiArray(i));
		}
		System.out.println("NumElems: " + yo.getNumElem());
	}

} // cierra SimuladorLista
	// almacena enteros postivos

class MiArray {
	// atributos
	private int[] miArray;
	private int numElem;
	private static final int lONGITUD_DEFAULT = 10;

	// constructores
	MiArray(int longitud) {
		numElem = 0;
		miArray = new int[longitud];
		for (int i = 0; i < longitud; i = i + 1) {
			miArray[i] = -1;
		}

	}

	MiArray() {
		numElem = 0;
		miArray = new int[lONGITUD_DEFAULT];
		for (int i = 0; i < miArray.length; i = i + 1) {
			miArray[i] = -1;
		}
	}

	// metodos
	public int getNumElem() {
		return numElem;
	}

	public void setNumElem(int numElem) {
		this.numElem = numElem;
	}

	public int[] getMiArray() {
		return miArray;
	}

	public int getIntMiArray(int posicion) {
		if ((posicion < miArray.length) && (posicion >= 0)) {
			return miArray[posicion];
		} else {
			return -1; // en caso de error al meter la posición
		}
	}

	public void resetear() {
		for (int i = 0; i < miArray.length; i++) {
			miArray[i] = -1;
		}
	}

	public void insertarValor(int valor) {
		if (numElem == miArray.length) {
			System.out.println("Array lleno, no se ha insertado elemento");
		} else {
			miArray[numElem] = valor;
			numElem++;
		}
	}

	public int sacarValorUltimo() {
		int temp;
		if (numElem == 0) {
			return -1;
		} else {
			numElem--;
			temp=miArray[numElem];
			miArray[numElem]=-1;
			return temp;

		}
	}

	public int sacarValorPrimero() {
		int temp;
		if (numElem == 0) {
			return -1;
		} else {
			temp=miArray[0];
			// reducir en 1 numElem y meter los valores en la posicion anterior.
			for (int i=0; i<numElem-1;i++) {
				miArray[i]=miArray[i+1];
			}
			miArray[numElem-1]=-1;
			numElem--;
			
			return temp;
		}
	}

} // cierra MiArray
