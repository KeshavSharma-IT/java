import java.util.TreeMap;
import java.util.TreeSet;

public class DSA_treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeMap<Integer,String> treeMap=new TreeMap<>();
		
		treeMap.put(3,"A");
		treeMap.put(2,"B");
		treeMap.put(1,"C");
		
		System.out.println(treeMap);
		
TreeMap<String,Integer> treeMapp=new TreeMap<>();
		
		treeMapp.put("A",3);
		treeMapp.put("C",2);
		treeMapp.put("B",1);
		
		System.out.println(treeMapp);
	}

}
