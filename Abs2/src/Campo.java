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
		Lote l1 = new Lote("a", "especial", 55);
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
		l1.addPalabraClave("min1");
		l1.addPalabraClave("min3");
		l1.addPalabraClave("min2");
		l1.addPalabraClave("min9");
		l2.addPalabraClave("min1");
		l2.addPalabraClave("min2");
		l2.addPalabraClave("min3");
//		l2.addPalabraClave("min4");
		l3.addPalabraClave("min1");
		l3.addPalabraClave("min2");
		l3.addPalabraClave("min3");
		l3.addPalabraClave("min4");
		l3.addPalabraClave("min6");
		cer1.addPalabraClave("min3");
		cer1.addPalabraClave("min2");
		cer1.addPalabraClave("min1");
		cer5.addPalabraClave("min1");
		cer5.addPalabraClave("min6");
//		
//		System.out.println(cer1.esApto(l1));
//		System.out.println(l1.esApto(cer1));
//		System.out.println(cer5.esApto(l1));
//		System.out.println(l1.esApto(cer5));
		System.out.println(cer5.equals(cer5));
		cer5
	}
}