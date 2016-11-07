
public abstract class Recurso {
	String nombre;
	
	public Recurso(String n){
		nombre = n;
	}
	
	@Override
	public String toString() {
		return nombre;
	}
	
	public abstract boolean esPosibleAgregar(ELMTarea t);
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj ) {
			return true;
		}else{
			if (obj instanceof Recurso) {				
				return nombre.equals(((Recurso)obj).getNombre());
			}else{
				return false;
			}
		}
	}
	
	public String getNombre(){
		return nombre;
	}
}
