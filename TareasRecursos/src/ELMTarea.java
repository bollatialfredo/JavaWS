import java.util.*;

public abstract class ELMTarea {
	int estado;
	int fechaInicio;
	int fechaFin;
	int fechaInicioEst;
	int fechaFinEst;
	String nombre;

	public abstract void addTarea(ELMTarea t);
	public abstract List<ELMTarea> tareasQueUsaRecurso(Recurso r);
	public abstract int estado();
	public abstract List<Recurso> getRecursos();
	public abstract int fechaInicio();
	
	@Override
	public String toString() {
		return nombre;
	}
}
