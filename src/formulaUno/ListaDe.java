package formulaUno;

class ListaDe<E> {
	// atributos.
	private E[] miArray;
	private int numElem;
	private static final int lONGITUD_DEFAULT = 10;
	private int longitud;

	// constructores
	public ListaDe(int longitud) {
		numElem = 0;
		miArray = (E[]) new Object[longitud];
		for (int i = 0; i < longitud; i = i + 1) {
			miArray[i] = null;
		}

	}

	public ListaDe() {
		numElem = 0;
		miArray = (E[]) new Object[lONGITUD_DEFAULT];
		for (int i = 0; i < miArray.length; i = i + 1) {
			miArray[i] = null;
		}
	}

	// metodos
	public int getNumElem() {
		return numElem;
	}

	public Object[] getMiArray() {
		return miArray;
	}

	public E getElemento(int posicion) {
		if ((posicion < numElem) && (posicion >= 0)) {
			return miArray[posicion];
		} else {
			return null; // en caso de error al meter la posición
		}
	}

	public void resetear() {
		for (int i = 0; i < miArray.length; i++) {
			miArray[i] = null;
			numElem = 0;
		}

	}

	public void insertarElemento(E elemento) {
		if (numElem == miArray.length) {
			System.out.println("Array lleno, no se ha insertado elemento");
		} else {
			miArray[numElem] = elemento;
			numElem++;
		}
	}

	public void destruirElemento(E elemento) {
		if (numElem > 0) { // Array tiene al menos un elemento para comparar
			boolean noEncontrado = true;
			int contador = 0;
			while (noEncontrado && (contador < numElem)) {
				if (miArray[contador] == elemento) {
					noEncontrado = false;
				} else {
					contador++;
				}
			}
			if (contador == numElem) { // el elemento no ha sido encontrado.
				System.out.println("El elemento no se encuentra el el array");
			} else { // encontrado elemento, hay q borrarlo
				numElem--;
				for (int i = contador; i < numElem; i++) {
					miArray[i] = miArray[i + 1];
				}
				miArray[numElem] = null;
			}
		} else { // el array está vacío por lo q no hay q buscarlo.
			System.out.println("Array vacío, no se puede encontrar el elemento");
		}
	}
	
	public void mostrarElementos() {
		for (int i=0; i<numElem; i++) {
			System.out.print(miArray[i].toString()+" ");
		}
	}
} // cierra ListaDe
