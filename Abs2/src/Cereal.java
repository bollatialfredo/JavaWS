public class Cereal extends ControlPalabras2 {
	
	public Cereal(String nom){
		nombre = nom;
	}
	

	
	public boolean esApto(ControlPalabras2 c) {
		return c.getPalabrasClave().containsAll(this.getPalabrasClave());
	}
	
}
