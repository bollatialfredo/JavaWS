public class PlanAhorro {

	private final static int MAXCUOTA = 84;
	private int cantCuotasPorPagar = MAXCUOTA;
	private double cargoAdmin;
	private Vehiculo vehiculo;
	private int nroPlan; //el numero de plan se genera automaticamente desde el cliente el cual se guarda en esta variable.
	
	public PlanAhorro(Vehiculo auto, double _cargoAdmin){
		vehiculo = auto;
		cargoAdmin = _cargoAdmin;
	}
	public void pagarCuotas(int cuotas){
		double valor = 0;
		if(cuotas<=cantCuotasPorPagar){
			cantCuotasPorPagar -= cuotas;
			valor += (vehiculo.getPrecio()/MAXCUOTA)*(1+cargoAdmin);
			System.out.print("Numero de plan: "+nroPlan+", Vehiculo asociado ===>>> ");
			vehiculo.getData();
			System.out.println("Una cuota paga (CON cargo administrativo) por el valor de: $"+(vehiculo.getPrecio()/MAXCUOTA)*(1+cargoAdmin));
			if (cuotas>1){
				valor += (vehiculo.getPrecio()/MAXCUOTA)*(cuotas-1);
				System.out.println((cuotas-1)+" cuota/s (SIN cargo administrativo) paga/s, por el valor de: $"+(vehiculo.getPrecio()/MAXCUOTA)*(cuotas-1));
			}
		}else{
			System.out.println("***FALLA AL RECIBIR EL PAGO***, ingreso incorrecto de numero de cuotas");
			}
		System.out.println("El valor total a pagar por "+ cuotas +" cuota/s es de $"+valor);
		System.out.println("La cantidad de cuotas por pagar es de: "+cantCuotasPorPagar);
		System.out.println("****************************************************************************");
		System.out.println();
	}
	public int getCuotasPorPagar(){
		return cantCuotasPorPagar;
	}
	public int getNroPlan(){
		return nroPlan;
	}
	public void setNroPlan(int n){
		nroPlan = n;
	}
	public void getData(){
		System.out.print("Numero de plan: "+nroPlan+", porcentaje administrativo: "+cargoAdmin+", cuotas restantes: "+cantCuotasPorPagar+", vehiculo asociado: ");
		vehiculo.getData();
	}
	public String getPatPlan(){
		return vehiculo.getPat();
	}
}
