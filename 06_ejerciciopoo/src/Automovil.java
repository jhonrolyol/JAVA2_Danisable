
public class Automovil {
	// Atributos o caracteristicas
	   String marca;
	   int modelo;
	   int precio;
	   
	   boolean estado = false;
	   
    // Definici�n de un constructor
	   public Automovil() {
		   System.out.println("Se creo un objeto de tipo automovil");
	   }
	   
	
	// M�todos o acciones
	   public void encender(){
		   if (estado == true) {
			   System.out.println("El automovil ya est� encendido");
		   } else {
			   System.out.println("El automovil ha encendido");
               estado = true;
		   }	
	   }
	   
	   public void apagar() {
		   if (estado == true) {
			   System.out.println("El automovil se apag�");
			   estado = false;			   
		   } else {
			   System.out.println("El automovil est� apagado");
		   }
	   }
	   
	   public void avanzar() {
		   if (estado == true) {
			   System.out.println("El automovil est� avanzando");   
		   } else{
			   System.out.println("El automovil no puede avanzar apagado");
		   }		   
	   }
}
