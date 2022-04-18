import java.util.Scanner;
public class prime_function {
	
	
	public static boolean checkprime(int n) {
		int div=2;
		while(div<=n/2) {
			if(n%div==0) {
				return false;					
			}
			div=div+1;
					
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n;
		n=sc.nextInt();
		boolean prime=checkprime(n);
		System.out.println(prime);
		

	}

}
