public class Pastura extends Cereal {
	
	private final int MINHECTAREAS = 50;
	
	public Pastura(String nom) {
		super(nom);
	}
	
	@Override
	public boolean puedoSembrarme(Lote l) {
		return (super.puedoSembrarme(l) && l.getHectareas()>=MINHECTAREAS);
	}
}
