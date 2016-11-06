
public class EmpleadoPorHora extends Empleado {
	private int horaExtras;
	private int valorHoraExtra=6;
	
	public EmpleadoPorHora (String _nombre){
		super(_nombre);
	}
	public void setHorasExtra (int cant){
		horaExtras=cant;
	}
	
	int getHorasExtra(){
		return horaExtras;
	}
	
	int getValorHoraExtra(){
		return valorHoraExtra;
	}
	
	public void calcularSueldo(){
		int tarasca=0;
		tarasca = horaExtras*valorHoraExtra;
		setSueldo(getSueldo()+tarasca);
		
	}
	
	

}
