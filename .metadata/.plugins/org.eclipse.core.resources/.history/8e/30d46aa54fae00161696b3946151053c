import java.util.Iterator;
import java.util.List;

public abstract class IteradorNodo implements Iterator<Comparable> {
	
	protected List<Comparable> lista;
	private int pos;
	
	protected abstract List<Comparable> valores(Nodo n);
	
	@Override
	public boolean hasNext() {
		return pos < lista.size();
	}

	@Override
	public Comparable next() {
		Comparable c = lista.get(pos);
		pos++;
		return c;
	}
}
