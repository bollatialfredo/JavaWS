import java.util.Comparator;

public class Comparadorporisbn implements Comparator<Libro>{
	
		public int compare(Libro l1,Libro l2){
			return l1.getIsbn()-l2.getIsbn();
		}

}
