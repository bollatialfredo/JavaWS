public class Ordenamiento2 {
	Nodo primero;
	int cantidad = 0;

	public Ordenamiento2 () {
		primero = null;
	}

	/**
	 * Agrega un Nodo al principio de la lista
	 * @param n
	 */
	public void addNodo (int n) {
		Nodo tmp =  new Nodo(n);
		tmp.setSig(primero);
		primero = tmp;
		cantidad++;
	}

	/**
	 * Retorna el tamano de la lista vinculada	
	 * @return
	 */
	public int getSize() {
		return cantidad;
	}

	/**
	 * Cuando primero es igual a null la lista esta vacia
	 * @return
	 */
	public boolean isEmpty () {
		return primero == null;
	}

	@Override
	/**
	 * Recorre la lista vinculada e imprime cada valor en cada posicion
	 */
	public String toString(){
		Nodo nodoActual = primero;
		String s = "";
		while (nodoActual != null) {
			s += nodoActual.getValor();
			s += " ";
			nodoActual = nodoActual.getSig();
		}
		return s;
	}

	/**
	 * Metodo recursivo si la lista vinculada está ordenada descendente
	 * @param link
	 * @return
	 */
	private boolean ordenadaDes(Nodo link) {
		
		if (link.getSig() != null) {
			if (link.getValor() > link.getSig().getValor()) {
				return ordenadaDes(link.getSig());
			}
		}else{
			return true;
		}
		return false;
	}

	/**
	 * Check si la lista vinculada está ordenada descendente
	 * @return
	 */
	public boolean getOrdenadaDes () {
		if (primero == null) {
			return false;
		}
		else if (primero.getSig() == null) {
			return true;
		}
		return ordenadaDes(primero);
	}
	
	private int buscarElementoPriv(Nodo n, int valor){
		if(n != null){
			if(n.getValor() == valor){
				return valor;
			}else{
				n = n.getSig();
				return buscarElementoPriv(n, valor);
			}
		}
		return -1;
	}
	
	public int buscarElemento(int valor){
		Nodo nodoActual;
		if(primero != null){
			nodoActual = primero;
			return buscarElementoPriv(nodoActual, valor);
		}else{
			return -1;
		}
	}
}