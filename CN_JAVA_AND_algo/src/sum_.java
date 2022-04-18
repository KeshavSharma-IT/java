
import java.util.Scanner;
public class sum_ {
	
	
	public static int sum(int a,int b) {
		int sum=a+b;
		
		return sum;
	}
   
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int result=sum(num1,num2);
		System.out.println(result);
		
	}

}
