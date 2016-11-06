
public class Simulador {
	
	public static void main(String[] args) {
		Concesionaria s = new Concesionaria();
		s.altaCliente("alfredo", "bollati", "los patos 152", 32, 555643);
		s.altaCliente("pepe", "bollati", "los patos 152", 31555, 555643);
		s.altaCliente("lolo", "bollati", "los patos 152", 31555, 555643);
		s.altaVehiculo(300000, "dunita", "jfi 009");
		s.altaVehiculo(300000, "dunita", "jfi 009");
		s.altaVehiculo(300000, "dunita", "b1");
		s.altaVehiculo(300000, "dunita", "b2");
		s.altaVehiculo(300000, "dunita", "b3");
		s.altaVehiculo(300000, "dunita", "b4");
		s.altaVehiculo(300000, "dunita", "b5");
		s.altaPlan(32, "b5", 0.04);
		s.altaPlan(31555, "b1", 0.04);
		s.altaPlan(31555, "b2", 0.04);
		s.pagoCuota(32, 1);
		s.altaPlan(32, "b4", 0.01);
		s.adelantarCuotas(32, 2, 6);
		s.listarVehiculos();
		s.cancelacion(32, 2);
		s.listarVehiculos();
		s.altaPlan(32, "b3", 0.02);
		s.listarPlanesDeCliente(32);
		s.listarPlanes();
		s.listarPlanesDeudoresDeMasDe20Cuotas();
		
	}

}
