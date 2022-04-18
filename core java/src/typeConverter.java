
public class typeConverter {

	public static void main(String args[]) {
		
		
//		implicit Data Type Conversion
		int a=100;
		System.out.println("int: "+a);
		long b=a;
		System.out.println("long: "+b);
		float c=b;
		System.out.println("float: "+c);
		
		
//		Explicit Data Types: larger value to small value
//		you may losse data
		
		double d=50.5878668987896;
		System.out.println("double: "+d);
		float f=(float)d;
		System.out.println("double to float: "+f);
		long l=(long)d;
		System.out.println("double to long: "+l);
		int i=(int)d;
		System.out.println("double to int: "+i);
	}
}
