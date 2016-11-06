import java.util.Vector;

public class Medicamento {
	
	private float precio;
	private String nombre;	
	private Vector<String> sintomas = new Vector<String>();
	
	public Medicamento (float precio, String nombre) {
		this.precio = precio;
		this.nombre = nombre;
	}
	
	public void addSintoma (String s) {
		sintomas.add(s);
	}
	
	public boolean contiene(String s){
		return sintomas.contains(s);
	}
	public String getNombre(){
		return nombre;
	}
	public float getPrecio(){
		return precio;
	}
}
