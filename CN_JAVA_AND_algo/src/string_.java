
public class string_ {

	public static void main(String[] args) {
		
		String str="keshav";
		String str1="";
		String str2="Sharma";
		
		System.out.println(str);
		System.out.println(str.charAt(2));
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str+ " "+str2);
		str1=str.concat(str2);
		System.out.println(str1);
		
		System.out.println(str.equals(str2));
		System.out.println(str.endsWith("v"));
		
		System.out.println(str.compareTo(str2));
		
		System.out.println(str.contains("sh"));
	}

}
