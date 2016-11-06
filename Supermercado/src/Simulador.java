import java.util.Vector;

public class Simulador {
   public static void main(String[] args) {
	Supermercado elmonoviejo = new Supermercado("El Mono Viejo");
	
	Impuesto bajo = new ImpuestoBajo(0.6f,0.25f);
	Impuesto alto = new ImpuestoAlto(0.8f,0.3f);
	
	ControlStock cs1 = new ControlStock(10);
	ControlStock cs2 = new ControlStock(10);
	ControlStock cs3 = new ControlStock(10);
	ControlStock cs4 = new ControlStock(10);
	
	Producto yerba = new Producto("Yerba","Andresito", 35);
	Producto azucar = new Producto("Azucar","Chango", 27);
	Producto traviata = new Producto("Traviata","Bagley", 12);
	Producto detergente = new Producto("Detergente","Ala", 28);
	
	yerba.setImpuesto(bajo);
	yerba.setControlStock(cs1);
	yerba.modificarStock(30);
		
	azucar.setImpuesto(bajo);
	azucar.setControlStock(cs2);
	azucar.modificarStock(28);
	
	traviata.setImpuesto(alto);
	traviata.setControlStock(cs3);
	traviata.modificarStock(34);
	
	detergente.setControlStock(cs4);
	detergente.modificarStock(14);
	
	
	elmonoviejo.addProducto(yerba);
	elmonoviejo.addProducto(azucar);
	elmonoviejo.addProducto(traviata);
	elmonoviejo.addProducto(detergente);
	
	Vector<Venta> v1 = new Vector<Venta>(); 
	Venta venta1 = new Venta("Yerba", yerba.getPrecio(2));
	Venta venta2 = new Venta("Detergente", detergente.getPrecio(1));
	Venta venta3 = new Venta("Traviata", traviata.getPrecio(5));
	v1.add(venta1);
	v1.add(venta2);
	v1.add(venta3);
	elmonoviejo.vender(v1);
	
	Vector<Venta> v2 = new Vector<Venta>(); 
	Venta venta4 = new Venta("Detergente", detergente.getPrecio(1));
	
	v2.add(venta4);
	
	elmonoviejo.vender(v2);
	
	System.out.println(elmonoviejo.toString());
}
}
