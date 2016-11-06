import java.util.*;

public class IteradorAlfabetico implements Iterator<String> {

	private List<String> elem;
	private int pos=0;
	
	public IteradorAlfabetico(Map<String, Integer> m){
		elem = new ArrayList<String>(m.keySet());
		Collections.sort(elem);
	}
	
	@Override
	public boolean hasNext() {
		return pos<elem.size();
	}

	@Override
	public String next() {
		String s = elem.get(pos);
		pos++;
		return s;
	}

}
