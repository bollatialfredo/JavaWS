import java.util.*;

public class IteradorPorISBN implements Iterator<Libro> {
	
	private int pos = 0;
	private List<Libro> l;
	private int codigoSeguridad = 40;
	
	public IteradorPorISBN(List<Libro> lista){
		l = lista;
	}
	
	@Override
	public boolean hasNext() {
		return pos<l.size();
	}

	@Override
	public Libro next() {
		Libro lib = l.get(pos);
		while (lib.getISBN() == codigoSeguridad){
			pos++;
			if (pos<l.size()) {
				lib = l.get(pos);
			}else{
				return null;
			}
		}
		pos++;
		return lib;
	}

}
