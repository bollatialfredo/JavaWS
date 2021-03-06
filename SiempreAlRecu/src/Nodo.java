import java.util.Iterator;


public class Nodo implements Iterable {
	
	Nodo nodoSig;
	Comparable comp;
	Iterator it;
	
	public Nodo(Comparable c){
		comp = c;
	}
	
	public void add(Comparable c){
		if(comp.compareTo(c)>0){
			if (nodoSig!=null) {
				nodoSig.add(c);
			}else{
				nodoSig = new Nodo(c);
			}
		}else{ 
			if(nodoSig!=null){
				nodoSig.add(comp);
				comp = c;
			}else{
				nodoSig = new Nodo(comp);
				comp = c;
			}
		}
	}
	
	public Nodo nodoS(){
		return nodoSig;
	}
	public  Comparable valor(){
		return comp;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
