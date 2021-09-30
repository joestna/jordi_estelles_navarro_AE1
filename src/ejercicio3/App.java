package ejercicio3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print( "Introduce un numero : " );
		int numero = input.nextInt();
		int suma = 0;
		
		input.close();
		
		for( int i = 1; i <= numero; i++ ){
			suma = ( i % 2 == 0 ) ? suma + i : suma;
		}

		System.out.println( "El valor de la suma de sus pares es : " +  suma );
		
	}
}
