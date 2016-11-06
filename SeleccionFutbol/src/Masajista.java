
public class Masajista extends Persona {
	
	String titulo;
	
	public Masajista(String _nombre, String _apellido, String _estado, String _nacionalidad, int _pasaporte, String tit) {
		super(_nombre, _apellido, _estado, _nacionalidad, _pasaporte);
		titulo = tit;
	}
	
	public void print(){
		super.print();
		System.out.println(titulo);
	}
	
	public void prueba(){
		System.out.println("lalala");
	}

}
