
public class Nodo{
	Comparable valor;
	Nodo der;
	Nodo izq;
	
	public Nodo(Comparable val){
		der=null;
		izq=null;
		valor=val;		
	}
	
	public Nodo getIzq(){
		return izq;
	}
	
	public Nodo getDer(){
		return der;
	}
	
	public void AddNodo(Comparable val){
		if(valor.compareTo(val)>=1){
			if (izq==null){
				izq=new Nodo(val);
			}
			else
			{izq.AddNodo(val);
			
			}
		}
		else
			if(der==null){
				der=new Nodo(val);								
			}
			else{
				der.AddNodo(val);
			}
		}
	public Comparable getValor(){
		return valor;
	}	
}
