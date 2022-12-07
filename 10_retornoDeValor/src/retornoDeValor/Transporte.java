package retornoDeValor;

public class Transporte {
	
	// Declaramos atributos.
	int precio = 0;
	
	
	
	// Creamos un constructor.
	// Asignamos un par�metro a transporte "precio".
	public Transporte(int precio) {
		// 
		this.precio = precio;
		System.out.println("Se cre� un objeto transporte");
		
	}
	
	// M�todo precio.
	// Esta funci�n devuelve el valor cincuenta.
	public int precio() {
		// Realiza una serie de instrucciones que devuelven un vlor.
		// Por ejemplo:
		// this.precio++; // Aumentar el precio en +1.
		this.precio--; // Disminuir el precio en -1.
		
		return this.precio;
	}

}
