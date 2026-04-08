import java.util.Scanner;

public class IngresoDatos {

	public static void main(String[] args) {
		//Diseniar un algoritmo que permita ingresar por el teclado el nombre, edad y ciudad 
		//de una persona. Los resultados deben mostrarse en pantalla
		
		Scanner entrada = new Scanner(System.in);
		String nombre, edad, ciudad;
				
		System.out.println("Ingrese el nombre de la persona");
		nombre = entrada.nextLine();
		System.out.println("Ingrese la edad de la persona");
		edad = entrada.nextLine();
		System.out.println("Ingrese la ciudad donde vive la persona");
		ciudad = entrada.nextLine();
		
		System.out.printf("La persona se llama %s, tiene %s años y vive en %s", nombre, edad, ciudad);
		
		entrada.close();
	}

}
