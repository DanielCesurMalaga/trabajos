package formulaUno;

class ArrayCoche {
	// atributos.
	private Coche[] miArray;
	private int numElem;
	private static final int lONGITUD_DEFAULT = 2;
	private int longitud;

	// constructores
	public ArrayCoche(int longitud) {
		numElem = 0;
		miArray = new Coche[longitud];
		for (int i = 0; i < longitud; i = i + 1) {
			miArray[i] = null;
		}

	}

	public ArrayCoche() {
		numElem = 0;
		miArray = new Coche[lONGITUD_DEFAULT];
		for (int i = 0; i < miArray.length; i = i + 1) {
			miArray[i] = null;
		}
	}

	// metodos
	public int getNumElem() {
		return numElem;
	}

	public Coche[] getMiArray() {
		return miArray;
	}

	public Coche getCocheMiArray(int posicion) {
		if ((posicion < miArray.length) && (posicion >= 0)) {
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

	public void insertarCoche(Coche coche) {
		if (numElem == miArray.length) {
			System.out.println("Array lleno, no se ha insertado elemento");
		} else {
			miArray[numElem] = coche;
			numElem++;
		}
	}

	public void destruirCoche(Coche coche) {
		if (numElem > 0) { // hay coches en el garaje
			boolean noEncontrado = true;
			int contador = 0;
			while (noEncontrado && (contador < numElem)) {
				if (miArray[contador] == coche) {
					noEncontrado = false;
				} else {
					contador++;
				}
			}
			if (contador == numElem) { // el coche no ha sido encontrado.
				System.out.println("El coche: " + coche.getModelo() + " no se encuentra el el garaje");
			} else { // hemos encontrado el coche, lo tengo q borrar
				numElem--;
				for (int i = contador; i < numElem; i++) {
					miArray[i] = miArray[i + 1];
				}
				miArray[numElem] = null;
			}
		} else { // garaje vacío no hay q buscar para eliminar
			System.out.println("Garaje vacío, no se puede encontrar el coche");
		}

	}
} // cierra ArrayCoche

class ArrayIngeniero {
	// atributos
	private Ingeniero[] miArray;
	private int numElem;
	private static final int lONGITUD_DEFAULT = 6;
	private int longitud;

	// constructores
	public ArrayIngeniero(int longitud) {
		numElem = 0;
		miArray = new Ingeniero[longitud];
		for (int i = 0; i < longitud; i = i + 1) {
			miArray[i] = null;
		}

	}

	public ArrayIngeniero() {
		numElem = 0;
		miArray = new Ingeniero[lONGITUD_DEFAULT];
		for (int i = 0; i < miArray.length; i = i + 1) {
			miArray[i] = null;
		}
	}

	// metodos
	
	public static int getLongitudDefault() {
		return lONGITUD_DEFAULT;
	}

	public int getNumElem() {
		return numElem;
	}

	public Ingeniero[] getMiArray() {
		return miArray;
	}

	public Ingeniero getIntMiArray(int posicion) {
		if ((posicion < miArray.length) && (posicion >= 0)) {
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

	public void insertarValor(Ingeniero ingeniero) {
		if (numElem == miArray.length) {
			System.out.println("Array lleno, no se ha insertado elemento");
		} else {
			miArray[numElem] = ingeniero;
			numElem++;
		}
	}

	public void despedirIngeniero(Ingeniero ingeniero) {
		if (numElem > 0) {
			boolean noEncontrado = true;
			int contador = 0;
			while (noEncontrado && (contador < numElem)) {
				if (miArray[contador] == ingeniero) {
					noEncontrado = false;
				} else {
					contador++;
				}
			}
			if (contador == numElem) {
				System.out.println("El ingeniero: " + ingeniero.getNombre() + " no se encuentra en el staff");
			} else {
				numElem--;
				for (int i = contador; i < numElem; i++) {
					miArray[i] = miArray[i + 1];
				}
				miArray[numElem] = null;
			}
		} else {
			System.out.println("Staff vacio, no se puede encontrar el ingeniero");
		}

	}

} // cierra ArrayIngeniero

class ArrayMecanico {
	// atributos
	private Mecanico[] miArray;
	private int numElem;
	private static final int lONGITUD_DEFAULT = 4;
	private int longitud;

	// constructores
	public ArrayMecanico(int longitud) {
		numElem = 0;
		miArray = new Mecanico[longitud];
		for (int i = 0; i < longitud; i = i + 1) {
			miArray[i] = null;
		}

	}

	public ArrayMecanico() {
		numElem = 0;
		miArray = new Mecanico[lONGITUD_DEFAULT];
		for (int i = 0; i < miArray.length; i = i + 1) {
			miArray[i] = null;
		}
	}

	// metodos
	public int getNumElem() {
		return numElem;
	}

	public Mecanico[] getMiArray() {
		return miArray;
	}

	public Mecanico getIntMiArray(int posicion) {
		if ((posicion < miArray.length) && (posicion >= 0)) {
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

	public void insertarValor(Mecanico mecanico) {
		if (numElem == miArray.length) {
			System.out.println("Array lleno, no se ha insertado elemento");
		} else {
			miArray[numElem] = mecanico;
			numElem++;
		}
	}

	public void despedirMecanico(Mecanico mecanico) {
		if (numElem > 0) {
			boolean noEncontrado = true;
			int contador = 0;
			while (noEncontrado && (contador < numElem)) {
				if (miArray[contador] == mecanico) {
					noEncontrado = false;
				} else {
					contador++;
				}
			}
			if (contador == numElem) {
				System.out.println("El mecanico: " + mecanico.getNombre() + " no se encuentra en el staff");
			} else {
				numElem--;
				for (int i = contador; i < numElem; i++) {
					miArray[i] = miArray[i + 1];
				}
				miArray[numElem] = null;
			}
		} else {
			System.out.println("Staff vacío, no se puede encontrar el mecanico");
		}

	}
} // cierra ArrayMecanico

class ArrayPiloto {
	// atributos
	private Piloto[] miArray;
	private int numElem;
	private static final int lONGITUD_DEFAULT = 2;
	private int longitud;

	// constructores
	public ArrayPiloto(int longitud) {
		numElem = 0;
		miArray = new Piloto[longitud];
		for (int i = 0; i < longitud; i = i + 1) {
			miArray[i] = null;
		}

	}

	public ArrayPiloto() {
		numElem = 0;
		miArray = new Piloto[lONGITUD_DEFAULT];
		for (int i = 0; i < miArray.length; i = i + 1) {
			miArray[i] = null;
		}
	}

	// metodos
	public int getNumElem() {
		return numElem;
	}

	public Piloto[] getMiArray() {
		return miArray;
	}

	public Piloto getIntMiArray(int posicion) {
		if ((posicion < miArray.length) && (posicion >= 0)) {
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

	public void insertarValor(Piloto piloto) {
		if (numElem == miArray.length) {
			System.out.println("Array lleno, no se ha insertado elemento");
		} else {
			miArray[numElem] = piloto;
			numElem++;
		}
	}

	public void despedirPiloto(Piloto piloto) {
		if (numElem > 0) {
			boolean noEncontrado = true;
			int contador = 0;
			while (noEncontrado && (contador < numElem)) {
				if (miArray[contador] == piloto) {
					noEncontrado = false;
				} else {
					contador++;
				}
			}
			if (contador == numElem) {
				System.out.println("El piloto: " + piloto.getNombre() + " no se encuentra en el staff");
			} else {
				numElem--;
				for (int i = contador; i < numElem; i++) {
					miArray[i] = miArray[i + 1];
				}
				miArray[numElem] = null;
			}
		} else {
			System.out.println("Staff vacío, no se puede encontrar el piloto");
		}

	}
} // cierra ArrayPiloto
