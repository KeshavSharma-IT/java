import java.util.ArrayList;
//import java.util.List;

public class DSA_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList=new ArrayList<Integer>(5);
		for(int i=1;i<=5;i++) {
			arrayList.add(i);
		}
//		print element
		System.out.println(arrayList);
		
//		remove element at index
		arrayList.remove(3);
		System.out.println(arrayList);
		
// print element one by one		
		for (int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println("another way to print value one by one is:");
// 	 print element one by one	second way
		for(int i: arrayList) {
			System.out.println(i);
		}
	}

}
