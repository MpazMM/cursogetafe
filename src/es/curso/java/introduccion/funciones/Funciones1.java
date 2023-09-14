package es.curso.java.introduccion.funciones;

import java.util.Scanner;

public class Funciones1 {
	
	public static void main (String[] args) {
		
		
		Funciones1 f1 = new Funciones1(); // Es un objeto de la propia clase
		String msg = new String ("Hola");
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		
		Math.random();
		f1.metodo1();
		Funciones2.metodo3();
		Funciones2 f2 = new Funciones2();
		f2.metodo4();
		
		for (String valor : args) {
			System.out.println(valor);
		}
		
	}
	
	//Declaracion de un método
		//Modificador de acceso:
			//public: desde cualquier clase vamos a poder acceder a ese método
			//private: sólo se puede acceder desde la clase en la que está definido
			//package (defecto) : solo la propia clase y las clases que están en el mismo paquete tienen acceso a ese mismo método, no se indica con nada.
			//protected: igual que package pero las clases hijas aunque estén en diferentes paquetes tendrán acceso.
	
		//Static. Algo que va a permanecer en la memoria desde la ejecución de mi programa y voy a poder acceder de forma directa.
	void metodo1() {
		System.out.println("Metodo1");
	}
	
}
