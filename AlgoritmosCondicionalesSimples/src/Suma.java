import java.util.Locale;
import java.util.Scanner;
public class Suma {

	public static void main(String[] args) {
		// Diseñar el algoritmo que lea 2 numeros en el cual al efectuar la suma de ambos numero el resultado sea positivo
		
		Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
		double suma;
		
		System.out.print("Ingrese el primer numero ");
		double numero1 = entrada.nextDouble();
		
		System.out.print("Ingrese el segundo numero ");
		double numero2 = entrada.nextDouble();
		
		suma = numero1 + numero2;
		
		if (suma > 0) {
			System.out.printf("El resultado de la suma es %.1f%n ",suma);
		} else {
			System.out.print("El resultado de la suma es negativo");
		}
			
		entrada.close();

	}

}
