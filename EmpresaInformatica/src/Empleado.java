
public class Empleado {
	private int sueldo=0;
	private String nombre;
	
	public Empleado(){
		
	}
	
	public Empleado(String nomb){
		nombre=nomb;
		
	}
	public void setNombre(String nom){
		nombre = nom;
	}
	public void setSueldo( int sueldo){
		this.sueldo=sueldo;}
	
	public void calcularSueldo(){
	}
	
	public int getSueldo(){
		return sueldo;
		
	}
	public void imprimir(){
		System.out.println(nombre + " cobra "+sueldo+" pesos.");
	}
}
