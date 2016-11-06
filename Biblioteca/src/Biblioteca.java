import java.util.*;

public class Biblioteca {
	private List<Libro> libros;
	private Comparator<Libro> c1 = new ComparadorPorISBN();
	
	public Biblioteca () {
		libros = new ArrayList<Libro>();
	}
	
	public List<Libro> ordenarDescendente (Comparator<Libro> c) {
		List<Libro> listaOrdenada = new ArrayList<Libro>(libros);
		Collections.sort(listaOrdenada, c);
		Collections.reverse(listaOrdenada);
		return listaOrdenada;
	}
	public List<Libro> ordenarAscendente (Comparator<Libro> c) {
		List<Libro> listaOrdenada = new ArrayList<Libro>(libros);
		Collections.sort(listaOrdenada, c);
		return listaOrdenada;
	}
	
	public void agregarLibro (Libro l) {
		libros.add(l);
		Collections.sort(libros, c1);
	}
}
