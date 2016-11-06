
public class ProductoRef extends Producto {
	private String temp;
	private int codigoSA;
	
	public ProductoRef(String nom, String fe, String fee, String gra, int n, String t, int co) {
		super(nom, fe, fee, gra, n);
		temp = t;
		codigoSA = co;
		
	}
	
	public void print(){
		super.print();
		System.out.println("Temperatura: "+temp);
		System.out.println("Codigo de SA: "+codigoSA);
	}
	public void f(){
		
	}
	
}
	
