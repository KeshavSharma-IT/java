import java.util.Scanner;
public class loop {

	public static void main(String[] args) {
		int i=1,n;
		
		System.out.println("how many time you want to print hello?");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		while(i<=n) {
			System.out.println("hello  "+i);
			i+=1;
			
		}
	}

}
