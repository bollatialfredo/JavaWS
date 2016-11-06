
public class Simulador {
	public static void main(String[] args) {
		
		Seleccion s1 = new Seleccion("Argentina",30);
		
		Persona f1 = new Futbolista("Nicolin", "Salvatore", "Viajando", "Argentina", 3088888, "Mediocampista","Zurdo", 8);
		Persona d1 = new DirectorTecnico("Daniel A.", "Passarella", "Pais de origen", "Argentina", 239987, 2345);
		Persona m1 = new Masajista("Deivid", "Carlos", "Viajando por thailand", "Argentina", 3095582, "TUDAI");
		
		s1.addPersona(f1);
		s1.addPersona(d1);
		s1.addPersona(m1);
		
		
		s1.imprimirArreglo();
		s1.getDisponibilidad(f1);
		s1.getDisponibilidad(d1);
		s1.getDisponibilidad(m1);
		
		
		
		f1.print();
		
		d1.print();
		m1.print();
	
	}
}
