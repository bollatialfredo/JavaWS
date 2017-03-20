
public class ListaArreglo {
	String [] lista;
	int cantidad = 0;
	
	public ListaArreglo () {
		lista = new String[10];
	}
	
	/**
	 * Agregar elemento al arreglo
	 * @param s
	 */
	public void addElement(String s) {
		
		if(cantidad == lista.length) {
			String [] listaAux = lista;
			lista = new String[lista.length*6];
			for (int i = 0; i < listaAux.length; i++) {
				lista[i] = listaAux[i];
			}
		}//else No needed
		
		lista[cantidad] = s;
		cantidad++;
	}
	

	@Override
	/**
	 * Imprimir valores del arreglo 
	 */
	public String toString() {
		String s = "";
		
		for (int i = 0; i < lista.length; i++) {
				s += lista[i];
		}
		
		return s;
	}
	
}
