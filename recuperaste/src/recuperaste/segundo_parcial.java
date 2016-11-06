package recuperaste;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class segundo_parcial {

	private static final int LIMITE = 5;
	private static final int CANT_COLUMNAS = 3;
	private static final int CANT_FILAS = 3;
	private static final int SEPAR_SECUENCIA = 0;
	
	
	public static void cargar_matriz(int [][] matriz){
		
		for(int f = 0; f < CANT_FILAS; f++)
			for(int c = 0; c < CANT_COLUMNAS; c++)
				matriz[f][c] = (int)(Math.random() * 100); 
		
		matriz[0][0] = 0;
		matriz[0][2] = 0;
	}
	
	public static void mostrar_matriz(int [][] matriz){
		for(int i = 0; i < CANT_FILAS; i++){
			System.out.println("-----------------");
			for(int j = 0; j < CANT_COLUMNAS; j++){
				System.out.print(matriz[i][j]);
			    System.out.print("\\");
			}
			System.out.println("");		
		}
	}
	
	public static int inicio_secuencia(int [][] matriz,int fila, int fin_sec_anterior){
		
		int inicio = fin_sec_anterior;
		if(fin_sec_anterior < CANT_COLUMNAS){
			while(inicio < CANT_COLUMNAS && matriz[fila][inicio] == SEPAR_SECUENCIA)
				inicio++;
		}
		if(inicio == CANT_COLUMNAS) inicio = inicio - 1;
		return inicio;
	}

	public static int fin_secuencia(int [][] matriz,int fila, int ini_sec_anterior){
		
		int fin = ini_sec_anterior;
		while(fin < CANT_COLUMNAS && matriz[fila][fin] != 0)
			fin++;

		if(fin == CANT_COLUMNAS) fin--;
		return fin;
	}
	
	public static boolean mas_de_n_valores(int [][] matriz, int fila, int inicio, int fin, int n){
		int cantidad = 0;
		int i = inicio;
		while(i <= fin && cantidad <= LIMITE){
			if(matriz[fila][i] == n)
				cantidad++;
			i++;
		}
		return cantidad > LIMITE;
	}
	
	public static boolean mas_de_m_secuencias(int [][] matriz, int fila, int m){
		int cantidad = 0;
		int fin = 0;
		boolean continuar = true;
		while (continuar){
			int inicio = inicio_secuencia(matriz, fila, fin);
			fin = fin_secuencia(matriz, fila, inicio);
			cantidad++;
			if(fin == CANT_COLUMNAS - 1)
				continuar = false;
			}
		
        return cantidad > m;
		
	}
	
	public static int obtener_entero(){
		int valor = 0;
		boolean entero = false;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));   
		do {
		   try {
			   valor = new Integer(entrada.readLine());
			   entero = true;
		   }
		   catch (Exception exc ) {
			   System.out.println ("Ingresó valor inválido");
			   entero = false;
		   }	     
		} while (!entero);
		return valor;
	}
		
	public static void eliminar_fila_corrimiento(int matriz[][], int fila){
		for(int f = fila; f < CANT_FILAS - 1; f++)
			for(int c = 0; c < CANT_COLUMNAS; c++)
				matriz[f][c] = matriz[f+1][c]; 
	}

	public static int cantidad_secuencias_condicional(int matriz[][],int n){

		int cantidad = 0;
		
		for( int fila = 0; fila < CANT_FILAS; fila++){
			int fin_sec_anterior = 0;
			boolean continuar = true;
			while(continuar){
				int inicio = inicio_secuencia(matriz, fila, fin_sec_anterior);
				fin_sec_anterior = fin_secuencia(matriz, fila, inicio);
				if(!mas_de_n_valores(matriz, fila, inicio, fin_sec_anterior,n))
					cantidad++;
				if(fin_sec_anterior == CANT_COLUMNAS - 1)
					continuar = false;
				}
			}
		
	    return cantidad;
	}

	public static void eliminar_filas(int matriz[][], int m){
		int cant_filas = CANT_FILAS;
		int fila = 0;
		while(fila < cant_filas){
			if(mas_de_m_secuencias(matriz, fila, m)){
				eliminar_fila_corrimiento(matriz, fila);
				cant_filas--;
			}
			fila++;
					
		}
	}
	
	public static void main(String args[]){
		int [][] matriz = new int[CANT_FILAS][CANT_COLUMNAS];
		cargar_matriz(matriz);
		mostrar_matriz(matriz);
		int n = obtener_entero();
		int m = obtener_entero();
		int cant_sec = cantidad_secuencias_condicional(matriz, n);
		System.out.println("Hay " + cant_sec + " que cumple(n) la condición");
		eliminar_filas(matriz, m);
		mostrar_matriz(matriz);
	}
}
