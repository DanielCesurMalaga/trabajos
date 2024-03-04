package formulaUno;

public class pruebaPersona {

	public static void main(String[] args) {

		Persona persona = null;
		Ingeniero ingeniero = null;
		JefeEscuderia jefe = null;
		Mecanico mecanico = null;
		Piloto piloto = null;

		persona = new Persona(25, "Persona", 1);
		ingeniero = new Ingeniero(25, "Ingeniero", 1);
		jefe = new JefeEscuderia(26, "Jefe", 3);
		mecanico = new Mecanico(27, "mecanico", 4);
		piloto = new Piloto(28, "piloto", 5);

		System.out.println(persona.hashCode());
		System.out.println(ingeniero.hashCode());
		System.out.println(jefe.hashCode());
		System.out.println(mecanico.hashCode());
		System.out.println(piloto.hashCode());

		System.out.println(persona.equals(ingeniero));
	}

}
