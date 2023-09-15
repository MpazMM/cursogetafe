package es.curso.java.introduccion.utils;

import java.util.Scanner;

public class PedirNum {
	
	
	public static void main (String [] args){
		
		System.out.println("Introduce tu año de nacimiento.");
		int numIntroducido = 0;
		System.out.println(pideNum(numIntroducido));
	}
	
	
	public static int pideNum (int num) {
		Scanner scan = new Scanner(System.in);
			num = scan.nextInt();
		return num;
		
	}

}
