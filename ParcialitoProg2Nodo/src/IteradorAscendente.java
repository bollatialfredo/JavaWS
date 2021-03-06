import java.util.ArrayList;
import java.util.List;

public class IteradorAscendente extends IteradorNodo{
	
	public IteradorAscendente(Nodo n){
		lista = new ArrayList<Comparable>();
		lista.addAll(valores(n));
	}
	
	@Override
	protected List<Comparable> valores(Nodo n){
		List<Comparable> l = new ArrayList<Comparable>();
		if(n.nodoIzq()!= null){
			l.addAll(valores(n.nodoIzq()));
		}
		l.add(n.getValor());
		if(n.nodoDer()!= null){
			l.addAll(valores(n.nodoDer()));
		}
		return l;
	}
}
