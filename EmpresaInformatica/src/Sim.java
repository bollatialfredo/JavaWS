
public class Sim {
	
	public static void main(String[] args) {
	
		Empleado e1 = new Empleado("pepe");
		
		e1.setSueldo(7600);
		
		e1.imprimir();
		
		EmpleadoPorHora h1 = new EmpleadoPorHora("juan");
		
		h1.setHorasExtra(45);
		h1.setSueldo(8900);
		h1.calcularSueldo();
		h1.imprimir();
		
		Empleado h2 = new EmpleadoPorHora("lolito");
		
		((EmpleadoPorHora) h2).setHorasExtra(24);
		h2.setSueldo(9800);
		h2.calcularSueldo();
		h2.imprimir();
	
		Empleado c1 = new EmpleadoComision("Jorge");
		
		c1.setSueldo(8000);
		((EmpleadoComision) c1).setCantVentas(12);
		c1.calcularSueldo();
		c1.imprimir();
	}
	
}
