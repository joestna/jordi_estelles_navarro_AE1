package ejercicio8;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println( "Dos numeros extremos de un intervalo"  );
		IncluirNumeros( input );

		input.close();
		
	}
	
	
	static void IncluirNumeros( Scanner input ){
		
		System.out.print( "Primer numero : " );
		int primerNumero = input.nextInt();
	
		System.out.print( "Segundo numero : " );
		int segundoNumero = input.nextInt();
		
		MostrarNumerosEntreIntervalo( primerNumero, segundoNumero );
		
	}
	
	
	static void MostrarNumerosEntreIntervalo( int primerNumero, int segundoNumero ){
		
		int comodin = 0;
		
		if( primerNumero > segundoNumero ) {
			comodin = primerNumero;
			primerNumero = segundoNumero;
			segundoNumero = comodin;
		}		
		
		System.out.println( "Numeros entre intervalo : " + primerNumero + "-" + segundoNumero );
		
		for( int i = primerNumero +1; i < segundoNumero; i++ ) {
			System.out.println( "> " + i + EsPrimo(i) );
		}
		
	}
	
	
	static String EsPrimo( int numero ) {
		
		if( numero % 2 == 0 ) return "-EsPrimo " ; else return " ";
		
				
	}
}
