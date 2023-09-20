package es.curso.java.poo.ejercicios;

public class AlumnoMain {


		public static void main(String[] args) {
			
	
			Alumno p1 = new Alumno();
			p1.dni = "123";
			p1.nombre = "María";
			p1.apellidos = "Montaño García";
			p1.nota = 3;
			p1.estudiar();
			
			Alumno p2 = new Alumno("456","Raúl","Pérez Gzlez");
			p2.nota = 8;
			p2.estudiar();
			
			Alumno p3 = new Alumno("789","Rosa","Lopez Muñoz",10);
			p3.estudiar();
			
			String [][] alumnos = new String [][];
			
					
			
	

		}


	
}
