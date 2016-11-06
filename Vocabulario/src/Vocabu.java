import java.util.*;

public class Vocabu {
	String texto;
	Map<String, Integer> palabras = new HashMap<String, Integer>();
	
	
	public Vocabu(String s){
		texto = s;
		String[] arregloAuxiliar = texto.split(" ");
		for (String string : arregloAuxiliar) {
				string = string.toLowerCase();
				string = string.replace(",", "");
				string = string.replace(".", "");
				
			if (palabras.containsKey(string)) {
				palabras.put(string, palabras.get(string)+1);
			}else{
				palabras.put(string, 1);
			}
		}
	}
	
	public List<String> palabrasOrdenadasPorOrdenAlfab(){
		List<String> palabrasOrd = new ArrayList<String>();
		IteradorAlfabetico it = new IteradorAlfabetico(palabras);
		
		while(it.hasNext()){
			palabrasOrd.add(it.next());
		}
		
		return palabrasOrd;
	}
	
	public List<String> palabrasOrdenadasPorFreqDeOcurrencia(){
		
		List<String> listaOrdenada = new ArrayList<String>();
		
		IteradorPorFreqDeOcurr it = new IteradorPorFreqDeOcurr(palabras);
		while(it.hasNext()){
			listaOrdenada.add(it.next());
		}
		
		return listaOrdenada;
	}
	
		
	public List<String> palabrasMasFrecuentes(){
		List<String> palFreq = new ArrayList<String>();
		Iterator<String> it = palabras.keySet().iterator();  
		int cantMax = 0;
		while(it.hasNext()){
			String prox = it.next();
			if (palabras.get(prox)>cantMax) {
				cantMax = palabras.get(prox); 
				palFreq.clear();
				palFreq.add(prox);
			}else{
				if (palabras.get(prox) == cantMax) {
					palFreq.add(prox);
				}
			}
		}
		return palFreq;
	}
	public List<String> palabrasMenosFrecuentes(){
		List<String> palFreq = new ArrayList<String>();
		Iterator<String> it = new IteradorPorMenorCantidadDeOcurrencia(palabras);  
		String primero = it.next();
		int cantMin = palabras.get(primero);
		palFreq.add(primero);
		while(it.hasNext()){
			String prox = it.next();
			if (palabras.get(prox)<cantMin) {
				cantMin = palabras.get(prox);
				palFreq.clear();
				palFreq.add(prox);
			}else{
				if (palabras.get(prox) == cantMin) {
					palFreq.add(prox);
				}
			}
		}
		return palFreq;
	}
}
