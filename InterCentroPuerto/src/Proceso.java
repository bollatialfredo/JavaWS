
public class Proceso implements Comparable<Proceso>{
	int memoria;
	
	public Proceso (int mem) {
		memoria = mem;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	@Override
	public int compareTo(Proceso p) {
		return this.memoria - p.getMemoria();
	}
	
	@Override
	public String toString() {
		return ""+memoria;
	}
}
