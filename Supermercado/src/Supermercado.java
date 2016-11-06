import java.util.*;

public class Supermercado {
	private String nombre;
	private Vector<Producto> productos = new Vector<Producto>();
	private Vector<Ticket> tickets = new Vector<Ticket>();
	
	public Supermercado (String nombre) {
		this.nombre = nombre;
	}
	
	public void addProducto (Producto p) {
		productos.add(p);
	}
	
	public void vender (Vector<Venta> v) {
		Ticket t = new Ticket();
		for (int i = 0; i < v.size(); i++) {
			t.addProdVendido(v.elementAt(i));
		}
		tickets.add(t);
	}
	public String toString(){
		String msj= "";
		for (int i = 0; i < tickets.size(); i++) {
			msj += tickets.elementAt(i).toString();
		}
		return msj;
	}
}
