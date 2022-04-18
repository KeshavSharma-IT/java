
public class typecasting {

	public static void main(String[] args) {
//		what ever you are converting is has to be in bigger bytes value not in less
//		you can't convert a big value in small 
		char ch='a';
		int i=ch;
		
		ch=(char)i;
		
		System.out.println(i);
		System.out.println(ch);
	}

}
