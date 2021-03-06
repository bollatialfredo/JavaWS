import java.util.*;

public class CentroComputo {
	private ColaOrdenada procesos;
	private ColaOrdenada pcs;
	
	public CentroComputo () {
		procesos = new ColaOrdenada();
		pcs = new ColaOrdenada();
	}
	
	public void addProceso (Proceso p) {
		if (pcs.vacia()){
			procesos.add(p);
		}else{
			pcs.print();
			pcs.procesar();
		}	
	}
	
	public void addComputadora (Computadora c) {
		if (procesos.vacia()){
			pcs.add(c);
		}else{
			procesos.procesar();
		}	
	}
	
	public String printPCS(){
		return pcs.print();
	}
	
	public String printProcesos(){
		return procesos.print();
	}
}
