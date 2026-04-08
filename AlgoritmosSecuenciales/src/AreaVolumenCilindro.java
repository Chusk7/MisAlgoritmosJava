import java.util.Scanner;
import java.util.Locale;
public class AreaVolumenCilindro {

private static final double PI = Math.PI;
	
	public static void main(String[] args) {
		//Determina el área y volumen de un cilindro, aplicando un 
		//radio ingresando su valor por teclado y también su altura.

		Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
		double volumen, area;
					
		// print en lugar de println para que el valor salga al lado
		System.out.print("Ingrese el radio del cilindro (m): ");
        double radio = entrada.nextDouble();
        System.out.print("Ingrese la altura del cilindro (m): ");
        double altura = entrada.nextDouble();
				
		// El area de un cilindro = 2πrh + 2πr^2
		area = (2 * PI * radio * altura) + (2* PI * Math.pow(radio,2));
		
		// El volumen de un cilindro = (πr^2)h
		volumen = PI * Math.pow(radio,2) * altura;
				
		System.out.println("Resultados");
		System.out.printf("El area del cilindro es: %.2fm²%n",area);
		System.out.printf("El volumen del cilindro es: %.2fm³%n",volumen);	
		
		entrada.close();
		
		
	}

}
