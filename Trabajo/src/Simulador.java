import java.util.*;
public class Simulador {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Concesionaria s = new Concesionaria();
		s.altaCliente("juan", "perez", "pinto 399", 2000000, 2494789);
		s.altaCliente("jose", "gonzalez", "pinto 400", 3000000, 24944040);
		s.altaVehiculo(295000, "Ford Ka", "AAA 001");
		s.altaVehiculo(355000, "Ford Fiesta", "BBB 001");
		s.altaVehiculo(355000, "Ford Fiesta", "CCC 001");
		s.altaPlan(2000000, "AAA 001", 0.02);
		s.altaPlan(3000000, "BBB 001", 0.02);
		s.altaPlan(2000000, "CCC 001", 0.02);
		System.out.println("===>>>INGRESE STRING");
		sc.nextLine();
		s.listarPlanes();
		s.listarClientes();
		s.listarVehiculos();
		s.adelantarCuotas(2000000, 1, 10);
		System.out.println("===>>>INGRESE STRING");
		sc.nextLine();
		s.listarPlanes();
		s.listarDeudoresMasDe10Cuotas();
		s.cancelacion(3000000, 1);
		System.out.println("===>>>INGRESE STRING");
		sc.nextLine();
		s.listarPlanes();
		s.listarVehiculos();
		s.cancelacion(2000000, 2);
		System.out.println("===>>>INGRESE STRING");
		sc.nextLine();
		s.listarPlanesDeudoresDeMasDe20Cuotas();
		s.listarVehiculos();
		s.adelantarCuotas(2000000, 1, 60);
		System.out.println("===>>>INGRESE STRING");
		sc.nextLine();
		s.listarPlanes();
		s.listarPlanesDeCliente(2000000);
		s.cancelacion(2000000, 1);
		System.out.println("===>>>INGRESE STRING");
		sc.nextLine();
		s.listarPlanes();
		s.listarVehiculos();
		sc.close();
	}

}
