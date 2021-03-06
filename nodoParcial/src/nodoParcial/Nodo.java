package nodoParcial;

import java.util.Iterator;

public class Nodo implements Iterable {
	
	Nodo nodoSig;
	private Comparable cmp;
	private Iterator<Comparable> it;
	
	public Nodo(Comparable c){
		cmp = c;
		it = iterator();
	}
	
	public void add(Comparable c){
		if(cmp.compareTo(c)>0){
			if (nodoSig!=null) {
				nodoSig.add(c);
			}else{
				nodoSig = new Nodo(c);
			}
		}else{ 
			if(nodoSig!=null){
				nodoSig.add(cmp);
				cmp = c;
			}else{
				nodoSig = new Nodo(cmp);
				cmp = c;
			}
		}
	}
	
	public boolean haySiguiente(){
		return nodoSig != null;
	}
	
	public Comparable value(){
		return cmp;
	}
	
	public int size(){
		int cant = 1;
		if(it.hasNext()){
			cant += nodoSig.size();
		}
		return cant;
	}
	
	@Override
	public String toString() {
		String msj = "";
		while (it.hasNext()) {
			msj += it.next().toString()+" ";
		}
		msj+=cmp.toString();
		return msj;
	}

	@Override
	public Iterator<Comparable> iterator() {
		if(it!=null){
			return it;
		}
		it = new IteradorNodo(this);
		return it;
	}
}
