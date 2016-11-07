import java.util.*;

public class TareaTerminal extends ELMTarea {
	
	private Set<Recurso> setR = new HashSet<Recurso>();
	
	public TareaTerminal(String n){
		nombre = n;
	}
	
	
	public boolean addRecurso(Recurso r){
		if (r.esPosibleAgregar(this)) {
			return setR.add(r);			
		}
		return false;
	}
	
	@Override
	public int estado() {
		return estado;
	}

	@Override
	public List<Recurso> getRecursos() {
		return new ArrayList<Recurso>(setR);
	}

	@Override
	public int fechaInicio() {
		return 0;
	}

	@Override
	public List<ELMTarea> tareasQueUsaRecurso(Recurso r) {
		List<ELMTarea> l = new ArrayList<ELMTarea>();
		if( setR.contains(r)){
			l.add(this);
			return l;
		}else{
			return l;
		}
	}


	@Override
	public void addTarea(ELMTarea t) {
		
	}

}
