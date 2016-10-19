package kk;

import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
		
		System.out.print("Ingrese Entero: ");
		Scanner leer = new Scanner(System.in);
		int entero = leer.nextInt();
		System.out.println("Entero ingresado: "+entero);
		
//		System.out.print("Ingrese Decimal: ");
//		double doble = leer.nextDouble();
//		System.out.println("Decimal ingresado: "+doble);
//		
//		System.out.print("Ingrese Cadena: ");
//		String cadena = leer.nextLine();
//		System.out.println("Decimal ingresado: "+cadena);
	}

}
