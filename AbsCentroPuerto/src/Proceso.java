
public class Proceso extends ColaOrdenada {
	private int memoria;
	
	public Proceso(int m, String n){
		super(n);
		memoria = m;
	}
	public int getAtr() {
		return memoria;
	}
}
