
public class Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reproductor c1 = new Pista("El Tiempo No Para", 311 , "Bersuit Vergabarat", "De la cabeza", 2002, "Rock Nacional", "Comentarios");
		Reproductor c2 = new Pista("Mi caramelo", 290 , "Bersuit Vergabarat", "De la cabeza", 2002, "Rock Nacional", "Comentarios");
		Reproductor c3 = new Pista("Party Rock Anthem", 408 , "LMFAO", "Sorry for Party Rocking", 2011, "Electro Pop", "Comentarios");
		Reproductor c4 = new Pista("Sorry for Party Rocking", 421 , "LMFAO", "Sorry for Party Rocking", 2011, "Electro Pop", "Comentarios");
		Reproductor c5 = new Pista("Fix You", 255 , "Coldplay", "Sorry for Party Rocking", 2011, "Rock Alternativo", "Comentarios");
		Reproductor c6 = new Pista("Speed of Sound", 421 , "Coldplay", "Sorry for Party Rocking", 2011, "Rock Alternativo", "Comentarios");
		Reproductor c7 = new Pista("Viva la Vida", 421 , "Coldplay", "Sorry for Party Rocking", 2011, "Rock", "Comentarios");
		Reproductor c8 = new Pista("Whit or whitout you", 421 , "U2", "Sorry for Party Rocking", 2011, "Rock", "Comentarios");
		Reproductor c9 = new Pista("Vertigo", 421 , "U2", "Sorry for Party Rocking", 2011, "Electro Pop", "Comentarios");
		Reproductor c10 = new Pista("City of Blinding Lights", 421 , "U2", "Sorry for Party Rocking", 2011, "Rock", "Comentarios");
		Reproductor c11 = new Pista("A la luz de la luna", 421 , "El Indio Solari", "Sorry for Party Rocking", 2011, "Rock Nacional", "Comentarios");
		Reproductor c12 = new Pista("Yo Canibal", 421 , "Patricio Rey y sus redonditos de ricota", "Lobo Suelto, Cordero atado", 1993, "Rock Nacional", "Comentarios");
		
		Reproductor p1 = new Playlist("Clasicos del Rock");
		Reproductor p2 = new Playlist("Lo Mejor");
		Reproductor p3 = new Playlist("Coldplay");
		Reproductor p4 = new Playlist("El indio");
		
		p1.addElem(c1);
		p1.addElem(c2);
		p1.addElem(c8);
		p1.addElem(c9);
		p1.addElem(c10);
		p1.addElem(c12);
		
		p2.addElem(c3);
		p2.addElem(c4);
		p2.addElem(c7);
		
		p3.addElem(c5);
		p3.addElem(c6);
		
		p4.addElem(c12);
		p4.addElem(c11);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
		System.out.println("La duracion del PlayList 1: "+p1.duracion());
		System.out.println("La duracion del PlayList 2: "+p2.duracion());
		System.out.println("La duracion del PlayList 3: "+p3.duracion());
		System.out.println("La duracion del PlayList 4: "+p4.duracion());
		
	}

}
