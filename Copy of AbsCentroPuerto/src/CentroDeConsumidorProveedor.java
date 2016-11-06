import java.util.Vector;

public class CentroDeConsumidorProveedor {
	
	private Vector<ElementoOrdenado> prov = new Vector<ElementoOrdenado>();
	private Vector<ElementoOrdenado> cons = new Vector<ElementoOrdenado>();
	
	public void addProveedor(ElementoOrdenado c){
		c.insertarOrdenado(prov);
		//Procesar();
	}
	public void addConsumidor(ElementoOrdenado c){
		c.insertarOrdenado(cons);
		//this.Procesar();
	}
	
	public void Procesar(){
		while (prov.size()>0 && cons.size()>0) {
			prov.removeElementAt(prov.size()-1);
			cons.removeElementAt(cons.size()-1);
		}
	}
	public Vector<ElementoOrdenado> getProv(){
		return prov;
	}
	public Vector<ElementoOrdenado> getCons(){
		return cons;
	}
}
