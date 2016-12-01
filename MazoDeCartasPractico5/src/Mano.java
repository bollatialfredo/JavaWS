
public class Mano implements Comparable<Mano> {
	Carta a;
	Carta b;
	
	public Mano(Carta c, Carta d){
		a=c;
		b=d;
	}
	
	public int getValor(){
		return a.getValor()+b.getValor();
	}

	@Override
	public int compareTo(Mano o) {
		return this.getValor()-o.getValor();
	}
	

}
