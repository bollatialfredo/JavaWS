public class Vehiculo {
	
	private double precio;
	private String modelo;
	private String patente;
	private boolean asociado = false; //sirve para comprobar si el auto ya se asocio a algun plan de ahorrro
	
	public Vehiculo(double _precio, String _modelo, String _patente){
		precio = _precio;
		modelo = _modelo;
		patente = _patente;
	}
	public double getPrecio(){
		return precio;
	}
	public void asociar(){
		asociado = true;
	}
	public boolean comprobarAsociado(){
		return asociado;
	}
	public String getPat(){
		return patente;
	}
	public void getData() {
		System.out.println("Modelo: " + modelo + ", Patente: " + patente + ", valor: $" + precio);
	}	
}
