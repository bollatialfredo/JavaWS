
public abstract class Impuesto {
	
	float cargoFijo;
	float porcentajeSobrePrecio;
	
	public Impuesto(float cf, float p){
		cargoFijo = cf;
		porcentajeSobrePrecio = p;
	}
	
	public void setCargoFijo(float v){
		cargoFijo = v;
	}
	public void setPorcentajeSobrePrecio(float v){
		porcentajeSobrePrecio = v;
	}
		
	public abstract float precioConImpuesto(float precio);

}
