
public class Lista {
		Nodo primero;
		int cantidad = 0;
		
	public Lista () {
		primero = null;
	}
	
	/**
	 * Agrega un Nodo al principio de la lista
	 * @param n
	 */
	public void addNodo (String n) {
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
	 * Recorre la lista vinculada e imprime el valor de un Nodo en una determinada posicion
	 * @param pos
	 * @return
	 */
	public String imprimirNodo(int pos){
		String s = "";  
		Nodo nodoActual = primero;
		while (nodoActual != null) {
			if (pos == 0) {
				s = nodoActual.getValor();
				return s;
			}
			nodoActual = nodoActual.getSig();
			pos --;
		}
		return s;
	}
	
	/**
	 * Elimina un Nodo es una determianda pos de la lista vinculada
	 * @param pos
	 * @return
	 */
	public String delete(int pos){
		String s = "";
		Nodo nodoActual = primero;
		while(nodoActual != null){
			if (pos == 1) {
				Nodo temp = nodoActual.getSig();
				nodoActual.setSig(temp.getSig());
				return temp.getValor();
			}
			pos --;
			nodoActual = nodoActual.getSig();
		}
		return s;
	}
	
	/**
	 * Elimina un Nodo es una determianda pos de la lista vinculada (Metodo 2)
	 * @param pos
	 * @return
	 */
	public String deleteIndex(int pos){
		String s = "";
		int index = 1;
		Nodo nodoActual = primero;
		while(nodoActual != null){
			// cuando la pos que recibimos como parametro alcanza al nodo anterior al 
			// que queremos eliminar, este setea su siguiente nodo como al siguiente del
			// que queremos eliminar
			
			if (pos == index) {
				Nodo temp = nodoActual.getSig();
				nodoActual.setSig(temp.getSig());
				return temp.getValor();
			}
			index ++;
			nodoActual = nodoActual.getSig();
		}
		return s;
	}
	
	public boolean containsValue (String s) {
		Nodo nodoActual = primero;
		
		while(nodoActual != null) {
			if (nodoActual.getValor() == s) {
				return true;
			}
			else {
				nodoActual = nodoActual.getSig();
			}
		}
		
		return false;
	}
	
}
