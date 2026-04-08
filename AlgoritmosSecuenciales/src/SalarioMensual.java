import java.util.Scanner;

public class SalarioMensual {

	public static void main(String[] args) {
		//Algoritmo pero permita calcular el salario mensual de un trabajador
		//teniendo en cuenta los dias que trabajó y el numero de dias.
		
		Scanner entrada = new Scanner(System.in);
		int valorDia, diasTrabajados, salario;
		
		System.out.println("Ingrese el valor por dia trabajado (en COP)");
		valorDia = entrada.nextInt();
		System.out.println("Ingrese los dias trabajados");
		diasTrabajados = entrada.nextInt();
		
		salario = valorDia * diasTrabajados;
		
		System.out.println("El salario es: $"+salario);
		
		entrada.close();

	}

}
