import java.util.LinkedHashMap;
import java.util.Map;

public class Juego {
	Pila mazo = new Pila();
	Map<String, Integer> jugador = new LinkedHashMap<String, Integer>();
	
	int jug1=0;
	int jug2=0;
		
	
	public Juego(){
		for (int i = 0; i < 41; i++) {
			mazo.push((int)(Math.random()*100)+1);
		}
		jugador.put("jugador1", 0);
		jugador.put("jugador2", 0);
	}
	
	public void desempate(){
		jug1 += (int)mazo.pop();
		jug2 += (int)mazo.pop();
	}
	
	public void mano(){
		if(mazo.size()>=4) {
			jug1 = (int)mazo.pop() +(int)mazo.pop();
			jug2 = (int)mazo.pop() +(int)mazo.pop();

			if (jug1>jug2) {
				jugador.put("jugador1", jugador.get("jugador1")+jug1+jug2);
				System.out.println("esta mano gano: jugador1 con " + (jug1+jug2));
			}
			else{
				if(jug1<jug2){
					jugador.put("jugador2", jugador.get("jugador2")+jug1+jug2);
					System.out.println("esta mano gano: jugador2 con " + (jug1+jug2));
				}else{
				desempate();
				}
			}
	
		}
				
	}
	public void jugar(){
		while(mazo.size()>=4){
			mano();
		}
		System.out.println("jugador 1 con: "+jugador.get("jugador1"));
		System.out.println("jugador 2 con: "+jugador.get("jugador2"));
	}
	
	public static void main(String[] args) {
		Juego j = new Juego();
		j.jugar();
	}
}
