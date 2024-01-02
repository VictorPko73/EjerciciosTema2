package EjerciciosTema2;

import java.util.Scanner;

public class NumeroNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner introduzca = new Scanner (System.in);
	
	
		int numero = 0;
		
		System.out.println("Introduzca un numero positivo: ");
		numero = introduzca.nextInt();
		while (numero <0)
		{	
			System.out.println("Error el nuemro no es positivo.");
			System.out.println("Introduzca un numero positivo: ");
			numero = introduzca.nextInt();
			
		}
		System.out.println("Los 20 numeros susesivos son: ");
		for ( int iteracion = 0; iteracion < 20  ; iteracion = iteracion + 1)
		{
			
			numero = numero + 1;
			System.out.print(" " + numero );
		}
		
		introduzca.close();
	}

}
