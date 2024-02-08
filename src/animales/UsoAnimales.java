package animales;

public class UsoAnimales {

	public static void main(String[] args) {
		Animal perro1 = new Animal("perro",10);
		Animal perro2 = new Animal("perro",14);
		System.out.println(perro1==perro2);
		System.out.println(perro1.equals(perro2));
		System.out.println(perro1.getNombre().compareTo(perro2.getNombre()));
		int num = 0;
		num+=3;
		System.out.println(num);
		num=+5;
		System.out.println(num);
		num=+12;
		System.out.println(num);
		
		
	}
}