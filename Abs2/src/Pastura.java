public class Pastura extends Cereal {
	
	private final int MINHECTAREAS = 50;
	
	public Pastura(String nom) {
		super(nom);
	}
	
	public boolean esApto(Lote l){
		return super.esApto(l)&&(l.getHectareas()>=MINHECTAREAS);
	}
}
