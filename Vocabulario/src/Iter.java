import java.util.Iterator;
import java.util.Map.Entry;
import java.util.*;

public class Iter implements Iterator<Entry<String, Integer>> {
	List<Entry<String, Integer>> lista;
	
	public Iter(Set<Entry<String, Integer>> a){
		lista = new ArrayList<Entry<String, Integer>>(a);
		Collections.sort(lista, new Comparator<Entry<String, Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return 0;
			}
			
		});
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Entry<String, Integer> next() {
		// TODO Auto-generated method stub
		return null;
	}

}
