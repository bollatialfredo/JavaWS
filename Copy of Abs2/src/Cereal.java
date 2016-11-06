import java.util.Vector;

public class Cereal {
	
	private String nombre;
	private Vector<String> minerales = new Vector<String>();
	
	public Cereal(String nom){
		nombre = nom;
	}
	
	public void addMineral(String m){
		minerales.addElement(m);
	}
	public String getNombre(){
		return nombre;
	}
	public boolean puedoSembrarme(Lote l){
		for (int i = 0; i < minerales.size(); i++) {
			if(!l.comparaMineral(minerales.elementAt(i))){
				return false;
			}
		}
		return true;
	}

}
