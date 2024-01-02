package EjerciciosTema2;

public class multiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador = 0;
		int multi1 ; 
		int contador2 = 0;
		System.out.println("Números múltiplos de 2 entre 1 y 100:");
		for (multi1=1 ; multi1 <= 100; multi1 ++) {
			if (multi1 % 2 == 0) {
				System.out.print(multi1 + " ");
				contador= contador + 1;
		}
		
		
	}
	System.out.println();
	System.out.println();
	
		System.out.println("Cantidad de múltiplos de 2: " + contador );
		System.out.println();
	
		System.out.println("Números múltiplos de 3 entre 1 y 100:");
		for (multi1=1 ; multi1 <= 100; multi1 ++) {
		if (multi1 % 3 == 0) {
			System.out.print(multi1 + " ");
			contador2= contador2 + 1;
	}
	
	
}
		System.out.println();
		System.out.println();

		System.out.println("Cantidad de múltiplos de 3: " + contador2 );
	
	}
	
}
