
public class Trabajo2 extends ControlPalabras2 {
	
	public Trabajo2(String nom){
		nombre = nom;
	}
	public boolean esApto(ControlPalabras2 c) {
		return c.getPalabrasClave().containsAll(this.getPalabrasClave());
	}
	
	
}