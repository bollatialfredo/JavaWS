
public class Comprimido extends Directorio{
	
	public Comprimido(String nomb, int siz){
		super(nomb,siz);
	}
	
	public int getSize(){
		return super.getSize()-1;
	}

}
