import java.util.Comparator;

public class ComparatorPorNota implements Comparator<Alumno> {
	
	@Override
	public int compare(Alumno arg0, Alumno arg1){
		return arg0.getNotaFinal()-arg1.getNotaFinal();
	}

}
