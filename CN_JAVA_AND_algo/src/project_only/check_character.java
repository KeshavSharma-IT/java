package project_only;
import java.util.Scanner;

public class check_character {

	public static void main(String[] args) {
		char c;
		Scanner sc=new Scanner(System.in);
		c=sc.next().charAt(0);
		
		if (c>='A' && c<='Z'){
			System.out.println("Upper case");
			
		}
		else if (c>='a' && c<='z') {
			System.out.println("lower case ");
		}
		else {
			System.out.println("invalid character");
		}
	}

}
