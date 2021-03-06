import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.*;

public class iteradorFrecuencia implements Iterator<String>{
	List<Entry<String,Integer>>elems;
	int pos;
	
	public iteradorFrecuencia(Set<Entry<String,Integer>> elementos){
		elems=new ArrayList<Entry<String,Integer>>(elementos);
		
		
		Collections.sort(elems, new Comparator<Entry<String,Integer>>(){
			
			public int compare(Entry<String,Integer> e1, Entry<String,Integer> e2){
				return e1.getValue().compareTo(e2.getValue());			
			}
		});
		
	}

	@Override
	public boolean hasNext() {
		return pos<elems.size();
	}

	@Override
	public String next() {
		int aux=pos;
		pos++;
		return elems.get(aux).getKey();
	}

}