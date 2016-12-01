package segundoParcial;
import java.util.*;
import java.util.Iterator;

public class iteradorLista implements Iterator<Comparable> {
	List<Comparable>lista;
	int pos;
	
	public iteradorLista(ListaVinculada nodo){
		lista=new ArrayList<Comparable>();
		pos=0;
		
		if(nodo.sig!=null){
			lista.add(nodo.getValor())
	}
	

		
	
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Comparable next() {
		Comparable aux=
		return null;
	}
	

}
