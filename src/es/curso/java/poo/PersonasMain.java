package es.curso.java.poo;

public class PersonasMain {

	public static void main (String[] args) {
		
		//Izquierda es variable, derecha se está creando el objeto
		Persona p1 = new Persona();
		//Si intento pintar un objeto JAVA no sabe pintar la información, 
		//pinta la posición de memoria
		//System.out.println(p1);
		System.out.println(p1.nombre);
		System.out.println(p1.edad);
		
		
		p1.nombre = "Eva";
		System.out.println(p1.nombre);
		
		
		
		
	}
	
}
