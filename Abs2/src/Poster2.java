import java.util.Vector;

public class Poster2 extends Trabajo2 {
	
	public Poster2(String nom) {
		super(nom);
	}

	public boolean esApto(ControlPalabras2 e){
		Vector<String> aux = e.getPalabrasClave();
		for (int i = 0; i < aux.size(); i++) {
			for (int j = 0; j < this.getPalabrasClave().size(); j++) {
				if (this.getPalabrasClave().elementAt(j).equals(aux.elementAt(i))) {
					return true;
				}
			}
		}
		return false;
	}
}