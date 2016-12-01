import java.util.Comparator;

public class ComparatorPorEdad implements Comparator<Alumno> {

	@Override
	public int compare(Alumno arg0, Alumno arg1) {
		
		return arg0.getEdad()-arg1.getEdad();
	}

}
