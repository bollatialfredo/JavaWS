
public class Sim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lista l1 = new Lista();
		
//		l1.addNodo("Hola");
//		l1.addNodo("Chau");
//		l1.addNodo("como");
//		l1.addNodo("te");
//		l1.addNodo("va");
		
//		System.out.println(l1.toString());
//		System.out.println(l1.imprimirNodo(0));
//		System.out.println(l1.deleteIndex(2));
//		System.out.println(l1.toString());
		
		//Calcula el tiempo de proceso de carga de la lista vicunlada
		long startTime = System.nanoTime();
		
		for (int i = 0; i < 100; i++) {
			l1.addNodo("ks");
		}
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns");
		
		
		//Calcula el tiempo de proceso de carga de la lista de arreglo
		ListaArreglo l2 = new ListaArreglo();
		
		long startTime2 = System.nanoTime();
		
		for (int i = 0; i < 100; i++) {
			l2.addElement("ks");
		}
		long endTime2 = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns");
		
		 System.out.println("******************************************");
		 
		 Lista l3 = new Lista();
		 l3.addNodo("loco");
		 l3.addNodo("vieja");
		 l3.addNodo("sol");
		 l3.addNodo("arbol");
		 
		 Lista l4 = new Lista();
		 l4.addNodo("alfajor");
		 l4.addNodo("loco");
		 l4.addNodo("sol");
		 l4.addNodo("");
		 l4.addNodo("kilo");
		 
		 //Escriba una funci�n que dadas dos listas (l3 y l4)
		 //construya otra (l5) con los elementos que est�n en la primera pero no en la segunda.
		 Lista l5 = new Lista();
		 int index = 0;
		 while (index < l3.getSize()) {
			 if (!l4.containsValue(l3.imprimirNodo(index))) {
				 l5.addNodo(l3.imprimirNodo(index));
			 }
			 index++;
		 }
		 
		 System.out.println(l5.toString());
	}

}
