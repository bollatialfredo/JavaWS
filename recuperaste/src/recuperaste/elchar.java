package recuperaste;

public class elchar {
	private static int MAXFILA = 10;
	private static int MAXCOL = 10;
	
	public static void main(String[] args) {
		char mat[][] = new char[MAXFILA][MAXCOL];
		char arr[] = new char[MAXFILA];
		
		cargarMat(mat);
		imprimeMat(mat);
		cargaArr(arr);
		corrimientoMatHaciaAbajo(mat, 3);
		System.out.println();
		imprimeMat(mat);
		insertarArrEnMat(mat, arr, 3);
		System.out.println();
		ordenarFila(mat, 9);
		imprimeMat(mat);
	}
	
	public static void ordenarFila(char[][] mat, int posFila){
		for (int i = 1; i < MAXCOL; i++) {
			for (int j = 0; j < MAXCOL-1; j++) {
				if (mat[posFila][j]>mat[posFila][j+1]) {
					char tmp = mat[posFila][j];
					mat[posFila][j]=mat[posFila][j+1];
					mat[posFila][j+1]=tmp;
				}
			}
		}
	}
	
	public static void insertarArrEnMat(char[][] mat, char[] arr, int posFila){
		for (int i = 0; i < MAXCOL; i++) {
			mat[posFila][i]=arr[i];
		}
	}
	
	public static void corrimientoMatHaciaAbajo(char[][] mat, int posFila){
		
		
		for (int i = MAXFILA-1; i > posFila; i--) {
			for (int j = 0; j < MAXCOL; j++) {
				mat[i][j]=mat[i-1][j];
			}
		}
	}
	
	public static void cargaArr(char[] arr){
		for (int i = 0; i < MAXFILA; i++) {
			arr[i]=1;
		}
	}
	
	public static void cargarMat(char mat[][]){
		for (int i = 0; i < MAXFILA; i++) {
			for (int j = 0; j < MAXCOL; j++) {
				mat[i][j]= (char)(int) ((Math.random()*10)+100);
			}
		}
	}
	public static void imprimeMat(char mat[][]){
		for (int i = 0; i < MAXFILA; i++) {
			for (int j = 0; j < MAXCOL; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
			
		}
	}
}
