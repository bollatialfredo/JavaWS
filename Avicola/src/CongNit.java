
public class CongNit extends ProductoRef {
	
	private int tiempo;
	private String metodo;
	
	public CongNit(String nom, String fe, String fee, String gra, int n, String t, int co, String met, int ti) {
		super(nom, fe, fee, gra, n, t, co);
		tiempo = ti;
		metodo = met;
	}
	
	public void print(){
		super.print();
		System.out.println("Tiempo de congelacion: "+tiempo);
		System.out.println("Metodo de congelado: "+metodo);
	}
	
}
