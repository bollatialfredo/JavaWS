
public class sim {
	public static void main(String[] args) {
		
		Biblioteca bib = new Biblioteca();
		Libro l1 = new Libro(34, "ahhhh", 1988);
		Libro l3 = new Libro(40, "cxvvz", 1988);
		Libro l4 = new Libro(48, "ooeoe", 1988);
		Libro l5 = new Libro(40, "pastelito", 1988);
		Libro l2 = new Libro(40, "asefjweuifj", 1988);
		
		bib.addLibro(l1);
		bib.addLibro(l3);
		bib.addLibro(l4);
		bib.addLibro(l5);
		bib.addLibro(l2);
		
		System.out.println(bib.listaDeLibros());
		
	}
}
