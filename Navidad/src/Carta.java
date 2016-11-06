import java.util.Vector;

public class Carta {
	private String remitente;
	private Vector<String> regalos = new Vector<String>();
	
	public Carta (String r){
		remitente = r;
	}
	
	public void addRegalo(String r){
		regalos.addElement(r);
	}
	
	public String getRemitente(){
		return remitente;
	}
	
	@Override
	public boolean equals(Object obj) {
		return ((Carta)obj).getRemitente() == getRemitente();
	}
	
	public int buscarRegalo(String r){
		if (regalos.contains(r)){
			return 1;
		}
		return 0;
	}
	
	public void darCarbon(){
		regalos.removeAllElements();
		regalos.addElement("Trozo de carbon");
	}
}
