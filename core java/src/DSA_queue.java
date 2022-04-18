import java.util.PriorityQueue;
import java.util.Queue;

public class DSA_queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		first element is head and last is tail
		
		Queue<String> queue=new PriorityQueue<>();
		
		
		queue.add("Germany");
		queue.add("America");
		queue.add("India");
		
		System.out.println("orignal queue:"+queue);
		
		queue.remove();
		System.out.println(queue);
		
		
		String head=queue.peek();
		System.out.println(head);
		
//		poll return the remove variable
		String remove_=queue.poll();
		System.out.println(remove_);
		
		System.out.println("orignal queue:"+queue);



		
	}
	

}
