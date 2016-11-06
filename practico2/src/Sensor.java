
public class Sensor {
	
	private String parteCasa;
	private boolean disparar = false;
	
	public Sensor(String a){
		parteCasa = a;
	}
	
	public String getParteCasa(){
		return parteCasa;
	}
	
	public void Disparar(){
		disparar = true;
	}
	public boolean estadoDeSensor(){
		return disparar;
	}
	public void imprimir(){
		System.out.println("alarma disparada en: " + parteCasa);
	}
}
