
public abstract class ElementoContenedor {
	
	public abstract int getCantidadCartas();
	public abstract int getCantidadCartasRegalo(String regalo);
	
	public float porcentajeDeCartasParaUnRegalo(String regalo) {
		return ((float)getCantidadCartasRegalo(regalo)/getCantidadCartas()*100);
	}
		
	public int buscarNinioMalo(){
		return getCantidadCartasRegalo("Trozo de carbon");
	}
}
