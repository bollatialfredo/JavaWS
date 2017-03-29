import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Sim {
	
	//**********************Main*****************************************
		public static void main(String[] args) {
			Ordenamiento1 ord = new Ordenamiento1();
			MergeSort merge = new MergeSort();
			System.out.println("Arreglo");
			System.out.println(ord.imprimirArr());
			System.out.println(ord.comprobarArregloDes());
			System.out.println(ord.contieneElementoArrOdenadoAsc(4));
			
			Ordenamiento2 lista = new Ordenamiento2();
			
			lista.addNodo(25);
			lista.addNodo(13);
			lista.addNodo(14);
			lista.addNodo(15);
			lista.addNodo(16);
			lista.addNodo(17);
			System.out.println();
			System.out.println("Lista Vinculada");
			System.out.println(lista.toString());
			System.out.println(lista.getOrdenadaDes());
			System.out.println(lista.buscarElemento(25));
			
			BurbujeoSeleccion sel = new BurbujeoSeleccion();
			
			System.out.println("Arreglo Ordenado Seleccion");
			System.out.println(sel.imprimirArr());
			sel.ordenarSeleccion();
			System.out.println(sel.imprimirArr());
			
			BurbujeoSeleccion burbuja = new BurbujeoSeleccion();
			
			System.out.println("Arreglo Ordenado Burbuja");
			System.out.println(burbuja.imprimirArr());
			burbuja.ordenarBurbuja();
			System.out.println(burbuja.imprimirArr());
			
			//Array ordenado por metodo MergeSort
			int[] arrayMerge = new int [100000];
			for (int i = 0; i < arrayMerge.length; i++) {
				arrayMerge[i] = (int) Math.floor(Math.random() * 101);
			}
			long startTime = System.nanoTime();
			merge.sort(arrayMerge);
			long endTime = System.nanoTime();
			System.out.println("Merge sort took "+(endTime - startTime) + " ns");
			
			//*****************************************
			System.out.println();
			
			//Array ordenado por metodo de Java Arrays.sort()
			int[] arrayMerge2 = new int[100000];
			for (int i = 0; i < arrayMerge2.length; i++) {
				arrayMerge2[i] = (int) Math.floor(Math.random() * 101);
			}
			long startTime2 = System.nanoTime();
			
			Arrays.sort(arrayMerge2);
			
			long endTime2 = System.nanoTime();
			
			System.out.println("Arrays sort took "+(endTime2 - startTime2) + " ns");
			
			//**********Arbol Binario *********************************************
			
			ArbolBinario arbol = new ArbolBinario();
			arbol.addNodoBinario(15);
			arbol.addNodoBinario(12);
			arbol.addNodoBinario(6);
			arbol.addNodoBinario(18);
			arbol.addNodoBinario(1);
			arbol.addNodoBinario(34);
			arbol.addNodoBinario(19);
			arbol.addNodoBinario(4);
			
			ArrayList aux = arbol.getValoresPreOrden();
			for (int i = 0; i < aux.size(); i++) {
				System.out.println(aux.get(i));
			}
		}


}