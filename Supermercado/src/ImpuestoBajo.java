import java.util.Calendar;
import java.util.Date;

public class ImpuestoBajo extends Impuesto {
		
	public ImpuestoBajo(float cf, float p){
		super(cf, p);
	}
	
	@Override
	public float precioConImpuesto(float precio) {
		
		float aux = 0;
		
		Date datetime = new Date();
		Calendar cal = Calendar.getInstance();
	    cal.setTime(datetime);
		
	    if(cal.get(Calendar.YEAR)%2 == 0){
	    	aux += 0.25f;
	    }
		return aux + cargoFijo + precio*porcentajeSobrePrecio + precio;
	}
}
