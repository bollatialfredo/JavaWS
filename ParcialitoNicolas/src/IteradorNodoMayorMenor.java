	import java.util.Iterator;
	import java.util.*;
	
public class IteradorNodoMayorMenor extends IteradorNodos{
	

		public IteradorNodoMayorMenor(Nodo arbol) {
			super(arbol);
			
		}

		public Vector<Comparable> getValores(Nodo Arbol){
			
			Vector<Comparable> retorno=new Vector<Comparable>();
			if(Arbol.der!=null)
				retorno.addAll(this.getValores(Arbol.der));
			retorno.add(Arbol.getValor());
			if(Arbol.izq!=null)
				retorno.addAll(this.getValores(Arbol.izq));
			
			return retorno;			
		}		
		
	}



