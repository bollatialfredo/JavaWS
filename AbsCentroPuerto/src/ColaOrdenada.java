import java.util.Vector;

public abstract class ColaOrdenada {

	private String nombre;
	
	public ColaOrdenada(String n){
		nombre = n;
	}
	
	public abstract int getAtr();
	
	public String toString(){
		return nombre;
	}
	
	public void insertarseOrdenado(Vector<ColaOrdenada> c){
		int pos=0;
		while(pos<c.size() && c.elementAt(pos).getAtr()<this.getAtr()){
			pos++;
		}
		c.insertElementAt(this, pos);
	}
}