import java.util.Vector;

public class Buzon extends ElementoContenedor {
	private Vector<Persona> ninios = new Vector<Persona>();
	private Vector<Carta> cartasComprobadas = new Vector<Carta>();
	
	private void addCarta(Carta c){
		cartasComprobadas.addElement(c);
	}
	
	public String comprobarCarta(Carta c, Persona p){
		if (!cartasComprobadas.contains(c)) {
			if (comprobarNinioBueno(p)) {
				addCarta(c);
				return "Usted ha sido un ninio bueno este anio";
			}else{
				c.darCarbon();
				addCarta(c);
				return "usted ha sido un ninio malo este anio";
			}		
		}
		return "Usted ya envio una carta";
	}
	
	public int cantCartas(){
		return cartasComprobadas.size();
	}
	
	public void addNinioBueno(Persona p){
		ninios.addElement(p);
	}
	
	private boolean comprobarNinioBueno(Persona p){
		for (int i = 0; i < ninios.size(); i++) {
			if (ninios.elementAt(i).equals(p)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int getCantidadCartas() {
		return cartasComprobadas.size();
	}

	@Override
	public int getCantidadCartasRegalo(String regalo) {
		int aux = 0;
		for (int i = 0; i < cartasComprobadas.size(); i++) {
			aux += cartasComprobadas.elementAt(i).buscarRegalo(regalo);
		}
		return aux;
	}
}
