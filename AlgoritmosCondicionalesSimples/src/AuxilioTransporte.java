import java.util.Locale;
import java.util.Scanner;

public class AuxilioTransporte {
	
	private static final double SALARIO_MINIMO = 930;
	private static final double AUXILIO_TRANSPORTE = 50;
	
	public static void main(String[] args) {
		// 

	Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
	
	System.out.print("Ingrese el nombre completo del empleado: ");
	String nombre = entrada.nextLine();
	
	System.out.print("Ingrese el valor de su salario básico por hora: ");
	double salarioHora = entrada.nextDouble();
	
	System.out.print("Ingrese el total de horas trabajadas al mes: ");
	int horasTrabajadas = entrada.nextInt();
		
	double salarioMensual = salarioHora * horasTrabajadas;
	double subsidioAplicado = 0; // Por defecto es 0
		
	 if(salarioMensual >= (SALARIO_MINIMO*2)) {
		 subsidioAplicado = AUXILIO_TRANSPORTE;	
		} 
	
	double sueldoNeto = salarioMensual + subsidioAplicado;
	 
	System.out.println("\n=========== LIQUIDACIÓN ===========");
    System.out.printf("Nombre del trabajador   : %s%n", nombre);
    System.out.printf("Salario Mensual         = $ %.2f%n", salarioMensual);
    System.out.printf("Subsidio de transporte  = $ %.2f%n", subsidioAplicado);
    System.out.printf("SUELDO NETO             = $ %.2f%n", sueldoNeto);
    System.out.println("------------------------------------");
   	
	entrada.close();
	
	}

	
}
