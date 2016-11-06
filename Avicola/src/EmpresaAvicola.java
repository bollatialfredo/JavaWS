import java.util.Vector;

public class EmpresaAvicola {
	
	
	
	public static void main(String[] args) {
		
		Vector<Producto> v = new Vector<Producto>();
		
		Producto p1 = new Producto("lalaql", "lawlal", "lalagerl", "lalaasl", 34);
		Producto p2 = new ProductoRef("lalaql", "lawlal", "lalagerl", "lalaasl", 34, "etr", 23);
		Producto p3 = new CongAgua("lalaql", "lawlal", "lalagerl", "lalaasl", 34, "ewuryqi", 30, 20);
		Producto p4 = new CongNit("lalaql", "lawlal", "lalagerl", "lalaasl", 34, "sadf", 50, "cxzv", 320);
		Producto p5 = new CongAire("lalaql", "lawlal", "lalagerl", "lalaasl", 34, "ert", 234);
		
		v.addElement(p1);
		v.addElement(p2);
		v.addElement(p3);
		v.addElement(p4);
		v.addElement(p5);
		
		
		p1.print();
		((Producto)p2).print();
		
	
	}
	
}
