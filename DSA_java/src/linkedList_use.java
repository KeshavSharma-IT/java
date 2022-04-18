
public class linkedList_use {

	
	
	public static linkedlist_NODE<Integer> createLinkedlist() {
		linkedlist_NODE<Integer> n1=new linkedlist_NODE<>(10);
		linkedlist_NODE<Integer> n2=new linkedlist_NODE<>(20);
		linkedlist_NODE<Integer> n3=new linkedlist_NODE<>(30);
		linkedlist_NODE<Integer> n4=new linkedlist_NODE<>(40);
		
		n1.next=n2;
//		System.out.println("n1="+n1+" data="+n1.data+" next="+n1.next);
		n2.next=n3;
//		System.out.println("n2="+n2+" data="+n2.data+" next="+n2.next);
		n3.next=n4;
//		System.out.println("n3="+n3+" data="+n3.data+" next="+n3.next);
//		System.out.println("n4="+n4+" data="+n4.data+" next="+n4.next);
		
		return n1;
	}
	
	
	public static void printLinkedList(linkedlist_NODE<Integer>head) {
		System.out.println(head);
		System.out.println(head.data);
		System.out.println(head.next);
		System.out.println(head.next.data);
		System.out.println(head.next.next.data);
		
		
		
		
	}
		
			
	public static void main(String[] args) {
	
		
//		linkedlist_NODE n1=new linkedlist_NODE(10);
//		
//		n1 is holding the refrance of n1 data 
//		n1.next is holding address of next  node
//		System.out.println(n1);
//		System.out.println(n1.data);
//		System.out.println(n1.next);
		
		
		linkedlist_NODE<Integer>head=createLinkedlist();
		System.out.println("main"+head);
		printLinkedList(head);
			
	}

}
