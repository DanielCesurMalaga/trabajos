package animales;

public class UsoAnimales {

	public static void main(String[] args) {
		final Animal[] animales = new Animal[3];
		animales[0]= new Animal("perro",10);
		animales[1]= new Animal("gato",12);
		animales[2]= new Animal("pajaro",5);
		System.out.println(animales[0].getNombre());
		animales[0]= new Animal("oso",15);
		System.out.println(animales[0].getNombre());
	}

}
