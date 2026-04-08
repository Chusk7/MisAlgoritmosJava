import java.util.Locale;
import java.util.Scanner;

public class NumerosPositivos {

	public static void main(String[] args) {
		// Diseña un algoritmo que lea 2 números y visualice si son positivos.
		
		Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Ingrese el primer numero");
		double numero1 = entrada.nextDouble();
		System.out.println("Ingrese el primer numero");
		double numero2 = entrada.nextDouble();
		
		if(numero1 > 0 && numero2 > 0 ) {
			System.out.println("Los números son positivos");
		} else {
			System.out.println("Al menos uno de los números no es positivo");
		}
		
		entrada.close();	
		
	}

}
