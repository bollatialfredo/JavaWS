import java.util.*;

public class Carta {
	private String nombre;
	private String nombreMazo;
	Vector<Atributo> atributos;
	
	public Carta(String nomb,String nombreMaz, Atributo a){
		nombre = nomb;
		nombreMazo=nombreMaz;
		atributos = new Vector<Atributo>();
		atributos.add(a);
	}
	
	public int getCantAtr(){
		return atributos.size();
	}
	
	public void addAtributo (Atributo a) {
		atributos.add(a);
	}
	
	public String getNombreMazo(){
		return nombreMazo;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public Atributo getMaxAtributo() {
		int aux=0;
		int pos=0;
	
		for (int i = 0; i < atributos.size(); i++) {
			if (aux < atributos.elementAt(i).getValor()) {
				aux = atributos.elementAt(i).getValor();
				pos=i;
			}
		}
		return atributos.elementAt(pos);
	}
	
}
