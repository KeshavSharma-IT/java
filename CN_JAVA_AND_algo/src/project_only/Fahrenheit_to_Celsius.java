package project_only;
import java.util.Scanner;


public class Fahrenheit_to_Celsius {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please eneter start,end,step values");
		int start=sc.nextInt();
		int end=sc.nextInt();
		int step=sc.nextInt();
		
		int currentf=start;
		while(currentf<=end) {
			int celcius=(int)((5.0/9)*(currentf-32));
			System.out.println(currentf+"f" +"\t"+celcius+"c");
			currentf+=step;
		}
		
		

	}

}
