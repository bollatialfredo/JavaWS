
public class Jugador {
	String nombre;
	PilaCartas cartas=new PilaCartas();
	Mano m;
	
	
	public Jugador (String nomb){
		nombre=nomb;
		}
	
	public void setMano(Mano a){
		m=a;		
	}
	
	public void addCartas(PilaCartas total){
		PilaCartas aux=new PilaCartas();
		aux=total;
		while(aux.top()!=null){
			cartas.push(aux.pop());
		}
	}
	
	
	
	public int cantidadCartas(){
		int aux=0;
		while(cartas.top()!=null){
			aux++;
			cartas.pop();
		}
		return aux;
	}

}
