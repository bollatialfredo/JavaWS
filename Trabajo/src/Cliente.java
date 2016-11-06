public class Cliente {
	
	private static final int MAXPLAN = 10;
	private String nombre;
	private String apellido;
	private String dir;
	private int dni;
	private long tel;
	private int cont = 0; 
	private int nrosPlan = 1; // cada cliente tiene sus numeros de planes, se generan automaticamente y se setean al plan correspondiente
	private PlanAhorro plan[] = new PlanAhorro[MAXPLAN];
	private Separador sp = new Separador();
	
	public Cliente(String nom, String ape, String dire, int _dni, long telef){
		nombre = nom;
		apellido = ape;
		dir = dire;
		dni = _dni;
		tel = telef;
	}
	public void setPlan(Vehiculo auto, double porcentAdmin){
		if(cont<MAXPLAN){
			plan[cont] = new PlanAhorro(auto, porcentAdmin);
			plan[cont].setNroPlan(nrosPlan);
			System.out.println("Felicitaciones "+nombre+", el plan de ahorro para su vehiculo ha sido aprovado."); 
			System.out.print("El vehiculo asociado a este plan es ===>>> ");
			auto.getData();
			System.out.println("NUMERO DE PLAN===>>> "+plan[cont].getNroPlan());
			cont++;
			nrosPlan++;
			sp.finLinea();
		}else{
			System.out.println("***FALLA AL DAR DE ALTA EL PLAN DE AHORRO***, limite excedido.");
			sp.finLinea();
		}
	}
	public void getData(){
		System.out.println("Nombre: "+nombre+" "+ apellido+", DNI: "+dni+", Direccion: "+ dir +", Telefono: "+ tel);
	}
	public int getCantPlanes(){
		return cont;
	}
	public int getDni(){
		return dni;
	}
	public int getCantCuotasRest(int posPlan){
		return plan[posPlan].getCuotasPorPagar();
	}
	public int getNrosPlanes(){
		return nrosPlan;
	}
	public String getPatPlan(int posiPlan){
		return plan[posiPlan].getPatPlan();
	}
	public int posPlan(int numPlan){
		for (int i=0;i<cont;i++){
			if (numPlan == plan[i].getNroPlan()){
				return i;
			}
		}
		System.out.println("***FALLA EN EL PAGO***: el numero de plan ingresado no corresponde a este cliente");
		sp.finLinea();
		return -1;
	}
	public void pagar(int posPlan, int cantCuotas){
		plan[posPlan].pagarCuotas(cantCuotas);
		if(plan[posPlan].getCuotasPorPagar()==0){
			System.out.println("Felicitaciones "+nombre+", ha finalizado el siguiente plan de ahorro: ");
			plan[posPlan].getData();
			eliminarPlan(posPlan);
			sp.finLinea();
		}
	}
	public void listarPlanes(){
		for(int i=0;i<cont;i++){
			plan[i].getData();
		}
	}
	public boolean deudorMasDe10Cuotas(){
		for(int i=0;i<cont;i++){
			if (plan[i].getCuotasPorPagar()>10)
				return true;
			}
		return false;
	}
	public void planesAdeudaMasDe20Cuotas(){
		boolean ct = false;
		for(int i=0;i<cont;i++){
			if(plan[i].getCuotasPorPagar()>20){
				plan[i].getData();
				ct = true;
			}
		}
		if(ct){
			System.out.print("Listado de planes con mas de 20 cuotas de deuda del cliente: ");
			getData();
		}
	}
	private void eliminarPlan(int posPlan){
		for(;posPlan<cont-1;posPlan++){
			plan[posPlan]=plan[posPlan+1];
		}
		cont--;
	}
}
