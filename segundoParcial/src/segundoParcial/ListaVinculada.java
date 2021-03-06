package segundoParcial;

public class ListaVinculada {
	Comparable valor;
	ListaVinculada sig;
	
	public ListaVinculada(Comparable val){
		sig=null;
		valor=val;
	}
	
	public void addLista(Comparable val){
		if(valor.compareTo(val)>=1){
			if(sig==null){
				sig=new ListaVinculada(valor);
				valor = val;
			}
			else{
				sig.addLista(valor);
				valor=val;				
			}
		}
		else{
			if(sig==null){
				sig=new ListaVinculada(val);
			}
			else
				sig.addLista(val);				
			}
		
	}
	
	public Comparable getValor(){
		return valor;
	}

}
