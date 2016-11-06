
public class Main {
	public static void main(String[] args) {
		CentroComputo centro = new CentroComputo();
		
		Proceso p1 = new Proceso(10);
		Proceso p3 = new Proceso(30);
		
		Computadora c3 = new Computadora(100);
		Computadora c1 = new Computadora(5);
		Computadora c2 = new Computadora(25);
		
		centro.addComputadora(c2);
		centro.addComputadora(c1);
		centro.addComputadora(c3);
		
		centro.addProceso(p1);
//		centro.addProceso(p2);
//		centro.addProceso(p3);
		
		
		
		System.out.println(centro.printPCS());
	}
}