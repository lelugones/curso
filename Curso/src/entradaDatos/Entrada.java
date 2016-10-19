package entradaDatos;

import java.util.Scanner;

public class Entrada {
	
	private static Scanner Leer = new Scanner(System.in);
	
	public static int leerEntero(){
		return Leer.nextInt();		
	}
	
	public static double leerDouble(){
		return Leer.nextDouble();		
	}
	
	public static char leerCaracter(){
		return Leer.nextLine().charAt(0);		
	}
	
	public static String leerCadena(){
		return Leer.nextLine();		
	}

}
