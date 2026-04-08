import java.util.Scanner;
import java.util.Locale;
public class NuevoSalario {

private static final double PORCENTAJE_AUMENTO = 0.25;

	public static void main(String[] args) {
	// Defina un algoritmo que permita calcular el nuevo salario de un trabajador si 
	// a este le incrementaron su sueldo en un 25% adicional a su sueldo anterior.
		
		Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
		double sueldoBase, nuevoSalario, aumento;
						
		System.out.println("Ingrese el sueldo actual");
		sueldoBase = entrada.nextDouble();
		
		aumento = sueldoBase * PORCENTAJE_AUMENTO;
		nuevoSalario = sueldoBase + aumento;
		
		System.out.println("\n--- Resumen del Incremento ---");
        System.out.printf("Sueldo base:    $ %.2f%n", sueldoBase);
        System.out.printf("Aumento (25%%):  $ %.2f%n", aumento);
        System.out.println("------------------------------");
        System.out.printf("Nuevo Salario:  $ %.2f%n", nuevoSalario);
		
		
		entrada.close();
				
		
	}

}
