
public class Barco extends ElementoOrdenado{
	private int capacidad;
	
	public Barco(String n, int c){
		super(n);
		capacidad = c;
	}
	
	public int getAtr() {
		return capacidad;
	}
}
