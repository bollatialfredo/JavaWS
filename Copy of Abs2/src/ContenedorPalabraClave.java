import java.util.Vector;

public abstract class ContenedorPalabraClave {
	
	private Vector<String> palabrasClave = new Vector<String>();

	
	public boolean comparaPalClave(String p){
		for (int i = 0; i < palabrasClave.size(); i++) {
			if (palabrasClave.elementAt(i).equals(p)) {
				return true;
			}
		}
		return false;
	}
}
