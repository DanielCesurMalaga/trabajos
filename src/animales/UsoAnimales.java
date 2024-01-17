package animales;

import java.util.ArrayList;
import java.util.List;

public class UsoAnimales {

	public static void main(String[] args) {
		Mamifero perro = new Mamifero("perro",15, true);
		Insecto hormiga = new Insecto("hormiga",1,false,true);
		System.out.println("El animal: "+hormiga.getNombre()+ " tiene alas?: "+ hormiga.isAlas());
		
		Insecto atomica;
		Insecto volantona;
		volantona = hormiga;
		atomica = new Insecto(
				hormiga.getNombre()+" atomica",
				hormiga.getTpoVida(),
				hormiga.isAlas(),
				hormiga.isAntenas()
				);
		hormiga.setAlas(true);
		volantona.setNombre("volantona");
		System.out.println(hormiga.getNombre()+" tiene alas?: "+ hormiga.isAlas());
		System.out.println(atomica.getNombre()+" tiene alas?: "+ atomica.isAlas());
		System.out.println(volantona.getNombre()+" tiene alas?: "+ volantona.isAlas());
		
		System.out.println("Volantona dice: " + volantona.atributo);
		volantona.atributo = "ya no soy insecto";
		System.out.println("Volantona dice: " + volantona.atributo);
		
		Animal pruebaSonido = new Mamifero("Perro",14,true);
		System.out.println("Clase de pruebaSonido: "+pruebaSonido.getClass());
		System.out.println("Instancia de Mamifero?: "+ (pruebaSonido instanceof Mamifero));
		System.out.println("Instancia de Animal?: "+ (pruebaSonido instanceof Animal));
		System.out.println("Instancia de Object?: "+ (pruebaSonido instanceof Object));
		pruebaSonido.sonido();
	}

}
