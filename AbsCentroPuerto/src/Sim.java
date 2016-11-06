
public class Sim {
	public static void main(String[] args) {
		CentroDeComputos c = new CentroDeComputos();
		PC pc1 = new PC(100, "pc1");
		PC pc2 = new PC(120, "pc2");
		PC pc3 = new PC(80, "pc3");
		PC pc4 = new PC(900, "pc4");
		Proceso p1 = new Proceso(34, "p1");
		Proceso p2 = new Proceso(50, "p2");
		Proceso p3 = new Proceso(76, "p3");
		Proceso p4 = new Proceso(10, "p4");
		
		c.addConsumidor(pc1);
		c.addConsumidor(pc2);
		c.addConsumidor(pc3);
		c.addConsumidor(pc4);
		c.addProveedor(p1);
		c.addProveedor(p2);
		c.addProveedor(p3);
		c.addProveedor(p4);
		System.out.println(c.toString());
		c.Procesar();
		c.addProveedor(p1);
		System.out.println(c.toString());
//		Puerto p = new Puerto();
//		Camion c1 = new Camion("cam1");
//		Camion c3 = new Camion("cam3");
//		Camion c2 = new Camion("cam2");
//		Barco b1 = new Barco("barco1", 200);
//		Barco b2 = new Barco("barco2", 34);
//		Barco b3 = new Barco("barco3", 290);
//		p.addProveedor(c1);
//		p.addProveedor(c2);
//		p.addProveedor(c3);
//		p.addConsumidor(b1);
//		p.addConsumidor(b2);
//		p.addConsumidor(b3);
//		System.out.println(p.toString());
//		p.Procesar();
//		System.out.println(p.toString());
	}
}
