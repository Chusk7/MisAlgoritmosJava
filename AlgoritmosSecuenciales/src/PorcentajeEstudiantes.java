
public class PorcentajeEstudiantes {

	public static void main(String[] args) {
		//En un salón de clase nos pide diseñar un algoritmo que permita 
		//determinar el porcentaje de varones y el porcentaje de mujeres
		//Cantidad de Niños 78 - Niñas 43
			
		int niños, niñas, totalEstudiantes;
		double porcentajeNiños, porcentajeNiñas;
		niños = 78;
		niñas = 43;
		totalEstudiantes = niños + niñas;
		porcentajeNiños = (niños * 100.0) / totalEstudiantes;
		porcentajeNiñas = (niñas * 100.0) / totalEstudiantes;
		
		//porcentajeNiños = (niños/totalEstudiantes) * 100;
		//porcentajeNiñas = (niñas/totalEstudiantes) * 100;	
		//En una división entera, Java descarta todos los decimales antes de multiplicar por 100.
		
		System.out.printf("El porcentaje de varones es: %.2f%%%n", porcentajeNiños);
		System.out.printf("El porcentaje de mujeres es: %.2f%%%n", porcentajeNiñas);
		//agregar %% al final para que aparezca el símbolo de porcentaje (%).
		
		
	}

}
