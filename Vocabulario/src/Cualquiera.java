
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Cualquiera {

	public static void main(String[] args) {
		
		List<String> lala = new ArrayList<String>();
		
		lala.add("d");
		lala.add("a");
		lala.add("b");
		
		System.out.println(lala);
		Collections.sort(lala);
		System.out.println(lala);
		
		Collections.sort(lala, Comparator.reverseOrder());
		System.out.println(lala);
		
		Map<String,Integer> cosa = new HashMap<String,Integer>();
		cosa.put("a", 1);
		cosa.put("d", 4);
		cosa.put("b", 0);
		
		Collections.sort(lala,new Comparator<String>() {

			@Override
			public int compare(String arg0, String arg1) {
				return cosa.get(arg0).compareTo(cosa.get(arg1));
			}
		});
		
		System.out.println(lala);
		
		lala.add("lala");
		lala.add("sdas");
		
		Collections.sort(lala);
		
		Collections.sort(lala,new Comparator<String>(){
				@Override
				public int compare(String arg0, String arg1) {
					if(arg0.length() > arg1.length())
						return -1;
					else
						if(arg0.length() < arg1.length())
							return 1;
						else
							return -1*arg0.compareTo(arg1);
				}
		});
		
		System.out.println(lala);	
	
	}
}
