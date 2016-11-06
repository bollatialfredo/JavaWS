import java.util.Iterator;
import java.util.*;

public class Vocabulario implements Iterable<Object> {

	private Map<String, Integer> mapa = new HashMap<String, Integer>();
	private Iterator<Object> it;
	
	public Vocabulario(String text){
		String[] t = text.split(" ");
		for (String pal : t) {
			if (mapa.containsKey(pal)) {
				mapa.put(pal, mapa.get(pal)+1);
			}else{
				mapa.put(pal, 1);
			}
		}
	}
	
	
	@Override
	public Iterator<Object> iterator() {
		if (it!=null) {
			return it;
		}else{
			it = new IteradorAlfabet(mapa.keySet());
			return it;
		}
	}
	
}
