
public class Venta {
	private String nombre;
	private float valor;
	
	public Venta (String nombre, float valor) {
		this.nombre = nombre;
		this.valor = valor;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public float getValor(){
		return valor;
	}
	public String toString(){
		return nombre + " " + valor+" \n";
	}
}
