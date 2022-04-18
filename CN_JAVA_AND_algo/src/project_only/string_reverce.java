package project_only;

import java.util.Scanner;
public class string_reverce {
	
	public static String reverceString(String str) {
		String	str1="";
		for(int i=str.length()-1;i>=0;i--) {
		
			str1=str1+str.charAt(i);
		}
		return str1;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String rev=reverceString(str);
		
		System.out.println(rev);
		
		
		
		

	}

}
