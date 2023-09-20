package es.curso.java.poo.ejercicios;

public class Alumno {
	

	//Variables de instancia
	String nombre;
	String apellidos;
	String dni;
	int nota;
	
	public Alumno() {
		this.nombre = "";
	}
	
	public Alumno(String dni, String nombre, String apellidos) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	public Alumno(String dni, String nombre, String apellidos, int nota) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nota = nota;
	}
	
	//métodos
	public void estudiar () {
		if (nota==0) {
			System.out.println("El alumno " + nombre + " no ha estudiado nada.");
		}else if (nota<5) {
				System.out.println("El alumno " + nombre + " ha estudiado poco");
		}else if (nota>5 && nota<9) {
			System.out.println("El alumno " + nombre + " ha estudiado mucho");
		}else if (nota==10) {
			System.out.println("El alumno " + nombre + " es un genio");
		}else {
			System.out.println("Nota incorrecta");
		}
	}

}
