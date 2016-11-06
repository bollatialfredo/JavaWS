
public class Libro {
	private int isbn, anio;
	private String nombre, autor, genero;
	
	public Libro (int _isbn, int _anio, String _nombre, String _autor, String _genero) {
		isbn = _isbn;
		anio = _anio;
		nombre = _nombre;
		autor = _autor;
		genero = _genero;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
}
