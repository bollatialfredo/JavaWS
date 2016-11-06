
public class Futbolista extends Persona{
	private String posicion, pierna;
	private int cantGoles;
	
	public Futbolista (String _nombre, String _apellido, String _estado, String _nacionalidad, int _pasaporte, String _pos,String _pierna, int _cantGoles) {
		super(_nombre,_apellido,_estado,_nacionalidad,_pasaporte);
		posicion = _pos;
		pierna = _pierna;
		cantGoles = _cantGoles;
	}
	
	public String getPosicion () {
		return posicion;
	}
	public void print(){
		super.print();
		System.out.println(posicion+" "+pierna+" "+cantGoles);
	}
}
