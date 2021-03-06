import java.util.Iterator;
import java.util.Vector;

public abstract class IteradorNodos implements Iterator<Comparable> {
	
	Vector<Comparable>valores;
	int pos;
	
	public IteradorNodos(Nodo arbol){
		pos=0;
		valores=new Vector<Comparable>();
		valores=this.getValores(arbol);
		
	}
	
	protected abstract Vector<Comparable> getValores(Nodo Arbol);
	
	public Vector<Comparable> getVector () {
		return valores;
	}
	@Override
	public boolean hasNext() {
		return pos<this.valores.size();
	}

	@Override
	public Comparable next() {
		Comparable aux=this.valores.elementAt(pos);
		pos++;
		return aux;
	}


}
