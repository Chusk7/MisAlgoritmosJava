import java.util.Locale;
import java.util.Scanner;

public class EcuacionCuadratica {

	public static void main(String[] args) {
		// Algoritmo para resolver ecuacion de segundo grado
		// ax^2 + bx + c = 0
				
		Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Ingrese el valor de a, b y c respectivamente");
		double a = entrada.nextDouble();
		double b = entrada.nextDouble();
		double c = entrada.nextDouble();
		
		
		//Verificamos que 'a' no sea 0 para que sea una ecuación de 2do grado
		if(a != 0) {
			double discriminante = ((b*b) - (4*a*c));
			
			if(discriminante > 0) {
				double x1 = ((-b) + Math.sqrt(discriminante)) / (2*a);
				double x2 = ((-b) - Math.sqrt(discriminante)) / (2*a);
				System.out.printf("El valor de X1 es: %.3f%n", x1);
				System.out.printf("El valor de X2 es: %.3f%n", x2);
			} else {
				System.out.println("La ecuacion tiene soluciones imaginarias");
			}
						
		}else {
			System.out.println("Si 'a' es 0, no es una ecuación cuadrática.");
		}
		
		entrada.close();
		
		
	}

}
