
public class Sim {
	
	public static void main(String[] args){
		
		Alarma al = new AlarmaLuminosa();
		Alarma ala = new Alarma();
		ala.mov = true;
		ala.Comprobar();
		((AlarmaLuminosa) al).imprimir();

	}
}
