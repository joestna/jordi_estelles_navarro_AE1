package ejercicio4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println( "Introduce un numero: " );
		int numero = input.nextInt();
		
		System.out.println( "El resultado es : " + Factorial( numero ) );
		
	}
	
	static int Factorial( int numero ){
		
		if( numero == 0 ){
			return 1;	
		}else{
			return numero * Factorial( numero -1 );
		}
		
	}
}
