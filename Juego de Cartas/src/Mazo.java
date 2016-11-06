import java.util.*;

public class Mazo {
	
	Vector<Carta> naipes;
	private String nombreMazo;
	private int cantAtributos;
	
	public Mazo(int _cantAtr, String nombre){
		cantAtributos = _cantAtr;
		nombreMazo=nombre;
		naipes = new Vector<Carta>();
	}
	
	public void addCarta(Carta c){
		if ((c.getCantAtr()==cantAtributos)&&(nombreMazo==c.getNombreMazo())) {
			naipes.add(c);
		}
	}
	
}
