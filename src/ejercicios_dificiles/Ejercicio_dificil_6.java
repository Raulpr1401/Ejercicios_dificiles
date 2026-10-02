package ejercicios_dificiles;

import java.util.Scanner;

public class Ejercicio_dificil_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Intruduce el dia de tu nacimiento: ");
		
		String diaN = input.nextLine();
		
		System.out.println("Introduce el mes de tu nacimiento: ");
		
		String mesN = input.nextLine();
		
		System.out.println("Introduce el año de tu nacimiento: ");
		
		String anoN = input.nextLine();
		
		System.out.println("Tu fecha de nacimiento es: " + diaN + " de " + mesN + " del " + anoN);
		
		input.close();
		
	}

}
