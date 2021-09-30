package ejercicio6;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);

	int longitudLista = 5;
	
	int[] listaNumeros = new int[longitudLista];
	
	IncluirNumeros( listaNumeros, longitudLista, input );
	int sumaNumeros = MostrarNumerosInverso( listaNumeros, longitudLista );
	
	System.out.println( "La suma de los numeros es : " + sumaNumeros );
	
	}

	static int[] IncluirNumeros( int[] listaNumeros, int longitudLista, Scanner input ){
		
		int contador = 0;
		
		for( int i = 0; i < longitudLista; i++ ){
			contador ++;
			System.out.print( "Escribe el " + contador + " numero : " );
			listaNumeros[i] = input.nextInt();
		}
		
		return listaNumeros;
		
	}

	static int MostrarNumerosInverso( int[] listaNumeros, int longitudLista ){
		
		System.out.println( "\nLista de numeros inversa : " );
		
		int sumaNumeros = 0;
	
		for( int i = longitudLista -1; i >= 0; i-- ){ 
			System.out.println( listaNumeros[i] );
			sumaNumeros  += listaNumeros[i];
		}
		
		System.out.println( "\n" );
	
		return sumaNumeros;
		
	}
	

}
