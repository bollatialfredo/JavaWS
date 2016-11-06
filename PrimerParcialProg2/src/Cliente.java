import java.util.Vector;

public class Cliente {
	
	String nombre;
	CategoriaDescuento categoriaDescuento;
	Vector <String> generosPreferidos;
	
	public Cliente(String nombre, CategoriaDescuento categoriaDescuento){
		
		this.nombre = nombre;
		this.categoriaDescuento = categoriaDescuento;
		generosPreferidos = new Vector <String>();
	}
	
	public void addGenero(String genero){
		
		generosPreferidos.add(genero);	
	}
	
	public void cambiarEstatus(CategoriaDescuento nuevoStatus){
		
		categoriaDescuento = nuevoStatus;
	}

	public boolean leGustaElLibro(Libro l) {
		
		return coincideGenero(l);
				
	}
	
	public boolean coincideGenero(Libro l){
				
		for (String genero : generosPreferidos) {
			
			if(l.contieneGenero(genero)){
				
				return true;
				
			}
		}
		
		return false;
		
	}
	
	public double cuantoSale(Libro l){
		
		return categoriaDescuento.getPrecioConDescuento(l);
		
	}
	
	
	
	
}
