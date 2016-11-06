import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pila {

	private List<Object> nombreDeUnaLista = new ArrayList<Object>();
	
	public Object top(){
		
			return nombreDeUnaLista.get(nombreDeUnaLista.size()-1);
		
	}
	public Object pop(){
		Object o = top();
		nombreDeUnaLista.remove(top());
		return o;
	}
	
	public void push(Object o){
		nombreDeUnaLista.add(o);
	}
	
	public Pila reverse(){
		Pila aux = new Pila();
		List<Object> aux2 = new ArrayList<Object>();
		aux2=nombreDeUnaLista;
		Collections.reverse(aux2);
		for (Object o : aux2) {
			aux.push(o);
		}
		return aux;
	}
	public Pila copy(){
		Pila aux = new Pila();
		for (Object o : nombreDeUnaLista) {
			aux.push(o);
		}
		return aux;
	}
	
	public int size(){
		return nombreDeUnaLista.size();
	}
	
	public static void main(String[] args) {
		Pila p = new Pila();
		p.push("nose");
		p.push("eloy");
		p.push("Deivid");
		p.push(23);
		p.push(true);
		p = p.reverse();
		p.pop();
		System.out.println(p.top().toString());
	}
}
