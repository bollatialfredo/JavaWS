
public class main {
	public main() {
		Carta c1=new Carta(1);
		Carta c2=new Carta(2);
		Carta c3=new Carta(3);
		Carta c4=new Carta(4);
		Carta c5=new Carta(5);
		Carta c6=new Carta(6);
		Carta c7=new Carta(7);
		Carta c8=new Carta(8);
		Carta c9=new Carta(9);
		Carta c10=new Carta(10);
		Carta c11=new Carta(11);
		Carta c12=new Carta(12);
		Carta c13=new Carta(13);
		
		
		
		Jugador j1=new Jugador("Nicolas");
		Jugador j2=new Jugador("Alfredo");
		
		Juego juegonuevo=new Juego(j1,j2);
		
		juegonuevo.addCarta(c13);
		juegonuevo.addCarta(c12);
		juegonuevo.addCarta(c11);
		juegonuevo.addCarta(c10);
		juegonuevo.addCarta(c9);
		juegonuevo.addCarta(c8);
		juegonuevo.addCarta(c7);
		juegonuevo.addCarta(c6);
		juegonuevo.addCarta(c5);
		juegonuevo.addCarta(c4);
		juegonuevo.addCarta(c3);
		juegonuevo.addCarta(c2);
		juegonuevo.addCarta(c1);
		
		juegonuevo.jugar();
		
		System.out.println(juegonuevo.juno.cantidadCartas());
		//System.out.println(juegonuevo.jdos.cantidadCartas());
		
		
		
		
	}

}
