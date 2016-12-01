package nodoParcial;

public class Sim {
	public static void main(String[] args) {
		Nodo n1 = new Nodo("era");
		n1.add("zzz");
		n1.add("aaaa");
		n1.add("parcial Prog");
		n1.add("las tarlipes");
		n1.add("facil");
		
		System.out.println(n1.toString());
		System.out.println(n1.size());
	}
}
