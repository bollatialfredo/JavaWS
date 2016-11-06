package nodos;

public class nodo {
	
	nodo izq;
	nodo der;
	int valor;
	
	public nodo (int v){
		valor = v;
		izq = null;
		der = null;
	}
	
	public void add (int numero){
		if (numero>valor) {
			if (der != null) {
				der.add(numero);
			}else {
				der = new nodo(numero);
			}
		}else  {
			if(izq != null){
				izq.add(numero);
			}else {
				izq = new nodo(numero);
			}
		}
	}
	public int getcantidad(){
		int cont =0;
		cont++;
		if (izq!= null) {
			cont = cont + izq.getcantidad();
		
		}
		if (der != null) {
			cont  = cont + der.getcantidad();
		}
		return cont;
	}
	
	public void print(){
		if (izq != null) {
			izq.print();
		}
		System.out.println(valor);
		if (der != null) {
			der.print();
		}
	}
}
