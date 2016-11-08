import java.util.*;

public class Biblioteca {
	List<Libro>libros;
	Comparator<Libro> comparador;
	
	public Biblioteca(){
		libros=new ArrayList<Libro>();	
		comparador=new Comparadorporisbn();
	}
	
	public void addLibro(Libro l){
		libros.add(l);
	}
	
	public List<Libro> Ordenar(Comparator<Libro> c){
		List<Libro> auxiliar=new ArrayList<Libro>(libros);
		Collections.sort(auxiliar, c);
		return auxiliar;
		
	}
	
	public List<Libro> OrdenarDescendente(Comparator<Libro> c){
		List<Libro> auxiliar=new ArrayList<Libro>(libros);
		Collections.sort(auxiliar, Collections.reverseOrder(c));
		return auxiliar;
		
		
	}
	

}
