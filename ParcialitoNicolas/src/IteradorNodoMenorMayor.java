import java.util.Iterator;
import java.util.*;

public class IteradorNodoMenorMayor extends IteradorNodos{
	
	
	public IteradorNodoMenorMayor(Nodo arbol) {
		super(arbol);
		
	}

	public Vector<Comparable> getValores(Nodo Arbol){
		
		Vector<Comparable> retorno=new Vector<Comparable>();
		if(Arbol.izq!=null)
			retorno.addAll(this.getValores(Arbol.izq));
		retorno.add(Arbol.getValor());
		if(Arbol.der!=null)
			retorno.addAll(this.getValores(Arbol.der));
		
		return retorno;
		
	}
	
	
}
