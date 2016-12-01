import java.util.*;

public class IteradorNodo implements Iterator {
	private List<Comparable> values = new ArrayList<Comparable>();
	private int pos;
	
	public IteradorNodo(Nodo n){
		pos = 0;
		cargarValores(n);
	}
	private void cargarValores(Nodo n){
		if(n.nodoSig != null){
			cargarValores(n.nodoSig);
		}
		values.add(n.comp);
	}
	
	
	@Override
	public boolean hasNext() {
		return values.size()>pos;
	}

	@Override
	public Object next() {
		Comparable c = values.get(pos);
		pos++;
		return c;
	}

}
