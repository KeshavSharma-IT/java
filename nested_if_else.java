import java.util.Scanner;

public class nested_if_else {

	public static void main(String[] args) {
		
		int a,b;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter two no");
		 a=sc.nextInt();
		 b=sc.nextInt();
		 
		 if(a>b) {
			 System.out.println("first no is greater");
		 }

		 else if (b>a) {
			 System.out.println("second  no is greater");
		 }
		 else {
			 System.out.println("both are equal");
		 }
	}

}
