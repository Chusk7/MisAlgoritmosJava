import java.util.Scanner;

public class FacturaIGV {

	public static void main(String[] args) {
		// Diseñar un algoritmo que lea por consola el valor de una factura, 
		//en este caso aplicaremos un IGV 18% (Perú).
		
		
		Scanner entrada = new Scanner(System.in);
		double valorFactura, IGV, valorIGV, totalFactura;
				
		System.out.println("Ingrese el valor de la factura sin IGV");
		valorFactura = entrada.nextDouble();
		IGV = 0.18;
		valorIGV = valorFactura * IGV;
		totalFactura = valorFactura + valorIGV;
		
		System.out.println("");
		System.out.printf("El valor total de la factura es: %.2f%n", totalFactura);
		System.out.printf("El valor del impuesto IGV es: %.2f%n", valorIGV);
		
		entrada.close();
	}

}
