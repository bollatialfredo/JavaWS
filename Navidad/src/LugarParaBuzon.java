import java.util.Vector;

public class LugarParaBuzon extends ElementoContenedor {
	private String nombre;
	private Vector<Buzon> buzones = new Vector<Buzon>();
	
	public LugarParaBuzon(String a){
		nombre = a;
	}
	public void addBuzon(Buzon b){
		buzones.addElement(b);
	}
	
	public String getNombre(){
		return nombre;
	}
		
	
	@Override
	public int getCantidadCartas() {
		int aux = 0;
		for (int i = 0; i < buzones.size(); i++) {
			aux += buzones.elementAt(i).cantCartas();
		}
		return aux;
	}
	
	@Override
	public int getCantidadCartasRegalo(String s) {
		int aux = 0;
		for (int i = 0; i < buzones.size(); i++) {
			aux += buzones.elementAt(i).getCantidadCartasRegalo(s);
		}
		return aux;
	}
}
