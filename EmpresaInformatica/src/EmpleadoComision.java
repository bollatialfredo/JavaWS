
public class EmpleadoComision extends Empleado {
	private int porcentajeVentas = 2;
	private int cantVentas=0;
	
	public EmpleadoComision (String _nombre) {
		super(_nombre);
	}
	
	public void setPorcentaje (int _porcentaje) {
		porcentajeVentas = _porcentaje;
	}
	
	public void setCantVentas (int cant) {
		cantVentas = cant;
	}
	
	public void calcularSueldo(){
		int tarasca =0;
		if (cantVentas > 10) {
			tarasca = getSueldo()*porcentajeVentas/100;
		} 
		setSueldo(getSueldo()+tarasca);
	}
}
