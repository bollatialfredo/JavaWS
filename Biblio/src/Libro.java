
public class Libro implements Comparable<Libro> {
	private int ISBN;
	private String nombre;
	private int anio;
	
	public Libro(int isb, String n, int a){
		ISBN = isb;
		nombre = n;
		anio = a;
	}

	@Override
	public int compareTo(Libro arg0) {
		return ISBN - arg0.getISBN();
	}

	public int getISBN() {
		return ISBN;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	@Override
	public String toString() {
		return nombre;
	}
}
