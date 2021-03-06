import java.util.ArrayList;
import java.util.List;

public class Nodo {
	
	private Nodo nodoDer;
	private Nodo nodoIzq;
	private Comparable c;
	
	public Nodo(Comparable co){
		c = co;
	}
	public void add(Comparable co){
		if(c.compareTo(co)>= 0){
			if(nodoIzq != null)
				nodoIzq.add(co);
			else
				nodoIzq = new Nodo(co);	
		}else{
			if(nodoDer != null)
				nodoDer.add(co);
			else
				nodoDer = new Nodo(co);
		}
	}
	
	public Nodo nodoDer(){
		return nodoDer;
	}
	public Nodo nodoIzq(){
		return nodoIzq;
	}
	
	public Comparable getValor(){
		return c;
	}
}
