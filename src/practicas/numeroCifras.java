package practicas;
import java.util.Scanner;

public class numeroCifras {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		int contador=1;
		
		do {
			System.out.println("Introduce numero positivo: ");
			num = teclado.nextInt();
		} while (num<0);
		
		System.out.println("el número termina siempre en: "+ (num%10));
		while ((num/10)!=0) {
			num=num/10;			
			contador++;
		}
		System.out.println("El numero tiene "+ contador + " cifras");
		System.out.println("el número empieza en: "+ num);
		
		teclado.close();
	}

}
