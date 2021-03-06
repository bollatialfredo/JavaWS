import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Vocabull implements Iterable<String>{
	Map<String,Integer>palabras=new HashMap<String,Integer>();
	Iterator<String> it;
	
	public Vocabull(String texto){
		String[] pals=texto.split(" ");
		for (int i = 0; i < pals.length; i++) {
			if(palabras.containsKey(pals[i]))
				palabras.put(pals[i], palabras.get(pals[i])+1);
			else
				palabras.put(pals[i],new Integer(1));
		}
	}
	
	public int getCantidadPalabras(){
		return palabras.size();
	}
	
	public List<String> palabrasMasFrecuente(){
		List<String> aux=new ArrayList<String>();
		Iterator<String>  it=palabras.keySet().iterator();//casteo al iterador"Iterator<String>'
		int mayorfrec=Collections.max(palabras.values());
		
		
		while (it.hasNext()){
			String palabra=it.next();
			if(mayorfrec==palabras.get(palabra))
				aux.add(palabra);
			}
		
		return aux; 
	}
	
	
	public List<String> palabrasMenosFrecuente(){
		List<String> aux=new ArrayList<String>();
		Iterator<String> it=palabras.keySet().iterator();
		
		int menorFrecuencia=Collections.min(palabras.values());
		
		while (it.hasNext()){
			String palabra=it.next();
			if(menorFrecuencia==palabras.get(palabra))
				aux.add(palabra);
		}
		return aux;
	}
	
	
	
	private class IteradorAlfabetico implements Iterator<String>{
		int pos;
		List<String> elems=new ArrayList<String>(palabras.keySet());
		
		
		public IteradorAlfabetico(){
			Collections.sort(elems);
			pos=0;
		}
		
	
		
		public boolean hasNext() {
			return pos<elems.size();
		}	

		
		public String next() {
			int aux=pos;
			pos++;
			return elems.get(aux);
		}


	}

	@Override
	public Iterator<String> iterator() {
		if(it!=null)
			return it;
		else
			return new IteradorAlfabetico();
		
	}
	}
