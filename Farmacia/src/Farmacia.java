
public class Farmacia {
	public float getPrecio(Medicamento m, Paciente p){
		return m.getPrecio() - (m.getPrecio()*p.getDescuentoOS());
	}
	
	public static void main(String[] args) {
		Farmacia f1= new Farmacia();
		
		Medicamento mejoralito = new Medicamento (78,"Mejoralito");
		Medicamento ibuprofeno = new Medicamento (40,"Ibuprofeno");
		Medicamento ribotril = new Medicamento (150,"Ribotril");
		Medicamento penicilina = new Medicamento (90,"Penicilina");
		
		ObraSocial osde = new ObraSocial ("Osde", 0.6f);
		
		Paciente alfredo = new Paciente ("Alfredo",osde);
		
		alfredo.addSintoma("gripe");
		//alfredo.addSintoma("debilidad");
		
		penicilina.addSintoma("gripe");
		
		System.out.println(f1.getPrecio(penicilina, alfredo));
		
		System.out.println(alfredo.medicamentoApto(penicilina));
		
		
	}
}
