package practicas;

public class Busquedas {

	public static void main(String[] args) {
		
		String email = "daniel.manuel@cesur.com";
		int arroba = email.indexOf('@');
		int punto = email.indexOf('.',arroba);
		String dominio = email.substring(arroba+1);
		String dominioSinExtension = email.substring(arroba+1, punto);
		System.out.println(dominio);
		System.out.println(dominioSinExtension);
		
	}
}
