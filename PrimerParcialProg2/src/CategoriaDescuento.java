
public class CategoriaDescuento {
	
	String statusCliente;
	double descuento;
	
	public CategoriaDescuento(String status, double descuento){
		
		statusCliente = status;
		this.descuento = descuento;
		
	}
	
	public double getPrecioConDescuento(Libro l){
		
		return l.getPrecio() - l.getPrecio()*descuento;
		
	}
	
	
	

}
