
public class Sim {

	public static void main(String[] args) {
		ELMTarea t = new TareaCompuesta("Tarea Padre");
		ELMTarea t1 = new TareaTerminal("Cortar el pastito");
		ELMTarea t2 = new TareaTerminal("Colapsar");
		ELMTarea t3 = new TareaTerminal("buscar minusas en el facebook");
		Recurso r1 = new RecursoExclusivo("Deivid");
		Recurso r2 = new RecursoExclusivo("Nico Collapse");
		Recurso r3 = new RecursoCompartido("WiFi");
		
		t.addTarea(t1);
		t.addTarea(t2);
		t.addTarea(t3);
		((TareaTerminal)t1).addRecurso(r1);
		((TareaTerminal)t1).addRecurso(r3);
		((TareaTerminal)t2).addRecurso(r2);
		((TareaTerminal)t3).addRecurso(r3);
		((TareaTerminal)t1).addRecurso(r2);
		
		System.out.println(t.tareasQueUsaRecurso(r2));
	}

}
