package project_only;
import java.util.Scanner;


public class even_odd {

	public static void main(String[] args) {
		 int a;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a no");
		 a=sc.nextInt();
		 
		 if (a%2==0){
			 System.out.println("Yes, it is a even no");
		 }
		 else {
			 System.out.println("Odd no");
		 }
	}
}
