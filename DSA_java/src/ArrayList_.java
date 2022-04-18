
import java.util.ArrayList;

public class ArrayList_ {
	
	
	public static ArrayList<Integer> removeDuplivcate(int arr_2[]){
//		remove duplicate element
		ArrayList<Integer> result=new ArrayList<>();
		result.add(arr_2[0]);
		for(int i=1;i<arr_2.length;i++) {
			if(arr_2[i]!=arr_2[i-1]) {
				result.add(arr_2[i]);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>();
//		add(value)
		arr.add(10);
		arr.add(20);
		arr.add(30);
//		add(index,value)
		arr.add(1,80); 
		arr.add(30);
		
		System.out.println(arr.size());
		System.out.println(arr);
//		remove(index)
		arr.remove(1);
		System.out.println(arr);
//		get(index)
		System.out.println(arr.get(1));
//		set replace the value it didn't increase the size of array
		arr.set(0, 100);
		System.out.println(arr);

//		loop for itration
		for (int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
//		for each loop
		for(int i :arr) {
			System.out.println(i);
		}
		

//		duplicate element
		int arr_2[]= {10,10,20,20,40,50,50};
		
		ArrayList<Integer> result = removeDuplivcate(arr_2);
		
		for(int i=0;i<result.size();i++)  {
			System.out.println("duplicate remove new array is= "+result.get(i));
		}
		System.out.println("duplicate remove new array is= "+result);
		
		
	}

}
