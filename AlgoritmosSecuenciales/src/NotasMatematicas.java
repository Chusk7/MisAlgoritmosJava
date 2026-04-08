import java.util.Scanner;
import java.util.Locale;
public class NotasMatematicas {

	private static final double PONDERACION_EXAMENPARCIAL = 0.55;
	private static final double PONDERACION_EXAMENFINAL = 0.3;
	private static final double PONDERACION_TRABAJOFINAL = 0.15;
	
	public static void main(String[] args) {
		//Un alumno desea saber cual será su calificación final en la materia de Matemáticas, 
		//dicha calificación se compone por 3 porcentajes , a su vez cada porcentaje tiene cierta 
		//cantidad de notas, primero diremos los siguiente:
		//La nota de los 3 primeros exámenes parciales tiene un peso de 55%.
		//La nota del examen final tiene un peso de 30%.
		//La nota del trabajo final tiene un peso de 15%.
		//Hallar la calificación final de todas notas
		
		Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
		double promedioExamesParciales, notaExamesParcialesPonderado, notaExamenFinalPonderado;
		double notaTrabajoFinalPonderado, notaFinal;
		
		System.out.println("-----Calculo nota final de matematicas-----");
		System.out.print("Ingrese la nota del primer Examen Parcial ");
		double examenParcial1 = entrada.nextDouble();
		System.out.print("Ingrese la nota del segundo Examen Parcial ");
		double examenParcial2 = entrada.nextDouble();
		System.out.print("Ingrese la nota del tercer Examen Parcial ");
		double examenParcial3 = entrada.nextDouble();
		System.out.print("Ingrese la nota del Examen final ");
		double notaExamenFinal = entrada.nextDouble();
		System.out.print("Ingrese la nota del Trabajo final ");
		double notaTrabajoFinal = entrada.nextDouble();
		
		promedioExamesParciales = (examenParcial1 + examenParcial2 + examenParcial3) / 3;
		notaExamesParcialesPonderado = promedioExamesParciales * PONDERACION_EXAMENPARCIAL;
		notaExamenFinalPonderado = notaExamenFinal * PONDERACION_EXAMENFINAL;
		notaTrabajoFinalPonderado = notaTrabajoFinal * PONDERACION_TRABAJOFINAL;
		notaFinal = (notaExamesParcialesPonderado + notaExamenFinalPonderado + notaTrabajoFinalPonderado);
		
		System.out.println("\n=======NOTA FINAL MATEMATICAS=======");
	    System.out.printf("Examenes Parciales: %10.1f%n",notaExamesParcialesPonderado);
	    System.out.printf("Examen Final: %16.1f%n",notaExamenFinalPonderado);
	    System.out.printf("Trabajo Final: %15.1f%n",notaTrabajoFinalPonderado);
	    System.out.println("===============================");
	    System.out.printf("NOTA FINAL: %18.1f%n", notaFinal);
	    System.out.println("===============================");
		
		
		entrada.close();
				
		
	}

}
