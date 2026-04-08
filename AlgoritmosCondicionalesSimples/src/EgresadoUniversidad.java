import java.util.Locale;
import java.util.Scanner;

public class EgresadoUniversidad {

	private static final double DESCUENTO_EGRESADO = 0.25; // 25%
	
	public static void main(String[] args) {
		// Diseñe un algoritmo que lea el nombre del estudiante, el valor de su
		// matricula en un diplomado que responda si¿ Es egresado de la universidad?
		// si la respuesta es SI, se le aplica un 25 % descuento.
		// Muestre el nombre del estudiante y el valor de la matricula a pagar.
		
		Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Digite el nombre del estudiante: ");
		String nombre = entrada.nextLine();
		
		System.out.print("Ingrese el valor de la matricula: ");
		double valorMatricula = entrada.nextDouble();
		
		// --- MENÚ DE SELECCIÓN ---
        System.out.println("¿Es egresado de la universidad?");
        System.out.println("1. Sí");
        System.out.println("2. No");
        System.out.print("Seleccione una opción (1 o 2): ");
        int egresado = entrada.nextInt();
        
		double descuento = 0;
		
		if (egresado == 1) {
			descuento = valorMatricula * DESCUENTO_EGRESADO;
			System.out.println("Descuento del 25% fué aplicado");
		} else {
			System.out.println("No se aplica descuento");
		}
		
		double totalAPagar = valorMatricula - descuento;
		
		System.out.println("\n================ LIQUIDACIÓN ===========");
	    System.out.printf("Nombre del estudiante        : %s%n", nombre);
	    System.out.printf("Valor de la matricula        = $ %.2f%n", valorMatricula);
	    System.out.printf("Descuento de egresado (25%%)  = $ %.2f%n", descuento);
	    System.out.printf("TOTAL A PAGAR                = $ %.2f%n", totalAPagar);
	    System.out.println("----------------------------------------");
	   	
		entrada.close();
			

	}

}
