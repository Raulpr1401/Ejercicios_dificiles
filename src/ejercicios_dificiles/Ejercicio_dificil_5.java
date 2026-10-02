package ejercicios_dificiles;

import java.util.Scanner;

public class Ejercicio_dificil_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Da valor al radio de un círculo: ");
		
		double radio = input.nextInt();
				
		double LongCirc = 2 * Math.PI * radio;
		
		double AreaCirc = Math.PI * radio * radio;
		
		System.out.println("La longitud de la circunferencia es: " + LongCirc);
		
		System.out.println("El área del círculo es: " + AreaCirc);
		
		input.close();
		
		
		
		
	}

}
