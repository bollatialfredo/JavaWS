import java.util.Calendar;
import java.util.GregorianCalendar;

public class Camion extends ElementoOrdenado {
	private int id;
	private Calendar fechaCarga = GregorianCalendar.getInstance();
	
	public Camion(String n){
		super(n);
		id = -(int)fechaCarga.getTimeInMillis();
	}
	
	public String getFechaCarga(){
		return fechaCarga.getTime().toString();
	}
	
	public int getAtr() {
		return id;
	}
	
	
}
