
public class sim {
	public static void main(String[] args) {
		Nodo n1 = new Nodo("era");
		n1.add("zzz");
		n1.add("aaaa");
		n1.add("parcial Prog");
		n1.add("las pelotas");
		n1.add("facil");
		IteradorNodo it = new IteradorNodo(n1);
		while (it.hasNext()){
			System.out.println(it.next().toString());
		}
	}
}