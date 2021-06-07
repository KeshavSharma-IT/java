
import java.util.Scanner;

public class _1_Program {
	 
	public static void main(String[] args) {
		
		int m1,m2,m3;
		String str;
		char ch;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the name");
		str=sc.next();
		ch=str.charAt(0);
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
				
		 int Avg=(m1+m2+m3)/3;
		 
		 System.out.println("name= "+ch);
				 
				 System.out.println(Avg);
		
		
	}
}
