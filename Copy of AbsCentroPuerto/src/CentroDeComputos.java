import java.util.Vector;

public class CentroDeComputos extends CentroDeConsumidorProveedor {
	
	Vector<ElementoOrdenado> pr = this.getProv();
	
	public String toString(){
		String msj="Computadoras disponibles: [";
		for (int i = 0; i < this.getCons().size()-1; i++) {
			msj = msj + this.getCons().elementAt(i).toString()+", ";
		}
		if (this.getCons().size()-1>=0) {
			msj = msj + this.getCons().elementAt(this.getCons().size()-1).toString()+"] \n\n";
		}else{
			msj = msj + "] \n\n";
		}
		msj = msj+"Procesos pendientes: [";
		for (int i = 0; i < pr.size()-1; i++) {
			msj = msj + pr.elementAt(i).toString()+", ";
		}
		
		if (pr.size()-1>=0) {
			msj = msj + pr.elementAt(pr.size()-1).toString()+"] \n";
		}else{
			msj = msj + "] \n\n";
		}
		return msj;
	}

}
