import java.util.*;
import java.util.Map.Entry;

public class IteradorFreq implements Iterator<Entry<String, Integer>> {
	
	private List<Entry<String, Integer>> lista;
	private int pos = 0;
	public IteradorFreq(Set<Entry<String, Integer>> entSet){
		lista = new ArrayList<Entry<String, Integer>>(entSet);
		Collections.sort(lista, new Comparator<Entry<String, Integer>>(){

			@Override
			public int compare(Entry<String, Integer> arg0, Entry<String, Integer> arg1) {
				return arg1.getValue().compareTo(arg0.getValue());
			}			
		});
	}
	
	
	@Override
	public boolean hasNext() {
		return pos<lista.size();
	}

	@Override
	public Entry<String, Integer> next() {
		pos++;
		return lista.get(pos-1);
	}

}
