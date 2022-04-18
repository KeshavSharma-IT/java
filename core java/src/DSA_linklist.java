import java.util.LinkedList;

public class DSA_linklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list=new LinkedList<String>();
		
		list.add("A");
		list.add("B");
		list.addFirst("C");
		list.addLast("D");
		list.add(2,"E");
		
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
	}

}
