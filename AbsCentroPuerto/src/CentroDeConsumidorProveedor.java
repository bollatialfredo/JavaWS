import java.util.Vector;

public class CentroDeConsumidorProveedor {
	
	private Vector<ColaOrdenada> prov = new Vector<ColaOrdenada>();
	private Vector<ColaOrdenada> cons = new Vector<ColaOrdenada>();
	
	public void addProveedor(ColaOrdenada c){
		c.insertarseOrdenado(prov);
	}
	public void addConsumidor(ColaOrdenada c){
		c.insertarseOrdenado(cons);
	}
	
	public void Procesar(){
		while (prov.size()>0 && cons.size()>0) {
			prov.removeElementAt(prov.size()-1);
			cons.removeElementAt(cons.size()-1);
		}
	}
	public Vector<ColaOrdenada> getProv(){
		return prov;
	}
	public Vector<ColaOrdenada> getCons(){
		return cons;
	}
}
