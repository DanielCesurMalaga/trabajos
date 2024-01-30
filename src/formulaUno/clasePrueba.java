package formulaUno;

public class clasePrueba {

	public static void main(String[] args) {
		
		//creamos escudería.
		Escuderia ferrari = new Escuderia("Ferrari");
		
		//Insertar jefe, ingenieros, mecanicos, coches y pilotos.
		ferrari.jefe = new JefeEscuderia(50,"Fredderick",124, 6, 5, 8);
		System.out.println(ferrari.jefe.getNombre());
		ferrari.ingenieros = new ArrayIngeniero(6);
		for (int i=0;i<6;i++) {
			ferrari.ingenieros.insertarValor(new Ingeniero(26+i,"Peter",456+i));
			System.out.println(ferrari.ingenieros.getIntMiArray(i).getNombre()+" dni: "+ferrari.ingenieros.getIntMiArray(i).getDni());
		}
		
		

	}

}
