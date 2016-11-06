import java.util.Vector;


public class ClientePorAutor extends Cliente{
	
	Vector <String> autoresPreferidos;
	
	public ClientePorAutor(String nombre, CategoriaDescuento categoriaDescuento) {
		super(nombre, categoriaDescuento);
		autoresPreferidos = new Vector <String>();
	}

	public void addAutores(String autor){
		
		autoresPreferidos.add(autor);	
	}
	
	public boolean leGustaElLibro(Libro l){
		
		return(super.coincideGenero(l) && leGustaElAutor(l));
		
	}
	
	public boolean leGustaElAutor(Libro l){
		
		return autoresPreferidos.contains(l.getAutor());
		
	}
	
}
