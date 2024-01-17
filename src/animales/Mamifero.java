package animales;

public class Mamifero extends Animal {
	private boolean velloCorporal;

	public Mamifero(String nombre, int tpoVida, boolean velloCorporal) {
		super(nombre, tpoVida);
		this.velloCorporal = velloCorporal;
	}

	public boolean isVelloCorporal() {
		return velloCorporal;
	}

	public void setVelloCorporal(boolean velloCorporal) {
		this.velloCorporal = velloCorporal;
	}
	public void sonido() {
		System.out.println("sonido MAMIFERO");
	}
	
}
