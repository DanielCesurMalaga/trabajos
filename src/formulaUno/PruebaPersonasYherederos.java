package formulaUno;

import practicas.Creator;

public class PruebaPersonasYherederos {

	public static void main(String[] args) {

		// prueba ingenieros
		int maxElem = 6;
		System.out.println("*****     PRUEBA PARA ListaDe<Ingeniero>     *****");
		ListaDe<Ingeniero> ingenieros = new ListaDe<Ingeniero>(maxElem);
		System.out.println("Número de elementos inicial del constructor con parametro longitud es 0: "
				+ (ingenieros.getNumElem() == 0));

		System.out.println(
				"la longitud del array es de " + maxElem + ":" + (maxElem == (ingenieros.getMiArray()).length));
		System.out.println("listado de elementos del array usando getElemento():");
		for (int i = 0; i < ((ingenieros.getMiArray())).length; i++) {
			System.out.print(ingenieros.getElemento(i) + " ");
		}
		System.out.println();
		System.out.println("listado de elementos del array usando getMiArray():");
		for (int i = 0; i < ((ingenieros.getMiArray())).length; i++) {
			System.out.print((ingenieros.getMiArray())[i] + " ");
		}
		System.out.println();
		System.out.println("\nInsertado de elementos hasta llenar y muestra de cada uno:");
		for (int i = 0; i < maxElem; i++) {
			ingenieros.insertarElemento(new Ingeniero(20 + i, Creator.newName(), 100 + i));
			System.out.print("el ingeniero de la posición [" + i + "] es: ");
			System.out.println(ingenieros.getElemento(i).getDni());
		}
		System.out.println("\nreseteado miArray y muestra de elementos de nuevo:");
		ingenieros.resetear();
		System.out.println("Número de elementos: " + ingenieros.getNumElem());
		System.out.print("Los ingenieros actuales son: ");
		for (int i = 0; i < ingenieros.getMiArray().length; i++) {
			System.out.print(ingenieros.getElemento(i) + " ");
		}

		System.out.println("\n");
		System.out.println("***     PRUEBA PARA COMPROBAR TODAS LAS POSIBILIDADES DE DESPEDIR A UN INGENIERO.     ***");

		System.out.println("\n   (1): despedir un ingeniero en un array vacío");
		ingenieros.destruirElemento(new Ingeniero(26, "Pedro", 123));

		// Primero relleno el array al completo
		for (int i = 0; i < 6; i++) {
			ingenieros.insertarElemento(new Ingeniero(20 + i, Creator.newName(), 100 + i));
		}
		System.out.print("Se rellena el array al completo de nuevo: ");
		ingenieros.mostrarElementos();
		System.out.println();

		System.out.println("\n   (2): despedir un ingeniero que no está (dni 123):");

		// luego intento borrar un elemento que no está.
		ingenieros.destruirElemento(new Ingeniero(26, "Pedro", 123));

		System.out.println("\n   (3): despedir un ingeniero que está en el staff");
		System.out.println("      a) array lleno.");
		System.out.println("         1) ultima posición.");
		System.out.println("NumElem antes: " + ingenieros.getNumElem());
		System.out.println(
				"valor en posición ultima antes: " + ingenieros.getElemento(ingenieros.getNumElem() - 1).getDni());
		System.out.println(
				"valor en posición penúltima antes: " + ingenieros.getElemento(ingenieros.getNumElem() - 2).getDni());
		// destruyo el elemento último.
		Ingeniero ingeniero = new Ingeniero(
				ingenieros.getElemento(ingenieros.getNumElem() - 1).getEdad(),
				ingenieros.getElemento(ingenieros.getNumElem() - 1).getNombre(),
				ingenieros.getElemento(ingenieros.getNumElem() - 1).getDni()
				);
		ingenieros.destruirElemento(ingeniero);
		System.out.println("NumElem después: " + ingenieros.getNumElem());
		System.out.println(
				"valor en posición ultima después: " + ingenieros.getElemento(ingenieros.getNumElem() - 1).getDni());

		System.out.println("         2) posición intermedia. Se borra elemento nº 3");
		System.out.println("Se inserta elemento nuevo para rellenar de nuevo array al completo");
		// vuelvo a insertar elem para llenar array al completo..
		ingenieros.insertarElemento(new Ingeniero(46, "Luis", 12));
		System.out.println("NumElem antes: " + ingenieros.getNumElem());
		System.out.println("valor en posición 3 antes: " + ingenieros.getElemento(2).getDni());
		System.out.println("valor en posición 4 antes: " + ingenieros.getElemento(3).getDni());
		// destruyo el elemento 3.
		ingenieros.destruirElemento(ingenieros.getElemento(2));
		System.out.println("NumElem después: " + ingenieros.getNumElem());
		System.out.println("valor en posición 3 después: " + ingenieros.getElemento(2).getDni());
		System.out.println("valor en posición 4 después: " + ingenieros.getElemento(3).getDni());

		System.out.println("\n         3) posición inicial.");
		System.out.println("Se inserta elemento nuevo para rellenar de nuevo array al completo");
		// vuelvo a insertar elem para llenar array al completo..
		ingenieros.insertarElemento(new Ingeniero(26, "Juan", 256));
		System.out.println("NumElem antes: " + ingenieros.getNumElem());
		System.out.println("valor en posición primera antes: " + ingenieros.getElemento(0).getDni());
		System.out.println("valor en posición segunda antes: " + ingenieros.getElemento(1).getDni());
		// destruyo el elemento posicion primera.
		ingenieros.destruirElemento(ingenieros.getElemento(0));
		System.out.println("NumElem después: " + ingenieros.getNumElem());
		System.out.println("valor en posición primera después: " + ingenieros.getElemento(0).getDni());
		System.out.println("valor en posición segunda después: " + ingenieros.getElemento(1).getDni());
	}
}
