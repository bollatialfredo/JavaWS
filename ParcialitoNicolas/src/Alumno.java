import java.util.Comparator;

public class Alumno implements Comparable<Alumno>{
	private String nombre;
	private int notafinal;
	private int edad;
	Comparator comp;
	
	public Alumno(String nomb, int e, int nota){
		nombre=nomb;
		edad=e;
		notafinal=nota;
		comp=new ComparatorPorEdad();
	}

	@Override
	public int compareTo(Alumno o) {
		return comp.compare(this,o );
	}
	
	public void setComp(Comparator c){
		comp=c;		
	}
	
	
	
	public int getEdad(){
		return edad;
	}
	
	public int getNotaFinal(){
		return notafinal;
	}	
	

}
