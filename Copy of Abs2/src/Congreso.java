import java.util.Vector;

public class Congreso {
	private Vector<Evaluador2> eva = new Vector<Evaluador2>();
	private Vector<Trabajo2> tra = new Vector<Trabajo2>();
	
	public void addEvaluador(Evaluador2 e){
		eva.add(e);
	}
	public void addTrabajo(Trabajo2 t){
		tra.add(t);
	}
	
	public static void main(String[] args) {
		Evaluador2 e1 = new Evaluador2("juan");
		e1.addPalabraClave("java");
		e1.addPalabraClave("ruby");
		e1.addPalabraClave("js");
		e1.addPalabraClave("php");
		Poster2 t1 = new Poster2("trabajo 1");
		t1.addPalabraClave("php");
		t1.addPalabraClave("js");
		
//		System.out.println(t1.puedoSerEvaluado(e1));
	}
}
