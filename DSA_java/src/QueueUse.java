
public class QueueUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			QueueUsingArray queue=new QueueUsingArray();
			int arr[]= {10,20,30,40};
			for(int elem:arr) {
				queue.enqueue(elem);
			}

			while (!queue.isEmpty()) {
				System.out.println(queue.dequeue());
			}
	}

}
