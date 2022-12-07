
public class Automovil {
	// Atributos o caracteristicas
	   String marca;
	   int modelo;
	   int precio;
	   
	   boolean estado = false;
	   
    // Definición de un constructor
	   public Automovil() {
		   System.out.println("Se creo un objeto de tipo automovil");
	   }
	   
	
	// Métodos o acciones
	   public void encender(){
		   if (estado == true) {
			   System.out.println("El automovil ya está encendido");
		   } else {
			   System.out.println("El automovil ha encendido");
               estado = true;
		   }	
	   }
	   
	   public void apagar() {
		   if (estado == true) {
			   System.out.println("El automovil se apagó");
			   estado = false;			   
		   } else {
			   System.out.println("El automovil está apagado");
		   }
	   }
	   
	   public void avanzar() {
		   if (estado == true) {
			   System.out.println("El automovil está avanzando");   
		   } else{
			   System.out.println("El automovil no puede avanzar apagado");
		   }		   
	   }
}
