package retornoDeValor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creamos un objeto de tipo transporte.
		Transporte t = new Transporte(5000);
		
		int valor = 0;
		valor = t.precio();
		
		System.out.println("La funci�n devolvi� el valor: " + valor);

	}

}
