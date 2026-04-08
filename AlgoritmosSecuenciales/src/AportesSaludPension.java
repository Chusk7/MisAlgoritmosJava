
public class AportesSaludPension {

	private static final double APORTE_AFP = 0.10;
	private static final double APORTE_ADMOM_AFP = 0.0038;
	private static final double APORTE_SEGURO = 0.0136;	

	public static void main(String[] args) {
		//Tenemos un trabajador gana S/69.23 al día, durante 26 días laborables, nos pide hallar cuanto recibe de sueldo y cuanto
		//se aporta a su seguro pensionario si se sabe que el porcentaje de aporte mensual es el 11.74% el cual esta compuesto por:
		//10% ingresa a su AFP.
		//0.38% es el Cobro por la administración e inversión de tu fondo.
		//1.36% por Seguro de Invalidez, Sobrevivencia y Gastos de Sepelio.
		
		double salarioDiario = 69.23;
		double diasTrabajados = 26;
		double totalIngresos = salarioDiario * diasTrabajados;
		double aporteAFP = totalIngresos * APORTE_AFP;
		double aporteAdmon = totalIngresos * APORTE_ADMOM_AFP;
		double aporteSeguro= totalIngresos * APORTE_SEGURO;
		double totalDeducciones = aporteAFP + aporteAdmon + aporteSeguro;
		double salarioNetoPagado = totalIngresos - totalDeducciones;
				
		System.out.println("\n=======================COMPROBANTE DE PAGO=======================");
		System.out.println("\n=============================INGRESOS============================");
	    System.out.printf("Salario Diario: %48.2f%n",salarioDiario);
	    System.out.printf("Dias trabajados: %47.2f%n",diasTrabajados);
	    System.out.printf("Total ingresos: %48.2f%n",totalIngresos);
		System.out.println("\n============================DEDUCCIONES==========================");
	    System.out.printf("Aporte AFP: - %50.2f%n",aporteAFP);
	    System.out.printf("Aporte administración AFP: - %35.2f%n",aporteAdmon);
	    System.out.printf("Seguro de Invalidez, Sobrevivencia y Gastos de Sepelio: - %6.2f%n",aporteSeguro);
	    System.out.printf("Total deducciones: %45.2f%n",totalDeducciones);
	    System.out.println("=================================================================");
	    System.out.printf("SALARIO NETO A PAGAR: %42.1f%n", salarioNetoPagado);
	    System.out.println("=================================================================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
