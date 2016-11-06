
public class AlarmaSensorial extends Alarma {
	
	private int cont=0;
	private int tamaniosArr=0;
	private Sensor sen[];
	
	public AlarmaSensorial(int cantParteCasa){
		tamaniosArr = cantParteCasa;
		
	}
	public void addParteCasa(String a){
		if (cont<tamaniosArr) {
			sen[cont] = new Sensor(a);
			cont++;
		}
	}
	public boolean comprobar(){
		boolean aux = false;
		for (int i = 0; i < cont; i++) {
			if (sen[i].estadoDeSensor()){
				sen[i].imprimir();
				aux=true;
			}
		}
		return aux;
	}
}
