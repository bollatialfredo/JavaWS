import java.util.Vector;

public class Trabajo2 {
	
	private String nombre;
	public Vector<String> palabrasClave = new Vector<String>();
	
	public Trabajo2(String nom){
		nombre = nom;
	}
	public void addPalabraClave(String p){
		palabrasClave.add(p);
	}
	public boolean puedoSerEvaluado(Evaluador2 e){
		for (int i = 0; i < palabrasClave.size(); i++) {
			if (!contienePalabra(palabrasClave.elementAt(i), e)) {
				return false;
			}
		}
		return true;
	}
	public boolean contienePalabra(String s, Evaluador2 e){
		return e.contienePalabra(s);
	}
	
	public String getNombre(){
		return nombre;
	}
}