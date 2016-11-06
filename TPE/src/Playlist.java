import java.util.Vector;

public class Playlist extends Reproductor {

	String nombre;
	Vector <Reproductor> elem;

	public Playlist(String n){
		nombre = n;
		elem = new Vector<Reproductor>();
	}

	public void addElem(Reproductor p){
		elem.addElement(p);
	}

	public void deleteElem(Reproductor r){

		for (int i = 0; i < elem.size(); i++) {//recorro el vector de elementos

			Reproductor aux = elem.elementAt(i); //asigno el elemento a un aux

			if (((Pista)aux).getId() == ((Pista) r).getId()){//pregunto si el elemento pasado por parametro con aux son iguales
				elem.removeElementAt(i);// si lo son lo borro
			}
		}
	}

	public int duracion() {
		int cuentaSeg = 0;
		for (int i = 0; i < elem.size(); i++) {
			cuentaSeg = cuentaSeg + elem.elementAt(i).duracion();
		}
		return cuentaSeg;
	}

	public int cantPistas() {
		int cantPistas = 0;
		for (int i = 0; i < elem.size(); i++) {
			cantPistas = cantPistas + elem.elementAt(i).cantPistas();
		}
		return cantPistas;
	}
	
	public String toString(){
		String mensaje = "Playlist: \n"+nombre;
		for (int i = 0; i < elem.size(); i++) {
			mensaje = mensaje + elem.elementAt(i).toString();
		}
		return mensaje;
	}
	public Vector getVector(){
		return elem;
	}

}
