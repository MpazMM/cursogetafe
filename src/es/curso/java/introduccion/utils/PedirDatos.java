package es.curso.java.introduccion.utils;

import java.util.Scanner;

public class PedirDatos {
	
	
	public static void main (String [] args){
		
		System.out.println("Introduce tu año de nacimiento.");
		String textoIntroducido = "";
		pideDatosString(textoIntroducido);
	}
	
	
	public static String pideDatosString (String texto) {
		Scanner scan = new Scanner(System.in);
			texto = scan.nextLine();
		return texto;
		
	}

}
