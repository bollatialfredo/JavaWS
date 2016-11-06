import java.util.Vector;


public class Libro {
	
	String nombre;
	String autor;
	String resumen;
	Vector <String> generosLiterarios;
	double precio;
	
	public Libro(String nombre, String autor, String resumen, double precio){
		
		generosLiterarios = new Vector <String>();
		this.nombre = nombre;
		this.autor = autor;
		this.resumen = resumen;
		this.precio = precio;
		
		
	}
	
	public void addGenero(String genero){
		
		generosLiterarios.add(genero);	
	}
	
	public String getAutor(){
		
		return autor;
		
	}
	
	public double getPrecio(){
		
		return precio;
		
	}

	public boolean contieneGenero(String genero) {
		
		return (generosLiterarios.contains(genero));
		
	}

	public String getNombre() {
		
		return nombre;
	}
	@Override
	public String toString() {
		
		return nombre+", "+autor;
	}
	

}
