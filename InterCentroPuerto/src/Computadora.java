
public class Computadora implements Comparable<Computadora> {
	int velocidad;
	
	public Computadora (int vel) {
		velocidad = vel;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public int compareTo(Computadora c) {
		return velocidad - c.getVelocidad();
	}
	
	public String toString() {
		return ""+velocidad;
	}
}
