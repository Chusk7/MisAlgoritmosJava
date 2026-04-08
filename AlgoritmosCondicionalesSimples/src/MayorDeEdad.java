import java.util.Locale;
import java.util.Scanner;

public class MayorDeEdad {

	public static void main(String[] args) {
	// Diseñar el algoritmo que al ingresar la edad de un usuario aparezca un mensaje indicando si es mayor de edad o no
		
		Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Ingrese la edad del usuario");
		int edad = entrada.nextInt();
		
		if (edad >=18) {
			System.out.println("El usuario es mayor de edad");
			
		} else {
			System.out.println("El usuario no es mayor de edad");
		}
		
		entrada.close();
		
	}

}
