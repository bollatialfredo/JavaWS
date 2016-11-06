public class Persona {
	
	private String nombre = "N";
	private String apellido = "N";
	private int DNI;
	private char sexo = 'f';
	private float peso = 1;
	private float altura = 1;
	private float imc;
	private int edad = 1;
	private String fechaNacimiento = "1/1/2000";
	
	public Persona(int dni){
		DNI = dni;
	}
	public Persona(int dni, String nom, String ape, String fechaNac){
		DNI = dni;
		nombre = nom;
		apellido = ape;
		fechaNacimiento = fechaNac;
	}
	public Persona (int dni, String nom, String ape, float pesO, float alturA){
		DNI = dni;
		nombre = nom;
		apellido = ape;
		peso = pesO;
		altura = alturA;
	}
	public float getImc (){
		imc = peso/(altura*altura);
		return imc;
	}
	public boolean enForma(){
		if (imc>=18.5 && imc<=25) {
			return true;
		}
		return false;
	}
	public boolean cumple(String fecha){
		if (fechaNacimiento == fecha) {
			return true;
		}
		return false;
	}
	public boolean mayorDeEdad(){
		if (edad>=18) {
			return true;
		}
		return false;
	}
}
