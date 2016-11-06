package recuperaste;

public class denuevo {
	final static int MAXFILA=10;
	final static int MAXCOL=22;
	
	public static void main(String[] args) {
		int[][] a = new int[MAXFILA][MAXCOL];
		
		int inicio=0, fin=0;
		cargaMatriz(a);
		imprimeMatriz(a);
		System.out.println();
		
		for (int i = 0; i < MAXFILA; i++) {
			while(fin<MAXCOL-1){
				inicio=inicioSecuencia(a, i, fin);
				fin=finSecuencia(a, i, inicio);
				int tenetefe = sumaDeSecuencia(a, i, inicio, fin);
				if(tenetefe>20){
					ordenarSecuencia(a, i, inicio, fin);
				}
				fin++;
				
			}
			inicio=0;
			fin=0;
			
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
		return (a-1);
	}
	
	public static int sumaDeSecuencia(int[][] mat, int fila, int inicio, int fin){
		int suma = 0;
		
		for(int h=inicio; h<=fin; h++){
			
			suma += mat[fila][h];
		}
		return suma;
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
}
