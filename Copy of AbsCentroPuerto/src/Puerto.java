
public class Puerto extends CentroDeConsumidorProveedor {
	
	public String toString(){
		String msj="Barcos disponibles: [";
		for (int i = 0; i < this.getCons().size()-1; i++) {
			msj = msj + this.getCons().elementAt(i).toString()+", ";
		}
		if (this.getCons().size()-1>=0) {
			msj = msj + this.getCons().elementAt(this.getCons().size()-1).toString()+"] \n\n";
		}else{
			msj = msj + "] \n\n";
		}
		msj = msj+"Camiones pendientes: [";
		for (int i = 0; i < this.getProv().size()-1; i++) {
			Camion aux = (Camion) this.getProv().elementAt(i);
			msj = msj + aux.toString() + " cargado en: " + aux.getFechaCarga()+", ";
		}
		if (this.getProv().size()-1>=0) {
			Camion aux = (Camion) this.getProv().elementAt(this.getProv().size()-1);
			msj = msj +aux.toString()+" cargado en: "+ aux.getFechaCarga()+"] \n";
		}else{
			msj = msj + "] \n\n";
		}
		return msj;
	}
}
