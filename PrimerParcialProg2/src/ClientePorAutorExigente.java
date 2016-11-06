
public class ClientePorAutorExigente extends ClientePorAutor{
	
	public ClientePorAutorExigente(String nombre, CategoriaDescuento categoriaDescuento) {
		super(nombre, categoriaDescuento);
		
	}
	
	public boolean leGustaElLibro(Libro l){
		
		return super.leGustaElAutor(l) && coincidenTodosLosGeneros(l);
		
	}
	
	public boolean coincidenTodosLosGeneros(Libro l){
		
		for (String genero : generosPreferidos) {
			
			if(!l.contieneGenero(genero)){
				
				return false;	
			}
		}
		return true;
		
	}
}
