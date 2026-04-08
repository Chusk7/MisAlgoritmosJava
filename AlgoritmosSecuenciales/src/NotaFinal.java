import java.util.Scanner;

public class NotaFinal {

	public static void main(String[] args) {
		//Defina un algoritmo que permita calcular la nota final de un alumno, teniendo en cuenta que
		//ha realizado 3 evaluaciones y que cada evaluación esta sometida a un peso , el cual es:
		//La primera nota tiene un peso de 25%
		//La segunda nota tiene un peso de 45%
		//La tercera nota tiene un peso de 30%

		Scanner entrada = new Scanner(System.in);
		double nota1, nota2, nota3,ponderacion1,ponderacion2, ponderacion3, notaFinal;
		double notaPonderada1, notaPonderada2, notaPonderada3;
		
		ponderacion1 = 0.25;
		ponderacion2 = 0.45;
		ponderacion3 = 0.30;
		
		System.out.println("Ingrese la primera nota");
		nota1 = entrada.nextDouble();
		System.out.println("Ingrese la segunda nota");
		nota2 = entrada.nextDouble();
		System.out.println("Ingrese la tercera nota");
		nota3 = entrada.nextDouble();
		
		notaPonderada1 = nota1*ponderacion1;
		notaPonderada2 = nota2*ponderacion2;
		notaPonderada3 = nota3*ponderacion3;
		notaFinal = notaPonderada1 + notaPonderada2 + notaPonderada3;
		
		System.out.printf("La nota final es: %.1f%n", notaFinal);
		
		entrada.close();
		
	}

}
