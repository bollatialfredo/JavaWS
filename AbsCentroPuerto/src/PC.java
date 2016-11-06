
public class PC extends ColaOrdenada {
	private int velocidad;
	
	public PC(int v, String n){
		super(n);
		velocidad = v;
	}
	public int getAtr() {
		return velocidad;
	}
}
