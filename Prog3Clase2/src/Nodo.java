public class Nodo {
	private int valor;	
	private Nodo sig;
	
	public Nodo (int v) {
		valor = v;
	}
	
	
	/**
	 * Get valor
	 * @return
	 */
	public int getValor() {
		return valor;
	}
	
	/**
	 * Set valor
	 * @param v
	 */
	public void setValor (int v) {
		valor = v;
	}
	
	public void setSig(Nodo n) {
		sig = n;
	}
	
	public Nodo getSig() {
		return sig;
	}
}