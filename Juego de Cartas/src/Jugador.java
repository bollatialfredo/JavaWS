import java.util.*;

public class Jugador {
	private String nombre;
	Vector<Carta> mano;
	
	public Jugador(String nomb){
		nombre=nomb;
		mano=new Vector<Carta>();		
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public boolean tieneCartas(){
		return mano.size()>0;
	}
	public Carta sacarCarta(){
		Carta aux = mano.elementAt(mano.size()-1);
		mano.removeElementAt(mano.size()-1);
		return aux;
	}

	

}
