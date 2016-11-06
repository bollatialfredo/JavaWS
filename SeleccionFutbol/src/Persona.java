
public class Persona {
	private String nombre, apellido, estado, nacionalidad;
	private int pasaporte;
	
	public Persona (String _nombre, String _apellido, String _estado, String _nacionalidad, int _pasaporte) {
		nombre = _nombre;
		apellido = _apellido;
		estado = _estado;
		nacionalidad = _nacionalidad;
		pasaporte = _pasaporte;		
	}
	public String getNombre () {
		return nombre;
	}
	
	public String getEstado () {
		return estado;
	}
	
	public boolean getDisponibilidad () {
		if (estado == "Pais de origen") {
			return true;
		}
		else
			return false;
	}
	
	public void setEstado (String _estado) {
		estado = _estado;
	}
	public void print(){
		System.out.println(nombre+" "+ apellido+" "+ estado+" "+ nacionalidad);
	}
}
