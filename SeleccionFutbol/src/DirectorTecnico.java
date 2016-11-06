
public class DirectorTecnico extends Persona {

	private int numeroFed;
	
	public DirectorTecnico(String _nombre, String _apellido, String _estado, String _nacionalidad, int _pasaporte, int nro) {
		super(_nombre, _apellido, _estado, _nacionalidad, _pasaporte);
		numeroFed = nro;
	}
	public void print(){
		super.print();
		System.out.println(numeroFed);
	}
}
