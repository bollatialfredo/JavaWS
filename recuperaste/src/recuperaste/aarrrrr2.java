package recuperaste;

	public class aarrrrr2 {
		public static void main(String[] args) {
			int arr[] = new int[10];
			
			for (int i = 0; i < 10; i++) {
				arr[i]=(int) (Math.random()*100);
			}
			for (int i = 0; i < 10; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			ordsecdes(arr);
			for (int i = 0; i < 10; i++) {
				System.out.print(arr[i]+" ");
			}
			insertar(arr, 33);
			System.out.println();
			for (int i = 0; i < 10; i++) {
				System.out.print(arr[i]+" ");
			}
			insertar(arr, 34);
			
			System.out.println();
			for (int i = 0; i < 10; i++) {
				System.out.print(arr[i]+" ");
			}
			
		}
		
		public static void insertar(int arr[], int e){
			int i =0;
			while(i<10&&arr[i]>e){
				i++;
			}
			System.out.println(i);
			int j=9;//maxcol - 1
			while(j>i && j>0){
				arr[j]=arr[j-1];
				j--;
			}
			if(i<10)
				arr[i]=e;
		}
		
		public static void ordsecdes(int arr[]){
			for(int i = 1;i<10;i++){
				for(int j=0;j<10-1;j++){
					if(arr[j]<arr[j+1]){
						int a=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=a;
					}
				}
			}
		}
}
