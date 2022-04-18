package project_only;
import java.util.Scanner;
public class prime_no {

	public static void main(String[] args) {
		int n,i=2,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(i<=n/2) {
			if(n%i==0) {
				count++;
			}
			i++;			
		}
		if(count==0) {
			System.out.println("prime");
		}
		else {
			System.out.println("composit");
		}
		

	}

}
