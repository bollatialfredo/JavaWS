
public class AlarmaLuminosa extends Alarma {
	
	boolean puerta = false;
	
	private Luz luz = new Luz();
	
	public boolean Comprobar(){
		if ((puerta || ventana || mov)==true) {
			SenialSonora.Sonar();
			luz.encender();
			return true;
		}
		System.out.println("todo ok");
		return false;
	}
	public void imprimir(){
		System.out.println("asd");
		
	}
}
