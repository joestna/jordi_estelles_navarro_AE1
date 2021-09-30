package ejercicio2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] grupoAlumnos = new String[6];
		
		int numeroAlumno = 0;
		int cantidadAlumnosEnClase = AddAmountStudents( input );
		
		for( int i = 0; i < cantidadAlumnosEnClase; i++ ) {
			numeroAlumno = AddStudent( grupoAlumnos, numeroAlumno, input );
		}
		
		input.close();
		
		ListStudents( grupoAlumnos, numeroAlumno );		
	}
	
	//Validad que el input introducido es correcto (numero del 1 al 9)
	//Incluye el input (nombre del estudiante) al grupoAlumnos
	static int AddStudent( String[] grupoAlumnos, int numeroAlumno,  Scanner input ) {
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
				grupoAlumnos[ numeroAlumno -1 ] = nombreAlumno;
				System.out.println( "\nOutput : " + nombreAlumno + " - Incluido correctamente.\n" );
			}else {
				System.out.println( "\nOutput : Nombre Incorrecto\n" );
				error = true;
			}
		}while( error );
		
		return numeroAlumno;
	}
	
	
	//Muestra una lista con los estudiantes incluidos en grupoAlumnos
	static void ListStudents( String[] grupoAlumnos, int numeroAlumno ) {
		System.out.println( "---\nListado de Alumnos :\n---" );
				
		for( int i = 0; i < numeroAlumno ; i++ ) {
			System.out.println( (i +1) + ". " + grupoAlumnos[i] );
		}
		System.out.println( "---" );
	}
		
	
	//Valida que el input introducido es correcto (numero del 1 al 9)
	//Define la cantidad de estudiantes que hay en clase
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