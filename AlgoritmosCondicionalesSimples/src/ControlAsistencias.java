import java.util.Locale;
import java.util.Scanner;

public class ControlAsistencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
		
	System.out.println("Ingrese su nombre completo");
	String nombre = entrada.nextLine();
	System.out.println("Ingrese el curso matriculado");
	String curso = entrada.nextLine();
	System.out.println("Ingrese la nota final");
	double nota = entrada.nextDouble();
	System.out.println("Ingrese el total de clases del curso");
	int totalClases = entrada.nextInt();
	System.out.println("Ingrese el total de clases ausentes");
	double ClasesAusentes = entrada.nextDouble();
	
	double aprobacion = ClasesAusentes / totalClases;
	
	if(aprobacion > 0.2) {
		System.out.println("Querido estudiante usted supero el 20% de inasistencias, su nota es: 0");	
	} else {
		System.out.println("Querido estudiante usted aprobo el curso");	
	}
	
	entrada.close();
		
	}

}
