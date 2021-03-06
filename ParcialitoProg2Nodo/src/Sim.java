
public class Sim {
	public static void main(String[] args) {
		Nodo n = new Nodo(35);
		n.add(30);
		n.add(25);
		n.add(56);
		n.add(12);
		n.add(34);
		n.add(100);
		n.add(2);
		
		IteradorAscendente ita = new IteradorAscendente(n);
		
		while(ita.hasNext()){
			System.out.print(ita.next()+" ");
		}
		
		System.out.println();
		
		IteradorDescendente itd = new IteradorDescendente(n);
		
		while(itd.hasNext()){
			System.out.print(itd.next()+" ");
		}
		
	}
}
