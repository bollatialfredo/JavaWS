import java.util.Vector;

public class Evaluador2 {
	
	private String nombre;
	private String categoria;
	private Vector<String> palabrasClave = new Vector<String>();
		
	public Evaluador2(String nom){
		nombre = nom;
	}
	public void addPalabraClave(String p){
		palabrasClave.add(p);
	}
	public boolean contienePalabra(String p){
		for (int i = 0; i < palabrasClave.size(); i++) {
			if (palabrasClave.elementAt(i).equals(p)) {
				return true;
			}
		}
		return false;
	}
	public String getNombre(){
		return nombre;
	}
	public String getCategoria(){
		return categoria;
	}
}
