
public class Seleccion {
	private String nacionalidad;
	private Persona personas[];
	private int contador = 0;
	
	public Seleccion (String _nac,int cantPer) {
		nacionalidad = _nac;
		personas = new Persona[cantPer];
	}
	
	public void getDisponibilidad (Persona _persona) {
		if (_persona.getDisponibilidad()) {
			System.out.println ("Esta disponible. Se encuentra "+_persona.getEstado());
		}
		else
			System.out.println ("No esta disponible");
	}
	
	public void addPersona (Persona _persona) {
		personas[contador] = _persona;
		contador++;
	}
	
	public void imprimirArreglo () {
		for (int i = 0; i < contador; i++) {
			System.out.println("Nombre: "+personas[i].getNombre());
		}
	}
}
