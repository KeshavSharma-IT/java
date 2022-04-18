
public class devide_function {
	
	
	public static int divide(int a,int b) {
		if(b==0) {
			return  Integer.MIN_VALUE;
		}
		return a/b;
	}
	
//	void function
	public static void divide_2(int a, int b) {
		if(b==0) {
			System.out.println("divisible by zero not allow");
			return;
		}
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		
		int num1=15;
		int num2=0;
		int result=divide(num1, num2);
		System.out.println(result);
		
		divide_2(num1, num2);
		
		
		

	}

}
