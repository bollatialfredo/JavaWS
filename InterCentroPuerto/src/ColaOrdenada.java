import java.util.*;

public class ColaOrdenada {
	List<Comparable> cola = new ArrayList<Comparable>();
	
	public ColaOrdenada(){
		
	}
	
	public void add(Comparable oC){
		cola.add(oC);
		Collections.sort(cola);
	}
	
	public void procesar(){
		cola.remove(cola.size()-1);
			
	}
	
	public boolean vacia(){
		return cola.isEmpty();
	}
	
	public String print(){
		String msj=" ";
		for (Comparable comp : cola) {
			msj += comp.toString()+"   ";
		}
		return msj;
	}
}
