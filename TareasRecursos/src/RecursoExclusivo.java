
public class RecursoExclusivo extends Recurso {
	
	public RecursoExclusivo(String n) {
		super(n);
	}
	ELMTarea t;
	@Override
	public boolean esPosibleAgregar(ELMTarea a) {
		if (t!=null) {
			return false;
		}
		t = a;
		return true;
	}

}
