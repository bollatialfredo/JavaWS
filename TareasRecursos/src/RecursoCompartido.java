
public class RecursoCompartido extends Recurso {

	public RecursoCompartido(String n) {
		super(n);
	}

	@Override
	public boolean esPosibleAgregar(ELMTarea t) {
		return true;
	}

}
