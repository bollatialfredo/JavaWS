
public class main {
	public static void main(String[] args) {
		
		Comparable a=5;
		Comparable b=3;
		Comparable c=2;
		Comparable d=4;
		Comparable e=6;
		
		
		Nodo n1=new Nodo(a);
		n1.AddNodo(b);
		n1.AddNodo(c);
		n1.AddNodo(d);
		n1.AddNodo(e);
		
		IteradorNodoMenorMayor iterador=new IteradorNodoMenorMayor(n1);
		IteradorNodoMayorMenor iterador2=new IteradorNodoMayorMenor(n1);
		
		
		
		while (iterador2.hasNext()){
			System.out.println(iterador2.next());
		}
		}
	}


