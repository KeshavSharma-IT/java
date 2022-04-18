import java.util.Scanner;

public class array_through_function {
	
	public static void printarray(int arr[]) {
		
		int i=0;
		int n=arr.length;
		while(i<n) {
			System.out.println(arr[i]);
			i++;
		}	
	}
	public static int[] input_array() {
		System.out.println("how many element you want in array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int arr[]=new int[n];
		
			
		for(i=0;i<n;i++) {
			System.out.println("Enter element in "+i+"th index");
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int arr[]=input_array();
		printarray(arr);
		
	}

}
