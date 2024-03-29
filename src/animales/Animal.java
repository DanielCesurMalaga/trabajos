package animales;

import java.io.Serializable;

public class Animal implements Serializable {
	// atributos
	private String nombre;
	private int tpoVida;
	
	// constructor con dos parámetros
	public Animal(String nombre, int tpoVida) {
		super();
		this.nombre = nombre;
		if ((tpoVida > 0) && (tpoVida < 150)) {
			this.tpoVida = tpoVida;
		} else {
			this.tpoVida = 0;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTpoVida() {
		return tpoVida;
	}

	public void setTpoVida(int tpoVida) {
		this.tpoVida = tpoVida;
	}

	public void sonido() {
		System.out.println("sonido ANIMAL");
	}
	
	public boolean equals(Animal animal) {
		return (this.nombre==animal.nombre);
	}
}
