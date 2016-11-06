
public class Sim {
	
	public static void main(String[] args) {

		Vocabu v = new Vocabu("casa auto casa casa casa auto auto auto auto Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed posuere non turpis nec convallis.  z z z z "
				+ "Phasellus non ultrices neque. Quisque ornare elementum purus, sit amet posuere magna dictum quis. Ut vulputate accumsan enim. Donec ac ipsum nulla. "
				+ "Quisque consectetur purus ut enim pharetra iaculis. Quisque lacus nisi, tincidunt at mauris ut, hendrerit posuere mi. Phasellus id mattis augue, scelerisque porttitor arcu. "
				+ "Duis laoreet vitae massa nec varius. Suspendisse dolor nisl, "
				+ "tempor sed orci euismod, luctus dignissim nisi .");
		
		
		//System.out.println(v.palabrasOrdenadasPorOrdenAlfab());
		System.out.println(v.palabrasOrdenadasPorFreqDeOcurrencia());
		System.out.println(v.palabrasOrdenadasPorOrdenAlfab());
		System.out.println(v.palabrasMenosFrecuentes());
	}
}
		
		
//		String texto = "casa casa casa casa auto auto auto auto Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed posuere non turpis nec convallis.  z z z z "
//				+ "Phasellus non ultrices neque. Quisque ornare elementum purus, sit amet posuere magna dictum quis. Ut vulputate accumsan enim. Donec ac ipsum nulla. Quisque consectetur purus ut enim pharetra iaculis. Quisque lacus nisi, tincidunt at mauris ut, hendrerit posuere mi. Phasellus id mattis augue, scelerisque porttitor arcu. Duis laoreet vitae massa nec varius. Suspendisse dolor nisl, "
//				+ "tempor sed orci euismod, luctus dignissim nisi .";		
//		
//		String [] sp = texto.split(" ");
//		System.out.println(sp.length);
//		
//		Map <String, Integer> mapaPalabras = new HashMap<String, Integer>(); 
//		
//		for (String string : sp) {
//			string   =  string.toLowerCase();
//			if(mapaPalabras.containsKey(string)){
//				
//				mapaPalabras.put(string, mapaPalabras.get(string) + 1);
//				
//			}
//			else{
//				
//				mapaPalabras.put(string, 1);
//				
//			}	
//		}
//		
//		//System.out.println(mapaPalabras.toString());
//		
//		List <String> palabrasUnicas = new ArrayList <String> (mapaPalabras.keySet());
//		//System.out.println(palabrasUnicas.size());
//		
//	//	Collections.sort(palabrasUnicas);
//	//	System.out.println(palabrasUnicas);
//		
//		Comparator<String> comp1 = new Comparator<String>(){
//
//			@Override
//			public int compare(String o1, String o2) {
//
//				if(mapaPalabras.get(o1) > mapaPalabras.get(o2)){
//					
//					return -1;
//					
//				}
//				else if(mapaPalabras.get(o1) < mapaPalabras.get(o2)){
//					
//					return 1;
//					
//				}
//				
//				return 0;
//				
//			}
//			
//		};
//		
//		Collections.sort(palabrasUnicas, comp1);
//		System.out.println(palabrasUnicas);
//		
//		Iterator <String> zaraa = mapaPalabras.keySet().iterator();
//		List <String> busqueda = new ArrayList<String>();
//		int auxInt=0;
//		while(zaraa.hasNext()){
//			String auxString = zaraa.next();
//			if (mapaPalabras.get(auxString)>auxInt) {
//				auxInt = mapaPalabras.get(auxString);
//				busqueda.clear();
//				busqueda.add(auxString);
//			}
//			else if (mapaPalabras.get(auxString).equals(auxInt)){
//				
//				busqueda.add(auxString);
//				
//			}	
//		}
//		
//		System.out.println(busqueda.toString());
//
//		busqueda.clear();
//		zaraa = mapaPalabras.keySet().iterator();
//		auxInt = 100;
//		
//		while(zaraa.hasNext()){
//			String auxString = zaraa.next();
//			if (mapaPalabras.get(auxString)<auxInt) {
//				auxInt = mapaPalabras.get(auxString);
//				busqueda.clear();
//				busqueda.add(auxString);
//			}
//			else if (mapaPalabras.get(auxString).equals(auxInt)){
//				
//				busqueda.add(auxString);
//				
//			}	
//		}
//		System.out.println(busqueda);
//		
//		System.out.println(mapaPalabras.get("z") + "Sale birrulfia");
//		
//	}
//	
//	
//}
