import java.util.Calendar;
import java.util.Date;

public class ImpuestoAlto extends Impuesto{
	
	public ImpuestoAlto(float cf, float p){
		super(cf, p);
	}
	
	@Override
	public float precioConImpuesto(float precio) {
		
		float aux = 0;
		
		Date datetime = new Date();
		Calendar cal = Calendar.getInstance();
	    cal.setTime(datetime);
		
	    if(cal.get(Calendar.DAY_OF_WEEK)== 1){
	    	aux += 0.5f;
	    }
		return aux + cargoFijo + precio*porcentajeSobrePrecio + precio;
	}

}
