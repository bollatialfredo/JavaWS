import java.util.Vector;

public class Poster2 extends Trabajo2 {
	
	private Vector<String> palabrasClave = new Vector<String>();
	
	public Poster2(String nom) {
		super(nom);
	}
	
	@Override
	public boolean puedoSerEvaluado(Evaluador2 e) {
		for (int i = 0; i < palabrasClave.size(); i++) {
			if (e.contienePalabra(palabrasClave.elementAt(i))) {
				return true;
			}
		}
		return false;
	}
	
	public void addPalabraClave(String p){
		palabrasClave.add(p);
	}
}