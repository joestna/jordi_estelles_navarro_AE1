package ejercicio7;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print( "Anyos de experiencia como desarrollador : " );
		int experiencia = input.nextInt();

		MuestraSalario( experiencia );
	
		
		input.close();
		
	}
	
	static void MuestraSalario( int experiencia ) {
		
		if( experiencia < 1 ) {
			System.out.println( "Desarrollador junior L1 - 15000-18000" );
		}else if( experiencia >= 1 && experiencia < 3 ) {
			System.out.println( "Desarrollador junior L2 - 18000-22000" );
		}else if( experiencia >= 3 && experiencia < 5 ){
			System.out.println( "Desarrollador senior L1 - 22000-28000" );
		}else if( experiencia >= 5 && experiencia < 8 ){
			System.out.println( "Desarrollador Senior L2 – 28000-36000" );
		}else {
			System.out.println( "Analista / Arquitecto. Salario a convenir en base a rol" );
		}
	}
}
