package project_only;

import java.util.Scanner;

public class negative_positive {

	public static void main(String[] args) {
		int a,b;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter two no");
		 a=sc.nextInt();
		 b=sc.nextInt();
		 
		 if (a>0 && b>0) {
			 System.out.println("both are positive");
		 }
		 else {
			 System.out.println("both are not positive");
		 }
	}

}
