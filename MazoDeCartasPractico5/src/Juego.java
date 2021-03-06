
public class Juego {
	PilaCartas mazo=new PilaCartas();
	Jugador juno;
	Jugador jdos;
	
	public Juego(Jugador a,Jugador b){
		juno=a;
		jdos=b;		
	}
	
	public void addCarta(Carta a){
		mazo.push(a);
	}
	
	public void repartir(){
		Carta uno,dos,tres,cuatro;
		
		uno=(Carta) mazo.pop();
		dos=(Carta) mazo.pop();
		tres=(Carta) mazo.pop();
		cuatro=(Carta) mazo.pop();
		
		Mano m1=new Mano(uno, tres);
		Mano m2=new Mano(dos,cuatro);
		
		juno.setMano(m1);
		jdos.setMano(m2);
		this.jugarUnaMano();
	}
	
	public void jugarUnaMano(){
		PilaCartas aux=new PilaCartas();
		aux.push(juno.m.a);
		aux.push(juno.m.b);
		aux.push(jdos.m.a);
		aux.push(jdos.m.b);
		
		if(juno.m.compareTo(jdos.m)>=1)
			juno.addCartas(aux);
			else
				jdos.addCartas(aux);
	}
	
	public void jugar(){
		while(mazo.size()>=4){
			this.repartir();			
		}
	}
	
	
}



