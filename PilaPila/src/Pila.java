import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pila {

	private List<Object> lista;
	
	public Pila(){
		lista = new ArrayList<Object>();
	}
	public Pila(List l){
		lista = new ArrayList<Object>(l);
	}
	
	
	public Object top(){
		
			return lista.get(lista.size()-1);
		
	}
	public Object pop(){
		Object o = top();
		lista.remove(top());
		return o;
	}
	
	public void push(Object o){
		lista.add(o);
	}
	private void reverseOrder(){
		Collections.reverse(lista);
	}
	
	public Pila reverse(){
		Pila aux = new Pila(lista);
		aux.reverseOrder();
		return aux;
	}
	public Pila copy(){
		Pila aux = new Pila();
		for (Object o : lista) {
			aux.push(o);
		}
		return aux;
	}
	
	public int size(){
		return lista.size();
	}
	
	public static void main(String[] args) {
		Pila p = new Pila();
		p.push("nose");
		p.push("eloy");
		p.push("Deivid");
		p.push(23);
		p.push(true);
		Pila p2 = p.reverse();
		p.pop();
		System.out.println(p2.top().toString());
		System.out.println(p.top().toString());
	}
}
