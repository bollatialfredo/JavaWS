import java.util.*;
public class Directorio extends EFS {
	private List<EFS>lista;
		
	public Directorio(String nomb,int size){
		super(nomb,size);
		lista=new ArrayList<EFS>();
	}
	
	
	
	public List<EFS> getLista(){
		return lista;
	}
	
	public int getSize(){
		int aux=0;
		for (int i = 0; i < lista.size(); i++) {
			aux=aux+lista.get(i).getSize();
		}
		return aux;	
			
		}
	}
	
	


