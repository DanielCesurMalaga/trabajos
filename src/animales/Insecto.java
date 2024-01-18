package animales;

public class Insecto extends Animal {
	private boolean alas;
	private boolean antenas;
	private MiArrayEnemigos enemigos;
	public String atributo;

	public Insecto(String nombre, int tpoVida, boolean alas, boolean antenas) {
		super(nombre, tpoVida);
		this.alas = alas;
		this.antenas = antenas;
		atributo = "soy insecto";
		enemigos = new MiArrayEnemigos();
	}

	public boolean isAlas() {
		return alas;
	}

	public void setAlas(boolean alas) {
		this.alas = alas;
	}

	public boolean isAntenas() {
		return antenas;
	}

	public void setAntenas(boolean antenas) {
		this.antenas = antenas;
	}

	public MiArrayEnemigos getEnemigos() {
		return enemigos;
	}

	public void setEnemigo(String enemigo) {
		enemigos.insertarValor(new Enemigo(enemigo)); 
	}

	class Enemigo {
		private String nombre;

		public Enemigo(String nombre) {
			super();
			this.nombre = nombre;
		}

		public Enemigo() {
			this.nombre = null;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

	} // fin clase Enemigo

	class MiArrayEnemigos {
		// atributos
		private Enemigo[] miArray;
		private int numElem;
		private static final int lONGITUD_DEFAULT = 10;
		private int longitud;

		// constructores
		MiArrayEnemigos(int longitud) {
			numElem = 0;
			miArray = new Enemigo[longitud];
			for (int i = 0; i < longitud; i = i + 1) {
				miArray[i] = null;
			}

		}

		MiArrayEnemigos() {
			numElem = 0;
			miArray = new Enemigo[lONGITUD_DEFAULT];
			for (int i = 0; i < miArray.length; i = i + 1) {
				miArray[i] = null;
			}
		}

		// metodos
		public int getNumElem() {
			return numElem;
		}

		public void setNumElem(int numElem) {
			this.numElem = numElem;
		}

		public Enemigo[] getMiArray() {
			return miArray;
		}

		public Enemigo getEnemigoMiArray(int posicion) {
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

		public void insertarValor(Enemigo valor) {
			if (numElem == miArray.length) {
				System.out.println("Array lleno, no se ha insertado elemento");
			} else {
				miArray[numElem] = valor;
				numElem++;
			}
		}

		public Enemigo sacarValorUltimo() {
			Enemigo temp = new Enemigo();
			if (numElem == 0) {
				return null;
			} else {
				numElem--;
				temp = miArray[numElem];
				miArray[numElem] = null;
				return temp;

			}
		}

		public Enemigo sacarValorPrimero() {
			Enemigo temp = new Enemigo();
			if (numElem == 0) {
				return null;
			} else {
				temp = miArray[0];
				// reducir en 1 numElem y meter los valores en la posicion anterior.
				for (int i = 0; i < numElem - 1; i++) {
					miArray[i] = miArray[i + 1];
				}
				miArray[numElem - 1] = null;
				numElem--;

				return temp;
			}
		}

	} // cierra MiArray

}
