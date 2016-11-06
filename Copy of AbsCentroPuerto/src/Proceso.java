
public class Proceso extends ElementoOrdenado {
	private int memoria;
	
	public Proceso(int m, String n){
		super(n);
		memoria = m;
	}
	public int getAtr() {
		return memoria;
	}
}
