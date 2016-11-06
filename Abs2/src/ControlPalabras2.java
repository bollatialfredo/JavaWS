import java.util.Vector;

public abstract class ControlPalabras2 {
	
//	public boolean equals(Object o){
//		return false;
//		
//	}
//	
	
	String nombre;
	Vector <String> palabrasClave = new Vector<String>();

	public String getNombre(){
		return nombre;
	}
	
	public void addPalabraClave(String p){
		palabrasClave.add(p);
	}
	
	public Vector<String> getPalabrasClave(){
		return palabrasClave;
	}
	
	public abstract boolean esApto(ControlPalabras2 c);
}
