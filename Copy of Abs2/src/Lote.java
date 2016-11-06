import java.util.Vector;

public class Lote extends ContenedorPalabraClave {
	
	private String categoria;
	private int hectareas;
	private String nombre;
	private Vector<String> minerales = new Vector<String>();

	
	public Lote(String nom, String cat, int hec){
		categoria = cat;
		nombre = nom;
		hectareas = hec;
	}
	
	public boolean comparaMineral(String min){
		for (int i = 0; i < minerales.size(); i++) {
			if (minerales.elementAt(i).equals(min)) {
				return true;
			}
		}
		return false;
	}
	
	public int getHectareas(){
		return hectareas;
	}
	public void categoria(){
		System.out.println("El lote es: "+ categoria);
	}
	public void addMineral(String m){
		minerales.addElement(m);
	}
	public String getNombre(){
		return nombre;
	}

}
