import java.util.*;
public class PilaCartas {
	List<Object> lista=new ArrayList();
	
	public void push (Object o){
		lista.add(o);		
	}
	
	public Object top(){
		return lista.get(lista.size()-1);
	}
	
	public Object pop(){
		Object aux=this.top();
		lista.remove(this.top());
		return aux;
	}
	
	public int size(){
		return lista.size();
	}
}
