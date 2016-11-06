package recuperaste;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Programa7Bollati {
	
	final static int MAXFILA=10;
	final static int MAXCOL=22;
	
	public static void main(String[] args) {
		
		int[][] a = new int[MAXFILA][MAXCOL];
		int numUsuario, inicio, fin, suma;
		
		cargaMatriz(a);
		
		System.out.println("Ingrese el numero n");
		numUsuario = cargaEntero();
		
		imprimeMatriz(a);
		
		for(int fila=0;fila<MAXFILA;fila++){
			
			fin=0;
			
			inicio = inicioSecuencia(a, fila, fin); //encuentra las primeras secuencias para cada fila
			
			fin = finSecuencia(a, fila, inicio);     //no encuentro la manera de no hacer este paso al menos una vez antes de buscar 
			
			suma = sumaDeSecuencia(a, fila, inicio, fin); // las demas secuencias.
			
			if(suma>numUsuario){				
				ordenarSecuencia(a, fila, inicio, fin);
			}
		
			for(int j=fin+1; j<MAXCOL; j++){ //con el fin de la primer secuencia como parametro en este ciclo recorre el total de las
										
				inicio = inicioSecuencia(a, fila, fin+1); // columnas
				
				fin = finSecuencia(a, fila, inicio);
				
				suma = sumaDeSecuencia(a, fila, inicio, fin);
				
				if(suma>numUsuario){				
					ordenarSecuencia(a, fila, inicio, fin);
				}
					
			}
		}
		imprimeMatriz(a);
	}
	
	
	public static int inicioSecuencia(int[][] mat, int fila, int finAnterior){
		int a=finAnterior;
		
		while(a<MAXCOL && mat[fila][a]==0 ){
			a++;					
		}							
		return a;//devuelve la posicion de el primer numero despues de la secuencia de ceros si los hay.
	}
	
	public static int finSecuencia(int[][] mat, int fila, int inicioSecuencia){
		int a=inicioSecuencia;
		
		while(a<MAXCOL && mat[fila][a]!=0){
			a++;
		}
		return (a-1);//devuelve la posicion del ultimo numero de la secuencia.
	}
	
	public static void ordenarSecuencia(int[][]mat, int fila, int inicio, int fin){
			
			for (int i=inicio; i<=fin; i++){
				
				for(int j=inicio; j<fin; j++){
					
					if(mat[fila][j]>mat[fila][j+1]){
						
						intercalarValor(mat, fila, j, j+1);
					}
				}
			}
		}
	

	
	public static void intercalarValor( int[][] mat, int fila, int j, int i){
		int tmp = mat[fila][j];
		mat[fila][j] = mat[fila][i];
		mat[fila][i] = tmp;
	}
	
	public static int sumaDeSecuencia(int[][] mat, int fila, int inicio, int fin){
		int suma = 0;
		
		for(int h=inicio; h<=fin; h++){
			
			suma += mat[fila][h];
		}
		return suma;
	}
	
	
	public static void cargaMatriz(int[][] mat){
		
		for (int j=0;j<MAXFILA;j++){
			for (int i=0;i<MAXCOL;i++){
				mat[j][i]= (int) (Math.random()*10);
			}
		}
	}
	
	public static void imprimeMatriz(int[][] mat){
		
		for(int j=0;j<MAXFILA;j++){
			for(int i=0;i<MAXCOL;i++){
				System.out.print(mat[j][i]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static int cargaEntero(){
		int a=0;
		boolean control=false;
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		do
			try{
				System.out.println("Ingrese un numero entero.");
				a = new Integer(bf.readLine());
				control=true;
			}catch(Exception ex){
				System.out.print("Valor ingresado invalido, ");
				control=false;
			}
		while(!control);
		return a;
	}
}

