
public class Libro {
	private String nombre;
	private int isbn;
	private String autor;
	
	public Libro(String nomb,int is,String aut){
		nombre=nomb;
		isbn=is;
		autor=aut;
	}
	
	public int getIsbn(){
		return isbn;
	}
	
	public String getAutor(){
		return autor;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	
	
	

}