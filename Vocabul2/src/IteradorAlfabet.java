import java.util.*;

public class IteradorAlfabet implements Iterator<Object> {
	
	private List<String> lista;
	private int pos = 0;
	
	public IteradorAlfabet(Set<String> ks){
		lista = new ArrayList<String>(ks);
		Collections.sort(lista);
	}
	
	@Override
	public boolean hasNext() {
		return pos<lista.size();
	}

	@Override
	public String next() {
		pos ++;
		return lista.get(pos-1);
	}
	
}
