import java.util.*;

public class Biblioteca implements Iterable<Libro> {
	private List<Libro> lista = new ArrayList<Libro>(); 
	private Iterator<Libro> it;
	
	public Biblioteca(){
	}
	
	public List<Libro> listaDeLibros(){
		it = iterator();
		List<Libro> aux = new ArrayList<Libro>();
		while(it.hasNext()){
			Libro lib = it.next();
			if (lib!=null) {
				aux.add(lib);
			}
		}
		return aux;
	}
	
	public void addLibro(Libro l){
		lista.add(l);
	}
	
	@Override
	public Iterator<Libro> iterator() {
		if (it!=null) {
			return it;
		}else{
			return new IteradorPorISBN(new ArrayList<Libro>(lista));			
		}
		
	}

}
