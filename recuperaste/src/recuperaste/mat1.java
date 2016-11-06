package recuperaste;

public class mat1 {
	private static int MAXFILA = 10;
	private static int MAXCOL = 10;
	
	public static void main(String[] args) {
		int mat[][] = new int[MAXFILA][MAXCOL];
		int arr[] = new int[MAXFILA];
		
		cargarMat(mat);
		imprimeMat(mat);
		cargaArr(arr);
		corrimientoMatHaciaAbajo(mat, 3);
		System.out.println();
		imprimeMat(mat);
		insertarArrEnMat(mat, arr, 3);
		System.out.println();
		imprimeMat(mat);
	}
	
	public static void insertarArrEnMat(int[][] mat, int[] arr, int posFila){
		for (int i = 0; i < MAXCOL; i++) {
			mat[posFila][i]=arr[i];
		}
	}
	
	public static void corrimientoMatHaciaAbajo(int[][] mat, int posFila){
		
		
		for (int i = MAXFILA-1; i > posFila; i--) {
			for (int j = 0; j < MAXCOL; j++) {
				mat[i][j]=mat[i-1][j];
			}
		}
	}
	
	public static void cargaArr(int[] arr){
		for (int i = 0; i < MAXFILA; i++) {
			arr[i]=1;
		}
	}
	
	public static void cargarMat(int mat[][]){
		for (int i = 0; i < MAXFILA; i++) {
			for (int j = 0; j < MAXCOL; j++) {
				mat[i][j]= (int) (Math.random()*10);
			}
		}
	}
	public static void imprimeMat(int mat[][]){
		for (int i = 0; i < MAXFILA; i++) {
			for (int j = 0; j < MAXCOL; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
			
		}
	}
}
