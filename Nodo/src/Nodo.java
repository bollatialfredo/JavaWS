
public class Nodo implements Comparable<Nodo> {
	
	private int valor;
	private Nodo der;
	private Nodo izq;
	
	public Nodo(int v){
		valor = v;
	}
	
	public int getValor(){
		return valor;
	}
	
	public void addNodo(Nodo n){
		int v = this.compareTo(n);
		if (v>0) {
			if (der!=null) {
				der.addNodo(n);
			}else{
				der = n;
			}
		}else{
			if (v<0) {
				if (izq!=null) {
					izq.addNodo(n);
				}else{
					izq = n;
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
	
	@Override
	public int compareTo(Nodo n) {
		if (n.getValor()>valor) {
			return 1;
		}else{
			if(n.getValor()<valor){
				return -1;
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		Nodo n1 = new Nodo(78);
		Nodo n2 = new Nodo(23);
		Nodo n3 = new Nodo(65);
		Nodo n4 = new Nodo(11);
		Nodo n5 = new Nodo(8);
		Nodo n6 = new Nodo(9);
		Nodo n7 = new Nodo(25);
		Nodo n9 = new Nodo(80);
		Nodo n8 = new Nodo(108);
		
		n1.addNodo(n2);
		n1.addNodo(n3);
		n1.addNodo(n4);
		n1.addNodo(n5);
		n1.addNodo(n6);
		n1.addNodo(n7);
		n1.addNodo(n8);
		n1.addNodo(n9);
		ImprimirEnPantalla i = new ImprimirEnPantalla();
		n1.print(i);
	}

}
