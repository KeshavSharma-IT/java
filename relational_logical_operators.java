
public class relational_logical_operators {

	public static void main(String[] args) {
		int a=10,b=10;
//		System.out.println(a>b);
//		System.out.println(a<b);
//		System.out.println(a==b);
//		System.out.println(a!=b);
//		System.out.println(a>=b);
//		System.out.println(a<=b);
		
		
//		logical operator
//		AND- both have to true
//		OR- if any one is true output is true
//		NOT- it return oposite of condition
		
		System.out.println(a>10 && b>10);
		System.out.println(a>=10 && b>=10);
		
		System.out.println(a>10 || b>10);
		System.out.println(a>=10 || b>=10);
		System.out.println(a>10 || b>=10);
		
		
		System.out.println(!(a>b));
		
	}
	

}
