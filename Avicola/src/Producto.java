
public class Producto {
	private String nombre;
	private String fechaVenc;
	private String granja;
	private String fechaEnv;
	private int numLote;
	
	public Producto(String nom, String fe, String fee, String gra, int n){
		nombre = nom;
		fechaVenc = fe;
		fechaEnv = fee;
		granja = gra;
		numLote = n;
	}
	
	public void print(){
		System.out.println("Nombre del producto:"+nombre);
		System.out.println("Fecha de vencimiento: "+fechaVenc+". Fecha envasado: "+ fechaEnv);
		System.out.println("Granja de origen: "+granja);
		System.out.println("Numero de lote: "+numLote);
	}
}
