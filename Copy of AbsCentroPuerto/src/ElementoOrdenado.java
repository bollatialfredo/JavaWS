import java.util.Vector;

public abstract class ElementoOrdenado {

	private String nombre;
	
	public ElementoOrdenado(String n){
		nombre = n;
	}
	
	public abstract int getAtr();
	
	public String toString(){
		return nombre;
	}
	
	public void insertarOrdenado(Vector<ElementoOrdenado> c){
		int pos=0;
		while(pos<c.size() && c.elementAt(pos).getAtr()<this.getAtr()){
			pos++;
		}
		c.insertElementAt(this, pos);
	}
}