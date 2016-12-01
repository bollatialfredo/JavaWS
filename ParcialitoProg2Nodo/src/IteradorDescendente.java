import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IteradorDescendente extends IteradorNodo {
	
	
	public IteradorDescendente(Nodo no){
		lista = new ArrayList<Comparable>();
		lista.addAll(valores(no));
	}

	@Override
	protected List<Comparable> valores(Nodo n){
		List<Comparable> l = new ArrayList<Comparable>();
		if(n.nodoDer()!= null){
			l.addAll(valores(n.nodoDer()));
		}
		l.add(n.getValor());
		if(n.nodoIzq()!= null){
			l.addAll(valores(n.nodoIzq()));
		}
		return l;
	}
}
