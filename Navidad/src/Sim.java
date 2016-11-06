import java.util.Vector;

public class Sim {
	public static void main(String[] args) {
		Vector<ElementoContenedor> e = new Vector<ElementoContenedor>();
		LugarParaBuzon lu = new LugarParaBuzon("Polo Norte");
		Buzon b1 = new Buzon();
		Buzon b2 = new Buzon();
		e.add(b1);
		lu.addBuzon(b1);
		lu.addBuzon(b2);
		Carta c1 = new Carta("los patos 152");
		Carta c2 = new Carta("chacabuco 45");
		Carta c3 = new Carta("9 de julio 550");
		Carta c4 = new Carta("9 de jujlio 550");
		Persona p1 = new Persona(2389888, c1);
		Persona p2 = new Persona(2345432, c2);
		Persona p3 = new Persona(2930747, c3);
		Persona p4 = new Persona(2930747, c4);
		c1.addRegalo("regalo 1");
		c1.addRegalo("regalo 2");
		c1.addRegalo("regalo 4");
		c2.addRegalo("regalo 1");
		c2.addRegalo("regalo 3");
		c2.addRegalo("regalo 5");
		c3.addRegalo("regalo 1");
		c3.addRegalo("regalo 2");
		c3.addRegalo("regalo 6");
		c4.addRegalo("regalo 3");
		c4.addRegalo("regalo 5");
//		c4.addRegalo("regalo 1");
		//b2.addNinioBueno(p1);
		//b2.addNinioBueno(p2);
		b2.addNinioBueno(p3);
		b1.addNinioBueno(p4);

		//System.out.println(p1.depositar(b2));
		System.out.println(p2.depositar(b2));
		System.out.println(p3.depositar(b2));
		System.out.println(p4.depositar(b1));
		
		System.out.println("ninios malos: " + b2.buscarNinioMalo());
		System.out.println("cantidad de cartas: "+lu.getCantidadCartas());
		System.out.println("cantidad de cartas con el regalo regalo 1: "+lu.getCantidadCartasRegalo("regalo 1"));
		System.out.println(lu.porcentajeDeCartasParaUnRegalo("regalo 1"));
	}
}
