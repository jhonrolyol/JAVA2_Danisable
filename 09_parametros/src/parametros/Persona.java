package parametros;

public class Persona {
	
	// Creamos dos variables-
	String nombre = "";
	int edad = 0;	
	
	// Definimos un constructor.
	public Persona(String nom, int age) {
		
		this.nombre = nom;
		this.edad = age;
		
		//System.out.println("El objeto " + nombre + " se creó");
		System.out.println("El objeto " + nombre + " tiene " + edad + " años");
	}

}
