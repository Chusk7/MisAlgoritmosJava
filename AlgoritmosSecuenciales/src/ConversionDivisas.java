import java.util.Scanner;
import java.util.Locale;
public class ConversionDivisas {

private static final double TASA_CAMBIO = 3.34;

	public static void main(String[] args) {
		//Realizar un algoritmo de tipo de cambio de moneda sabiendo 
		//que 1 dólar es igual a 3.34 soles peruanos.

		Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
			double cantidadSoles, cantidadDolares;
				
			System.out.println("Ingrese la cantidad de dolares");
			cantidadDolares = entrada.nextDouble();
			cantidadSoles = cantidadDolares * TASA_CAMBIO;
			
			System.out.println("------------------------------------------");
	        System.out.printf("$%.2f USD equivalen a: S/%.2f%n", cantidadDolares, cantidadSoles);
	        System.out.println("------------------------------------------");
	        
		
		entrada.close();
	}

}
