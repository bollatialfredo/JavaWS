
public class CongAire extends ProductoRef {
	
	private int Pnit = 27;
	private int Pdiox = 23;
	private int Pvap = 26;
	private int Poxig = 24;
	
	public CongAire(String nom, String fe, String fee, String gra, int n, String t, int co) {
		super(nom, fe, fee, gra, n, t, co);
	}
	
	public void print(){
		super.print();
		System.out.println("Porcentaje de nitrogreno: "+Pnit+"%");
		System.out.println("Porcentaje de dioxido de carbono: "+Pdiox+"%");
		System.out.println("Porcentaje de vapor de agua: "+Pvap+"%");
		System.out.println("Porcentaje de oxigeno: "+Poxig+"%");
	}
	
}
