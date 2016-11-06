
public class Producto {
	
	private String nombre;
	private String marca;
	private float precio;
	private ControlStock cs;
	private Impuesto imp = null;
	
	public Producto(String nombre, String marca, float p){
		this.setNombre(nombre);
		precio = p;
		this.marca = marca;
	}
	
	public Producto(String nombre, String marca, float p, int cantStock, Impuesto i){
		this.setNombre(nombre);
		precio = p;
		this.marca = marca;
		imp = i;
	}
	
	public float getPrecio(int cant){
		if (imp == null) {
			return cant*precio;
		}
		return imp.precioConImpuesto(precio)*cant;
	}
	
	public void setImpuesto(Impuesto i){
		imp = i;
	}
	
	public void setControlStock (ControlStock c) {
		cs = c;
	}
	
	public void modificarStock(int i){
		cs.modificarStock(i);;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
