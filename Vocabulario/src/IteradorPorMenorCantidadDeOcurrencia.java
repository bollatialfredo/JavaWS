import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class IteradorPorMenorCantidadDeOcurrencia implements Iterator<String> {
	private List<String> palabras;
	private int pos=0;
	public IteradorPorMenorCantidadDeOcurrencia(Map<String,Integer> m){
		palabras = new ArrayList<String>(m.keySet());
		
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
