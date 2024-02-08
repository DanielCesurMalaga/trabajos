package formulaUno;

import practicas.Creator;

public class PruebaPersonasYherederos {

	public static void main(String[] args) {
		// prueba ingenieros

		ArrayIngeniero ingenierosA = new ArrayIngeniero();
		System.out.println("num elem inicial del constructor por defecto es 0: " + (ingenierosA.getNumElem() == 0));
		System.out.println("la longitud del array es de " + ingenierosA.getLongitudDefault() + ": "
				+ (ingenierosA.getLongitudDefault() == ingenierosA.getMiArray().length));
		ArrayIngeniero ingenierosB = new ArrayIngeniero(10);
		System.out.println(
				"num elem inicial del constructor con parametro longitud es 0: " + (ingenierosB.getNumElem() == 0));
		System.out.println("la longitud del array es de 10: " + (10 == ingenierosB.getMiArray().length));

		System.out.println("listado de elementos del array usando getIntMiArray():");
		for (int i = 0; i < ingenierosB.getMiArray().length; i++) {
			System.out.print(ingenierosB.getIntMiArray(i) + " ");
		}
		System.out.println();
		System.out.println("listado de elementos del array usando getMiArray():");
		for (int i = 0; i < ingenierosB.getMiArray().length; i++) {
			System.out.print(ingenierosB.getMiArray()[i] + " ");
		}
		System.out.println();

		System.out.println("listado de elementos del array usando getIntMiArray():");
		for (int i = 0; i < ingenierosA.getMiArray().length; i++) {
			System.out.print(ingenierosA.getIntMiArray(i) + " ");
		}
		System.out.println();
		System.out.println("listado de elementos del array usando getMiArray():");
		for (int i = 0; i < ingenierosA.getMiArray().length; i++) {
			System.out.print(ingenierosA.getMiArray()[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < 6; i++) {
			ingenierosA.insertarValor(new Ingeniero(20 + i, Creator.newName(), 100 + i));
			System.out.print("el ingeniero de la posición: " + i + " es: ");
			System.out.println(ingenierosA.getIntMiArray(i).toString());
		}
		System.out.println("reseteado miArray:");
		ingenierosA.resetear();
		System.out.println("numElem= " + ingenierosA.getNumElem());
		for (int i = 0; i < 6; i++) {
			System.out.print("el ingeniero de la posición: " + i + " es: ");
			System.out.println(ingenierosA.getIntMiArray(i));
		}

		System.out.println("PRUEBA PARA COMPROBAR TODAS LAS POSIBILIDADES DE DESPEDIR A UN INGENIERO.");
		System.out.println("   Primera posibilidad: despedir un ingeniero en un array vacío");
		ingenierosA.despedirIngeniero(new Ingeniero(26, "Pedro", 123));
		System.out.println("   Segunda posibilidad: despedir un ingeniero que no esté");
		for (int i = 0; i < 6; i++) {
			ingenierosA.insertarValor(new Ingeniero(20 + i, Creator.newName(), 100 + i));
		}
		ingenierosA.despedirIngeniero(new Ingeniero(26, "Pedro", 123));
		System.out.println("   Tercera posibilidad: despedir un ingeniero que esté en el staff");
		System.out.println("      a) array lleno.");
		System.out.println("         1) ultima posicion.");
		System.out.println("NumElem antes: " + ingenierosA.getNumElem());
		ingenierosA.despedirIngeniero(ingenierosA.getIntMiArray(ingenierosA.getNumElem()-1));
		System.out.println("valor en posición ultima: " + ingenierosA.getIntMiArray(ingenierosA.getNumElem()));
		System.out.println("NumElem después: " + ingenierosA.getNumElem());

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		System.out.println("         2) posicion intermedia.");
		System.out.println("         3) primera posicion.");

		System.out.println("      b) array semilleno");
		System.out.println("      c) array con uno");
		// prueba pilotos

		// prueba mecanicos

	}
}
