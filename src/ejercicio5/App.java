package ejercicio5;

public class App {

	public static void main(String[] args) {
		
		int[] listaNumeros = { 1, 20, 3, 4, 21, 23, 41, 32 };

		int numeroMayor = NumeroMayorLista( listaNumeros );
		System.out.println( "El numero mayor es : " + numeroMayor );

	}
	
		static int NumeroMayorLista( int[] listaNumeros ){
			
			int numeroMayor = 0;
			
			for( int i = 0; i < listaNumeros.length; i++ ){
				for( int j = 0; j < listaNumeros.length; j++ ){
					numeroMayor = ( listaNumeros[i] >=  numeroMayor ) ? listaNumeros[i] : numeroMayor;
				}
			}
			
			return numeroMayor;
			
		}
	}
