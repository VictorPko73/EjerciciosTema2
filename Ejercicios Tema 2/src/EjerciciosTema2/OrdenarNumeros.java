package EjerciciosTema2;

import java.util.Scanner;

public class OrdenarNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner introducir = new Scanner (System.in);
		
		int numero1 = 0;
		int numero2 = 0;
		int numero3 = 0;
		String orden;
		
		
		System.out.println("***Introduce 3 número***");
		System.out.print("Primer número: " );
		numero1 = introducir.nextInt();

		System.out.print("Segundo número: ");
		numero2 = introducir.nextInt();
		
		System.out.print("Tercer número: ");
		numero3 = introducir.nextInt();
		
		System.out.print("Selecciona el orden de ordenamiento ('asc' o 'desc')");
		introducir.nextLine();
		orden = introducir.nextLine();
		
		if(orden.equalsIgnoreCase("desc") ) 
		{
			System.out.println("Numeros ordenados en descendente");
			if (numero1>numero2 && numero2>numero3) 
			{ 
				System.out.println(numero1 + ", " + numero2 + ", " + numero3);
			}
			else if (numero1>numero3 && numero3>numero2) 
			{
				System.out.println(numero1 + ", " + numero3 + ", " + numero2);
			}
			else if (numero2>numero1 && numero1>numero3) 
			{
				System.out.println(numero2 + ", " + numero1 + ", " + numero3);
			}
			else if (numero2>numero3 && numero3>numero1)
			{
				System.out.println(numero2 + ", " + numero3 + ", " + numero1);
			}
			else if (numero3>numero1 && numero1>numero2) 
			{
				System.out.println(numero3 + ", " + numero1 + ", " + numero2);
			}
			else if (numero3>numero2 && numero2>numero1) 
			{
				System.out.println(numero3 + ", " + numero2 + ", " + numero1);
			}
		}
		if(orden.equalsIgnoreCase("asc") ) 
		{
			System.out.println("Numeros ordenados en ascendente");
			if (numero1<numero2 && numero2<numero3) 
			{ 
				System.out.println(numero1 + ", " + numero2 + ", " + numero3);
			}
			else if (numero1<numero3 && numero3<numero2) 
			{
				System.out.println(numero1 + ", " + numero3 + ", " + numero2);
			}
			else if (numero2<numero1 && numero1<numero3) 
			{
				System.out.println(numero2 + ", " + numero1 + ", " + numero3);
			}
			else if (numero2<numero3 && numero3<numero1)
			{
				System.out.println(numero2 + ", " + numero3 + ", " + numero1);
			}
			else if (numero3<numero1 && numero1<numero2) 
			{
				System.out.println(numero3 + ", " + numero1 + ", " + numero2);
			}
			else if (numero3<numero2 && numero2<numero1) 
			{
				System.out.println(numero3 + ", " + numero2 + ", " + numero1);
			}
		}
		
		else 
		{System.out.println("Opción de ordenamiento no válida");}
		
		
		
		introducir.close();
	}

		
	}


