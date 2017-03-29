import java.util.ArrayList;
import java.util.List;

public class ArbolBinario {
	NodoBinario raiz;
	
	public ArbolBinario () {
		raiz = null;
	}
	
	public void addNodoBinario(int v) {
		if(raiz == null) {
			raiz = new NodoBinario(v);
		}
		else {
			raiz.addNodo(v);
		}
	}
	
	public ArrayList getValoresPreOrden(){
		ArrayList aux = new ArrayList();
		aux.addAll(printPreOrden(raiz));
		return aux;
	}
	
	private ArrayList printPreOrden(NodoBinario n){
		ArrayList aux = new ArrayList();
		aux.add(n.getValor());
		if (n.getIzq() != null) {
			aux.addAll(printPreOrden(n.getIzq()));
		}
		if (n.getDer() != null) {
			aux.addAll(printPreOrden(n.getDer()));
		}
		return aux;
	}
	
	private class NodoBinario {
		private int valor;
		NodoBinario izq;
		NodoBinario der;
		
		public NodoBinario(int v) {
			valor = v;
			izq = null;
			der = null;
		}
		
		private void addNodo(int v) {
			if(v <= valor) {
				if(izq == null) {
					izq = new NodoBinario(v);		
				}
				else {
					izq.addNodo(v);
				}
			}
			else {
				if(der == null) {
					der = new NodoBinario(v);		
				}
				else {
					der.addNodo(v);
				}
			}
		}
		
		public int getValor(){
			return valor;
		}
		private NodoBinario getDer(){
			return der;
		}
		public NodoBinario getIzq(){
			return izq;
		}
	}

}
