public class Ordenamiento1 {
	private int[] intArray2 = new int[6];
	private int[] intArray = {1,3,5,6,9,12,14,16,21};


	public Ordenamiento1(){
		for (int i = 0; i < intArray2.length; i++) {
			intArray2[i] = (int) Math.floor(Math.random() * 101);
		}
	}

	/**
	 * Imprimir Array
	 * @return
	 */
	public String imprimirArr () {
		String s = "";
		for (int i = 0; i < intArray.length; i++) {
			s += intArray[i] + " ";
		}

		return s;
	}

	public boolean comprobarArregloDes () {
		if (intArray.length == 1) {
			return true;
		}
		return comprobarOrdDec(0);
	}

	public boolean contieneElementoArrOdenadoAsc(int valor){
		if(intArray.length >= 1 ) {
			int indice = 0;
			return contieneElementoArrOdenadoAscPriv(indice, valor);
		}
		return false;
	}

	//***********************************************************

	/**
	 * Comprueba si un arreglo est� ordenado descendente
	 * @param indice
	 * @return
	 */
	private boolean comprobarOrdDec(int indice){

		if(intArray[indice] > intArray[indice+1]){
			if(indice+2 == intArray.length) {
				return  true;
			}else{

			}
			return comprobarOrdDec(indice+1);
		}

		return false;
	}

	private boolean contieneElementoArrOdenadoAscPriv (int i, int valor) {
		if(i < intArray.length) {
			System.out.println("Recursion"+i);
			if (intArray[i] == valor) {
				return true;
			}
			else {
				if(intArray[i] < valor) 				
					return contieneElementoArrOdenadoAscPriv(i+1,valor);
				else 
					return false;
			}
		
		}
		return false;
	}
	
}