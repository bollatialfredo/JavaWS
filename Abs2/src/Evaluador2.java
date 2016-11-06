public class Evaluador2 extends ControlPalabras2 {
		
	public Evaluador2(String nom){
		nombre = nom;
	}
	
	public boolean esApto(ControlPalabras2 c) {
		return c.esApto(this);
	};
}
