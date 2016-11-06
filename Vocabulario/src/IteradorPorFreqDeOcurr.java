import java.util.*;

public class IteradorPorFreqDeOcurr implements Iterator<String> {
	private int pos = 0;
	private List<String> palabras;
	
	public IteradorPorFreqDeOcurr(Map<String, Integer> m){
		palabras = new ArrayList<String>(m.keySet());
		Collections.sort(palabras, new Comparator<String>(){

			@Override
			public int compare(String s1, String s2) {
				if (m.get(s1)>m.get(s2)) {
					return -1;
				}else{
					if (m.get(s1)<m.get(s2)) {
						return 1;
					}
				}
				
				return 0;
			}
			
		});
	}
	
	
	@Override
	public boolean hasNext() {
		return pos<palabras.size();
	}

	@Override
	public String next() {
		String s = palabras.get(pos);
		pos++;
		return s;
	}

}
