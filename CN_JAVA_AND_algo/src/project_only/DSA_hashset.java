package project_only;

import java.util.HashSet;

public class DSA_hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			HashSet<String> hashset=new HashSet<>();
			
			hashset.add("A");
			hashset.add("B");
			hashset.add("B");
			hashset.add("C");
			hashset.add("D");
			hashset.add("E");
			
			System.out.println(hashset);
			hashset.remove("A");
			System.out.println(hashset);
			
			for(String item:hashset) {
				System.out.println(item);
			}
	}

}
