
public class CongAgua extends ProductoRef {
	
	private int gramosXLitro;
	
	public CongAgua(String nom, String fe, String fee, String gra, int n, String t, int co, int gramos) {
		super(nom, fe, fee, gra, n, t, co);
		gramosXLitro = gramos;
	}
	
	public void print(){
		super.print();
		System.out.println("Gramos de sal por litro de agua: "+gramosXLitro);
	}
	
}
