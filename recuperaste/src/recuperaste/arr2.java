package recuperaste;
import java.util.*;
public class arr2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		
		for (int i = 0; i < 10; i++) {
			arr[i]=(int) (Math.random()*100);
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("ing pos");
		int lala=sc.nextInt();
		for (int i = 9; i > lala; i--) {
			arr[i]=arr[i-1];
			if(i-1==0){
				
			}
			
		}
		arr[lala]=0;
		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("ing pos");
		lala=sc.nextInt();
		
		for (int i = 0; i < lala; i++) {
			arr[i]=arr[i+1];
		}
		arr[lala]=0;
		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i]+" ");
		}

	}
}
