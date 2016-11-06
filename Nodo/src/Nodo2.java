import java.util.*;

public class Nodo2 {
	
	private Comparable valor;
	private Nodo2 der;
	private Nodo2 izq;
	
	public Nodo2(Comparable v){
		valor = v;
	}
	
	public Comparable getValor(){
		return valor;
	}
	
	public void addNodo2(Comparable n){
		if (n.compareTo(valor)>0) {
			if (der!=null) {
				der.addNodo2(n);
			}else{
				der = new Nodo2(n);
			}
		}else{
			if (n.compareTo(valor)<0) {
				if (izq!=null) {
					izq.addNodo2(n);
				}else{
					izq = new Nodo2(n);
				}
			}
		}
	}
	
	public void print(ImprimirEnPantalla i){
		
		if (izq != null) {
			izq.print(i);
		}
		i.ejecutarNodo(this);
		if (der != null) {
			der.print(i);
		}
	}
	
	public String toString(){
		return ""+valor;
	}
	
	public static void main(String[] args) {
		Nodo2 raiz = new Nodo2("lala");
		
//		Comparable n1 = true;
//		Comparable n2 = 2;
//		Comparable n3 = 2;
//		Comparable n4 =5;
//		Comparable n5 = 8;
//		Comparable n6 = "mono";
//		Comparable n7 = 25;
//		Comparable n9 = 34.6;
//		Comparable n8 = 108.5;
		
		raiz.addNodo2("lala25");
		raiz.addNodo2("lala24");
		raiz.addNodo2("lala23");
//		raiz.addNodo2(n5);
//		raiz.addNodo2(n6);
//		raiz.addNodo2(n7);
//		raiz.addNodo2(n8);
//		raiz.addNodo2(n9);
		ImprimirEnPantalla i = new ImprimirEnPantalla();
		raiz.print(i);
	}

}
