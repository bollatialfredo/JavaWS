import java.util.*;

public class PilaDeivid {
	
	private Set<String> pila = new HashSet<String>();
	
	public PilaDeivid(String a, String b, String c){
		pila.add(a);
		pila.add(b);
		pila.add(c);
	}
	
	public String top(){
		
		Iterator<String> it = pila.iterator();
		String aux = "";
		while (it.hasNext()){
			aux = it.next();
		}
		return aux;
	}
	
	public void add(String a){
		pila.add(a);
	}
	
	public static void main(String[] args) {
		PilaDeivid p = new PilaDeivid("lala", "lolo", "como salio boquita?");
		PilaDeivid p2 = new PilaDeivid("lala", "lolo", "como salio boquita?");
		p2.add("magic");
		System.out.println(p.top());
		System.out.println(p2.top());
		System.out.println(p.top());
	}
	
}
