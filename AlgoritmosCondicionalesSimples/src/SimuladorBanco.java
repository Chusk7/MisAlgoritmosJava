import java.util.Locale;
import java.util.Scanner;

public class SimuladorBanco {
	
	private static final double LIMITE_INVERSION = 7000;

	public static void main(String[] args) {
		// Un hombre desea saber cuanto dinero se genera por concepto de intereses anuales en relación la cantidad que
		// tiene en inversión en el banco. El decidirá reinvertir los intereses siempre y cuando estos no excedan a $7000, 
		// y en ese caso diseña un algoritmo para saber cuanto dinero tendrá finalmente en su cuenta.
		
		
		Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
				
		System.out.println("Ingrese la cantidad que tiene invertida en el banco");
		double inversion = entrada.nextDouble();
		System.out.println("Ingrese el porcentaje de interes anual (%)");
		double tasaInteresAnual = entrada.nextDouble();
		
		double interesesGenerados = (inversion * tasaInteresAnual ) / 100 ;
		
		if (interesesGenerados >= LIMITE_INVERSION) {
			System.out.println("Los intereses superan los $7000, no se recomienda invertir");		
		} else {
			System.out.println("Los intereses no superan los 7$000, se recomienda invertir");
		}
		
		System.out.printf("Los intereses anuales generados son $ %.2f%n",interesesGenerados);
		
		double saldoTotal = inversion + interesesGenerados;
		System.out.printf("El saldo total en la cuenta es $ %.2f%n",saldoTotal);
		
		entrada.close();
		
	}

}
