import java.util.Calendar;
import java.util.Date;
import java.util.Vector;

public class Ticket {
	
	private static int numeroFactura = 0;
	private int factura;
	private Vector<Venta> vendidos = new Vector<Venta>();
	private int dia;
	private int mes;
	private int anio;
	
	public Ticket(){
		numeroFactura++;
		factura = numeroFactura;
		setFecha();
	}
	
	public void setFecha(){
		Date datetime = new Date();
		Calendar cal = Calendar.getInstance();
	    cal.setTime(datetime);
	    dia = cal.get(Calendar.DAY_OF_MONTH);
	    mes = cal.get(Calendar.MONTH);
	    anio = cal.get(Calendar.YEAR);
	}
	
	public void addProdVendido (Venta v) {
		vendidos.add(v);
	}
	public String toString(){
		String msj = "************************\nNum. Factura "+factura + " " + "\n" + dia+"/"+mes+"/"+anio+"\n";
		for (int i = 0; i < vendidos.size(); i++) {
			msj += vendidos.elementAt(i).toString();
		}
		return msj;
	}
}
