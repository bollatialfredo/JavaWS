import java.util.Collection;
import java.util.Vector;
public class Campo {
	
	private Collection <Lote> lotes = new Vector<Lote>();
	private Collection <Cereal> cereales = new Vector<Cereal>();	
		
	public void addLote(Lote lo){
		lotes.add(lo);
	}
	public void addCereal(Cereal ce){
		cereales.add(ce);
	}
	public Collection<Lote> getLotes(){
		return lotes;
	}
	
	public static void main(String[] args) {
		Campo c1 = new Campo();
		Lote l1 = new Lote("a", "especial", 45);
		Lote l2 = new Lote("b", "especial", 90);
		Lote l3 = new Lote("c", "especial", 55);
		Cereal cer1 = new Cereal("Centeno");
		Cereal cer2 = new Cereal("Soja");
		Cereal cer3 = new Cereal("Maiz");
		Cereal cer4 = new Cereal("Zanahoria");
		Cereal cer5 = new Pastura("Trigo");
		c1.addLote(l1);
		c1.addLote(l2);
		c1.addLote(l3);
		c1.addCereal(cer1);
		c1.addCereal(cer2);
		c1.addCereal(cer3);
		c1.addCereal(cer4);
		c1.addCereal(cer5);
		l1.addMineral("min1");
		l1.addMineral("min3");
		l1.addMineral("min2");
//		l1.addMineral("min9");
		l2.addMineral("min1");
		l2.addMineral("min2");
		l2.addMineral("min3");
//		l2.addMineral("min4");
		l3.addMineral("min1");
		l3.addMineral("min2");
		l3.addMineral("min3");
		l3.addMineral("min4");
		l3.addMineral("min6");
		cer1.addMineral("min3");
		cer1.addMineral("min2");
		cer1.addMineral("min1");
		cer5.addMineral("min1");
		cer5.addMineral("min6");

		System.out.println(cer1.puedoSembrarme(l1));
		
	
	}
}