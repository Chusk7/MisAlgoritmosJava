import java.util.Scanner;
import java.util.Locale;
public class Descuento {

	public static void main(String[] args) {
		// Diseñar un algoritmo que permita aplicar un descuento en el supermercado de tal forma
		// que permita visualizar el monto a pagar después de aplicar dicho procedimiento.

	Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
	double ahorro, totalPagar;
	
	System.out.println("Ingrese el subtotal de la compra");
	double subtotal = entrada.nextDouble();
	
	System.out.println("Ingrese el % de descuento");
	double porcentajeDescuento = entrada.nextDouble();
	
	ahorro = subtotal *(porcentajeDescuento / 100);
	totalPagar = subtotal-ahorro;
	
	System.out.println("\n======= TICKET DE VENTA =======");
    System.out.printf("Subtotal:       $ %10.2f%n", subtotal);
    System.out.printf("Descuento (%2.0f%%):  $ %10.2f%n", porcentajeDescuento, ahorro);
    System.out.println("-------------------------------");
    System.out.printf("TOTAL A PAGAR:  $ %10.2f%n", totalPagar);
    System.out.println("===============================");
	//%10.2f: Ese 10,Reserva 10 espacios para este número"
    //Esto hace que todos los montos se alineen a la derecha
    
	entrada.close();
		
	}

}
