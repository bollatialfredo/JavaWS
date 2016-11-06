import java.util.Vector;

public class Libreria {
	
	Vector <Libro> libros;
	
	public Libreria(){
		
		libros = new Vector<Libro>();
		
	}
	
	public void addLibros(Libro l){
		
		libros.add(l);
		
	}
	
	public Vector <Libro> librosRecomendados(Cliente c){
		
		Vector <Libro> librosRecomendados = new Vector <Libro>();
		
		for (Libro l : libros) {
			
			if(c.leGustaElLibro(l)){
				
				librosRecomendados.add(l);
				
			}
			
		}
		
		return librosRecomendados;	 
		
	}
	
	
	
	
	public static void main(String[]args){
		
		Libreria l = new Libreria();
		
		Libro l1 = new Libro("Frankenstein", "Mary Shelley", "Un cientifico crea un mounstrio", 200);
		l1.addGenero("novela");
		l1.addGenero("fantasia");
		l1.addGenero("suspenso");
		
		Libro l2 = new Libro("El Leviathan", "Thomas Hobbes", "Justificacion del poder absoluto de los reyes", 100);
		l2.addGenero("filosofia politica");
		l2.addGenero("Academico");
		
		Libro l3 = new Libro("El caballero de la armadura oxidada", "Robert Fisher","Lecciones de vida", 150);
		l3.addGenero("Novela");
		l3.addGenero("Aventura");
		
		Libro l4 = new Libro("Escribiendo 7 pizarrones en 2 horas", "Luis Berdun", "Aprenderas temas como binding dinamico, polimorismo, clase vs instancia",300);
		l4.addGenero("Academico");
		
		Libro l5 = new Libro("Manual del guerrero de la luz", "Paulo Coelho", "zaraza sobre la energia, el karma y el universo solo con el fin de hacer guita rapido", 10);
		l5.addGenero("Autoayuda");
		
		Libro l6 = new Libro("Como triunfar en el amor", "Alfredo Bollati", "Manual de un autentico dandy", 1000);
		l6.addGenero("Autoayuda");
		l6.addGenero("Romantico");
		
		Libro l7 = new Libro("Mujercitas", "David Martin", "Todo lo que nosotras necesitamos saber", 500);
		l7.addGenero("Romantico");
		
		Libro l8 = new Libro("El azote de dios", "William Dietrich", "La campaña de Atila", 400);
		l8.addGenero("Fantasia");
		l8.addGenero("Academico");
		
		Libro l9 = new Libro("Aventura romantica en la montaña", "Robert Fisher", "zoofilia", 400);
		l9.addGenero("Novela");
		l9.addGenero("Aventura");
		l9.addGenero("Romantico");
		
		
		l.addLibros(l1);
		l.addLibros(l2);
		l.addLibros(l3);
		l.addLibros(l4);
		l.addLibros(l5);
		l.addLibros(l6);
		l.addLibros(l7);
		l.addLibros(l8);
		l.addLibros(l9);
		
		CategoriaDescuento s1 = new CategoriaDescuento("Cliente comun", 1);
		CategoriaDescuento s2 = new CategoriaDescuento("Cliente Frecuente", 0.9);
		CategoriaDescuento s3 = new CategoriaDescuento("Cliente antiguo", 0.85);
		CategoriaDescuento s4 = new CategoriaDescuento("Cliente VIP", 0.7);
			
		Cliente c1 = new Cliente("El deivid", s1);
		c1.addGenero("Academico");
		c1.addGenero("Aventura");
	
		ClientePorAutor c2 = new ClientePorAutor("Juan Uturbey", s2);
		c2.addGenero("Autoayuda");
		c2.addGenero("Romantico");
		c2.addAutores("Eloy Mazza");
		
		ClientePorAutorExigente c3 = new ClientePorAutorExigente("Pedro Alvarez", s3);
		c3.addAutores("Robert Fisher");
		c3.addGenero("Romantico");
		c3.addGenero("Aventura");
		c3.addGenero("Rock & Roll");
		c3.addAutores("Nicolas Salvanescchi");
		
		Cliente c4 = new Cliente("Valentina Garay", s4);
		c4.addGenero("Academico");
		
		
		l.librosRecomendados(c1);
		l.librosRecomendados(c2);
		l.librosRecomendados(c3);
		
		System.out.println(c1.cuantoSale(l6));
		System.out.println(c2.cuantoSale(l6));
		System.out.println(c3.cuantoSale(l6));
		System.out.println(c4.cuantoSale(l6));
		System.out.println(l.librosRecomendados(c1));
		System.out.println(l.librosRecomendados(c2));
		System.out.println(l.librosRecomendados(c3));
		
	}
	
	
	
	
	
	
	
	
	
	
}
