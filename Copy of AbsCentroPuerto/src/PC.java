
public class PC extends ElementoOrdenado {
	private int velocidad;
	
	public PC(int v, String n){
		super(n);
		velocidad = v;
	}
	public int getAtr() {
		return velocidad;
	}
}
