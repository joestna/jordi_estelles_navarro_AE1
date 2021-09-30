package ejercicio2b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		List<String> grupoAlumnos = new ArrayList<String>();
		
		int numeroAlumno = 0;
		int cantidadAlumnosEnClase = AddAmountStudents( input );
		
		for( int i = 0; i < cantidadAlumnosEnClase; i++ ) {
			numeroAlumno = AddStudent( grupoAlumnos, input, numeroAlumno );
		}		
		
		ListStudents( grupoAlumnos );		
		
		input.close();

	}
	
	
	static void ListStudents( List<String> grupoAlumnos ) {
		
		System.out.println( "\n---\nLista de alumnos :\n---" );
		
		for( String alumno: grupoAlumnos ){
			System.out.println( alumno );
		}
		
		System.out.println( "---\n" );
		
	}
	
	
	static int AddStudent( List<String> grupoAlumnos, Scanner input, int numeroAlumno ) {
		
		String nombreAlumno = "";
		boolean error = false;	
		
		String regexp = "[A-Z][a-z]*$";
		
		do {
			error = false;
			
			System.out.print( "Formato : *** PRIMERA LETRA EN MAYUSCULA ***\n" +
					          "> Introduce el nombre del " + ( numeroAlumno +1 ) + " alumno : " );
			nombreAlumno = input.next();			
			
			if( nombreAlumno.matches(regexp) ) {
				numeroAlumno ++;
				grupoAlumnos.add( nombreAlumno );
				System.out.println( "\nOutput : " + nombreAlumno + " - Incluido correctamente.\n" );
				
			}else {
				System.out.println( "\nOutput : Nombre Incorrecto\n" );
				error = true;
			}
			
		}while( error );
		
		return numeroAlumno;
		
	}
	
	
	static int AddAmountStudents( Scanner input ) {		
		
		String regexp = "\\d[1-9]*$";
		
		boolean error = false; 
		int cantidadAlumnosEnClase = 0;
		
		do {
			error = false;
			
			System.out.print( "[Opcion] Escribe \" default \" = 6 \n" +
			                  "[Opcion] Escribe un numero\n" +
			                  "> Cuantos alumnos hay en clase? : " );
			String stringCantidadAlumnosEnClase = input.next();
		
			if( stringCantidadAlumnosEnClase.matches(regexp) ) {
				cantidadAlumnosEnClase = Integer.parseInt( stringCantidadAlumnosEnClase );
				System.out.println( "\nOutput : Numero introducido correctamente : " + cantidadAlumnosEnClase + "\n" );
				
			}else if( stringCantidadAlumnosEnClase.equals( "default" ) ){
				cantidadAlumnosEnClase = 6;
				System.out.println( "\nOutput : Numero introducido correctamente : " + cantidadAlumnosEnClase + "\n" );
			
			}else {
				System.out.println( "\nOutput : El valor introducido no es un numero ni \" default \"\n" );
				error = true;
			}
			
		}while( error );
		
		return cantidadAlumnosEnClase;		
		
	}
}
