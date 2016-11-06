public class Concesionaria {

	private static final int MAXCLIENTES = 1000;
	private static final int MAXAUTOS = 1000;
	private int contCli = 0; 
	private int contAut = 0;
	private Separador sp = new Separador(); //clase para separar mensajes mostrados por pantalla
	private Cliente cli[] = new Cliente[MAXCLIENTES];
	private Vehiculo auto[] = new Vehiculo[MAXAUTOS];
	
	public void altaCliente(String nom, String ape, String dire, int _dni, long telef){
		int i = encontrarCliente(_dni);
		if(i==-1){
			if (contCli<MAXCLIENTES){
				cli[contCli] = new Cliente(nom, ape, dire, _dni, telef);
				System.out.print("CLIENTE DADO DE ALTA ===>>> ");
				cli[contCli].getData();//el metodo getData de clase Cliente solo imprime mensajes por pantalla.
				contCli++;
			}else{
				System.out.println("***FALLA AL DAR DE ALTA EL CLIENTE***, limite excedido: ");
			}
			sp.finLinea();
		}else{
			System.out.println("***FALLA AL DAR DE ALTA EL CLIENTE***, DNI duplicado.");
			sp.finLinea();
		}		
	}
	public void altaVehiculo(double precio, String modelo, String patente){
		int i = encontrarAuto(patente);
		if(i==-1){
			if (contAut<MAXAUTOS){
				auto[contAut] = new Vehiculo(precio, modelo, patente);
				System.out.print("VEHICULO DADO DE ALTA ===>>>: ");
				auto[contAut].getData();
				contAut++;
			}else{
				System.out.println("***FALLA AL DAR DE ALTA EL VEHICULO***, limite excedido.");
			}
			sp.finLinea();
		}else{
			System.out.println("***FALLA AL DAR DE ALTA EL VEHICULO***, patente duplicada.");
			sp.finLinea();
		}
	}
	public void altaPlan(int dni, String pat, double porcentAdmin){
		int i = encontrarCliente(dni);
		int a = encontrarAuto(pat);
		if((a!=-1)&&(i!=-1)&&(!auto[a].comprobarAsociado())){
			cli[i].setPlan(auto[a], porcentAdmin);
			auto[a].asociar();
		}else{
			System.out.println("***FALLA AL VINCULAR EL VEHICULO***, patente o DNI erroneo");
			sp.finLinea();
		}
	}
	private int encontrarCliente(int dni){
		for(int i=0;i<contCli;i++){
			if(dni == cli[i].getDni()){
				return i;
			}
		}
		return -1;
	}
	private int encontrarAuto(String pat){
		for(int i = 0; i<contAut; i++){
			if (auto[i].getPat()==pat){
				return i;
			}
		}
		return -1;		
	}
	private void pagoSeguro(int dni, int nroPlan, int cantCuotas){
		int posCli = encontrarCliente(dni);
		if (posCli!=-1){
			int posPlan = cli[posCli].posPlan(nroPlan);
			if (posPlan!=-1){
				int a = cli[posCli].getCantCuotasRest(posPlan);
				if((cantCuotas==-2)||a==cantCuotas){
					int posAuto = encontrarAuto(cli[posCli].getPatPlan(posPlan)); //encuentra la pos del auto en el arr x medio de la patente
					cli[posCli].pagar(posPlan, a);
					eliminarAuto(posAuto);
				}else{
					cli[posCli].pagar(posPlan, cantCuotas);
				}
			}else{
				System.out.println("***FALLA AL REALIZAR EL PAGO***, plan inexistente");
				sp.finLinea();
			}
		}else{
			System.out.println("***FALLA AL REALIZAR EL PAGO***, cliente inexistente");
			sp.finLinea();
		}
	}
	public void cancelacion(int dni, int nroPlan){
		System.out.print("CANCELACION ===>>>");
		pagoSeguro(dni, nroPlan, -2); //con el -2 le indico al metodo pagoSeguro() que tiene que cancelar la totalidad de la deuda.
	}
	public void pagoCuota(int dni, int nroPlan){
		System.out.println("PAGO DE UNA CUOTA ===>>>");
		pagoSeguro(dni, nroPlan, 1);
	}
	public void adelantarCuotas(int dni, int nroPlan, int cantCuotas){
		System.out.println("ADELANTO DE CUOTAS ===>>>");
		if(cantCuotas>0){
			pagoSeguro(dni, nroPlan, cantCuotas);
		}else{
			System.out.println("***FALLA AL REALIZAR EL PAGO***, numero de cuotas no valido");
		}
		
	}
	public void listarClientes(){
		System.out.println("LISTADO DE PLANES DE CLIENTES ===>>>");
		for(int i = 0;i<contCli;i++){
			cli[i].getData();
			sp.finLinea();
		}
	}
	public void listarVehiculos(){
		System.out.println("LISTADO DE VEHICULOS EN CONCESIONARIA ===>>>");
		System.out.println();
		for(int i = 0;i<contAut;i++){
			auto[i].getData();
			sp.finLinea();
		}
	}
	public void listarPlanes(){
		System.out.println("LISTADO DE PLANES DE AHORRO ===>>>");
		for(int i = 0;i<contCli;i++){
			cli[i].getData();
			System.out.println("Planes asociados al cliente:");
			cli[i].listarPlanes();
			sp.finLinea();
		}
	}
	public void listarPlanesDeCliente(int dni){
		System.out.println("LISTADO DE PLANES DE AHORRO DE UN CLIENTE ===>>>");
		int i = encontrarCliente(dni);
		if (i!=-1){
			cli[i].listarPlanes();
			System.out.print("Cliente: ");
			cli[i].getData();
			sp.finLinea();
		}else{
			System.out.println("***FALLA AL BUSCAR EL CLIENTE***, DNI inexsistente");
			sp.finLinea();
		}
	}
	public void listarDeudoresMasDe10Cuotas(){
		System.out.println("LISTADO DE CLIENTES QUE ADEUDAN MAS DE 10 CUOTAS EN UNO O MAS PLANES DE AHORRO ===>>>");
		for(int i=0;i<contCli;i++){
			if(cli[i].deudorMasDe10Cuotas())
				cli[i].getData();
		}
		sp.finLinea();
	}
	public void listarPlanesDeudoresDeMasDe20Cuotas(){
		System.out.println("LISTADO DE PLANES DE AHORRO QUE ADEUDAN MAS DE 20 CUOTAS ===>>>");
		for(int i=0;i<contCli;i++){
			cli[i].planesAdeudaMasDe20Cuotas();
		}
		sp.finLinea();
	}
	private void eliminarAuto(int posAuto){
		for(;posAuto<contAut-1;posAuto++){
			auto[posAuto]=auto[posAuto+1];
		}
		contAut--;
	}
}

