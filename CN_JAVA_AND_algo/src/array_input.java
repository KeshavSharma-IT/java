import java.util.Scanner;
public class array_input {

	public static void main(String[] args) {
		int i=0;
		Scanner sc=new  Scanner(System.in);
		System.out.println("how many element you want in this array");
		int n=sc.nextInt();
		int arr[]=new int [n];
		
		for (i=0;i<n;i++) {
			System.out.println("Enter element in "+i+"th index");
			arr[i]=sc.nextInt();
			
		}
		i=0;
		while(i<n) {
			System.out.println(arr[i]);
			i++;
			
		}
		
//		we can use for loop too for printing array
//		
//		for (i=0;i<n;i++) {
//			System.out.println(arr[i]);
//		}
	}

}
