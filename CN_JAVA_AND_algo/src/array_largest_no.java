import java.util.Scanner;

public class array_largest_no {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("how many element you want to add");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int max=0;
		
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("maxmimum no in this array is="+max);
		
		 

	}

}
