public class Alarma {
	
	boolean ventana = false;
	boolean puerta = false;
	boolean mov = false;
	Timbre SenialSonora = new Timbre();
	
	public boolean Comprobar(){
		if ((puerta || ventana || mov)==true) {
			SenialSonora.Sonar();
			return true;
		}
		System.out.println("todo ok");
		return false;
	}
}
