import java.util.*;

public class Simulador {

	public static void main(String[] args) {
		Libro harry = new Libro(234, 2007, "Harry Potter", "Eloy", "Ficcion");
		Libro davinci = new Libro(564, 2004, "Codigo Davinci", "Alfredito", "Ficcion");
		Libro manostijera = new Libro(222, 1996, "El Joven Manos de Tijera", "ElDeivid", "Drama");
		Libro superman = new Libro(345, 1975, "Superman", "Salvaneschi", "Aventuras");
		Libro seduccion = new Libro(123, 2016, "Guia rapida de seduccion", "Laudrup", "Autoayuda");
		Libro recetasNuevas = new Libro(345, 2014, "Cocina Facil", "Bolatti", "Instructivo");
		
		Biblioteca biblioteca = new Biblioteca();
		
		biblioteca.agregarLibro(harry);
		biblioteca.agregarLibro(davinci);
		biblioteca.agregarLibro(manostijera);
		biblioteca.agregarLibro(superman);
		biblioteca.agregarLibro(seduccion);
		biblioteca.agregarLibro(recetasNuevas);
		
		
		Comparator<Libro> c1 = new ComparadorPorISBN();
		Comparator<Libro> c2 = new ComparadorPorAutor();

		List<Libro> lista = biblioteca.ordenarAscendente(c2);
		
		for (Libro libro : lista) {
			System.out.println(libro.getNombre());
		}
		
		lista = biblioteca.ordenarDescendente(c2);

		System.out.println("---------->>>><<<<<-----------");
		
		for (Libro libro : lista) {
			System.out.println(libro.getNombre());
		}
	}

}
