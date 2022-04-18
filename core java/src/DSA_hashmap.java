import java.security.KeyStore.Entry;
import java.util.HashMap;

public class DSA_hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		map add value in key value pair
//		key has to be unique value can be dublicate
		
		HashMap<String,Integer> map= new HashMap<>();
		
		map.put("a", 10);
		map.put("b", 50);
		map.put("b", 20);
		map.put("c", 20);
		

		System.out.println("size of map:"+map.size());
		System.out.println("size of map:"+map);
		
		if(map.containsKey("a")) {
			Integer a=map.get("a");
			System.out.println("value of key a is :- "+a);
		}
//		print all key value pair
		for(String key:map.keySet()) {
			System.out.println("key is : "+key+", and value is : "+map.get(key));
		}
		
//		
		
	}

}
