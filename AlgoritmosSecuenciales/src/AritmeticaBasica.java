import java.util.Scanner;
import java.util.Locale;
public class AritmeticaBasica {

	public static void main(String[] args) {
		// Diseñar un algoritmo que permita calcular las operaciones aritmeticas basicas
		// ingresando 2 valores numericos por teclado
		
	Scanner entrada = new Scanner (System.in).useLocale(Locale.US);
	double suma, resta, multiplicacion, division;
	
	System.out.println("Ingrese el primero valor");
	double valor1 = entrada.nextDouble();
	System.out.println("Ingrese el segundo valor");
	double valor2 = entrada.nextDouble();
	
	suma = valor1 + valor2;
	resta = valor1 - valor2;
	multiplicacion = valor1 * valor2;
	division = valor1 / valor2;
	
	System.out.println("\n-----Resultados-----");
	System.out.printf("La suma es: %.2f%n", suma);
	System.out.printf("La resta es: %.2f%n", resta);
	System.out.printf("La multiplicación es: %.2f%n", multiplicacion);
	System.out.printf("La división es: %.2f%n", division);
	
	entrada.close();
	
	}

}
