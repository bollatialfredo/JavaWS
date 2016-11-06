
public class Persona {
	
	private int dni;
	private Carta c;
	
	public Persona(int d, Carta ca){
		dni = d;
		c = ca;
	}
	
	public int getDni(){
		return dni;
	}
	
	@Override
	public boolean equals(Object obj) {
		return ((Persona)obj).getDni() == dni;
	}
	
	public String depositar(Buzon b){
		return b.comprobarCarta(c, this);
	}
	
}
