import java.util.Vector;

public abstract class Reproductor {

	Vector<Reproductor> elementos = new Vector<Reproductor>();

	public abstract int duracion();
	
	public Vector getVector(){
		return elementos;
	}
	
	public void imprimirPantalla(Reproductor r){
		for (int i = 0; i < r.getVector().size() ; i++) {
			System.out.println(r.getVector().elementAt(i).toString());
		}
	}

	public abstract String toString();
		

	public void addElem(Reproductor e){
		elementos.addElement(e);
	}

	public void deleteElem(Reproductor r){

		for (int i = 0; i < elementos.size(); i++) {//recorro el vector de elementos

			Reproductor aux = elementos.elementAt(i); //asigno el elemento a un aux

			if (((Pista)aux).getId() == ((Pista) r).getId()){//pregunto si el elemento pasado por parametro con aux son iguales
				elementos.removeElementAt(i);// si lo son lo borro
			}
		}
	}
	//me falta el delete


	public int cantPistas() {//este metodo cuenta la cantidad de pista de todo el sistema
		int cantPistas = 0;
		for (int i = 0; i < elementos.size(); i++) {
			cantPistas = cantPistas + elementos.elementAt(i).cantPistas();
		}
		return cantPistas;
	}
}
