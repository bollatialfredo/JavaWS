import java.util.*;

public class TareaCompuesta extends ELMTarea {
	
	List<ELMTarea> listaTareas = new ArrayList<ELMTarea>();
	
	public TareaCompuesta(String n){
		nombre = n;
	}
	
	@Override
	public int estado() {
		return 0;
	}

	@Override
	public List<Recurso> getRecursos() {
		Set<Recurso> aux = new HashSet<Recurso>();
		for (ELMTarea tarea : listaTareas) {
			aux.addAll(tarea.getRecursos());
		}
		
		return new ArrayList<Recurso>(aux);
	}

	@Override
	public int fechaInicio() {
		return 0;
	}
	@Override
	public List<ELMTarea> tareasQueUsaRecurso(Recurso r) {
		List<ELMTarea> l = new ArrayList<ELMTarea>();
		for (ELMTarea tarea : listaTareas) {
			l.addAll(tarea.tareasQueUsaRecurso(r));
		}	
		return l;
	}

	@Override
	public void addTarea(ELMTarea t) {
		listaTareas.add(t);
	}

}
