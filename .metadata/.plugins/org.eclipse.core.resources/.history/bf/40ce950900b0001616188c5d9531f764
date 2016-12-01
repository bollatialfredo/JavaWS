package nodoParcial;

import java.util.Iterator;
import java.util.*;

public class IteradorNodo implements Iterator<Comparable> {
	private List<Comparable> values = new ArrayList<Comparable>();
	int pos=0;
	
	public IteradorNodo(Nodo n){
		valor(n);
	}
	
	public void valor(Nodo n){
		values.add(n.value());
		System.out.println(n.value());
		if (n.nodoSig!=null){
			valor(n.nodoSig);
			System.out.println(n.nodoSig.value());
		}
	}
	
	@Override
	public boolean hasNext() {
		return values.size()<pos;
	}

	@Override
	public Comparable next() {
		Comparable c = values.get(pos);
		pos++;
		return c;
	}

}
