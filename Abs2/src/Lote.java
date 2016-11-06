
public class Lote extends ControlPalabras2 {
	
	private String categoria;
	private int hectareas;
	
	public Lote(String nom, String cat, int hec){
		categoria = cat;
		nombre = nom;
		hectareas = hec;
	}
	
	public int getHectareas(){
		return hectareas;
	}
	public void categoria(){
		System.out.println("El lote es: "+ categoria);
	}

	
	public boolean esApto(ControlPalabras2 c) {
		return c.esApto(this);
	}
}
