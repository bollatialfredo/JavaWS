
public class ControlStock {
	
	private float minimoPermitido;
	private float porcentaje = 1;
	private int cantEnStock=0;
	
	public ControlStock(float p){
		minimoPermitido = p;
	}
	
	public float getMinPermitido(){
		return minimoPermitido*porcentaje;
	}
	public void setMinimoPermitido(float v){
		minimoPermitido = v;
	}
	public void setporcentaje(float v){
		porcentaje = v;
	}
	
	public void modificarStock(int i){
		cantEnStock += i;
	}
}
