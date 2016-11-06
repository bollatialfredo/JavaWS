import java.util.Vector;

public class Paciente {

	private String nombre;	
	private Vector<String> sintomas = new Vector<String>();
	private Vector<String> alergias = new Vector<String>();
	private ObraSocial os;

	public Paciente (String nombre,ObraSocial os) {
		this.nombre = nombre;
		this.os = os;
	}
	
	public void addSintoma (String s) {
		sintomas.add(s);
	}
	
	public void addAlergia (String a) {
		alergias.add(a);
	}
	
	private boolean comprobarAlergico(Medicamento m){
		String aux = m.getNombre();
		for (int i = 0; i < alergias.size(); i++) {
			if (alergias.elementAt(i).equals(aux)) {
				return true;
			}
		}
		return false;
	}
	
	public float getDescuentoOS(){
		return os.getDescuento();
	}

	public boolean medicamentoApto(Medicamento m){
		
		if (!comprobarAlergico(m)) {
			for (int i = 0; i < sintomas.size(); i++) {
				if (!m.contiene(sintomas.elementAt(i))) {
					return false;
				}
			}
		}
		return true;
	}

}
