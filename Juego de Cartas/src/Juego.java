
public class Juego {
	Mazo mazo;
	Jugador J1;
	Jugador J2;
	
	public Juego (Mazo m, Jugador ju1,Jugador ju2) {
		mazo = m;
		J1= ju1;
		J2= ju2;
	}

	public void jugar () {
		
		while(J1.tieneCartas() && J2.tieneCartas()){
			Atributo aux = J1.sacarCarta().getMaxAtributo();
		}
	}
}
