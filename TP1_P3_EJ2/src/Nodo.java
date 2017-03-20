
public class Nodo {
	private String valor;	
	private Nodo sig;
	
	public Nodo (String v) {
		valor = v;
	}
	
	
	/**
	 * Get valor
	 * @return
	 */
	public String getValor() {
		return valor;
	}
	
	/**
	 * Set valor
	 * @param v
	 */
	public void setValor (String v) {
		valor = v;
	}
	
	public void setSig(Nodo n) {
		sig = n;
	}
	
	public Nodo getSig() {
		return sig;
	}
}
