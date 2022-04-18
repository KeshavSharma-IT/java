
public class QueueUsingArray {

	
		
		private int data[];
		private int front;
		private int rear;
		private int size;
		
		public QueueUsingArray() {
			data=new int[6];
			front=-1;
			rear=-1;
		}
	
		public QueueUsingArray(int capacity) {
			data=new int[capacity];
			front=-1;
			rear=-1;
		}

		public int size() {
			return size;
		}
		public boolean isEmpty() {
			return size==0;
		}
		
		public void enqueue(int elem) {
			if (size==data.length) {
				System.out.println("queue is full");
			}
			
			if (size==0) {
				front=0;
			}
			
//			circular queue concept down
//			rear++;
//			if(rear==data.length) {
//				rear=0;
//			}
//			short form for circular down
			rear=(rear+1)%data.length;
			data[rear]=elem;
			size++;
		}
		public int front() {
			
			if (size==0) {
				System.out.println("empty");
			
			}
			return data[front];
			
		}
		
		public int dequeue() {
			
			if (size==0) {
				System.out.println("empty");
			
			}
			int temp=data[front];
			
//			circular 
//			front++;
//			if (front==data.length) {
//				front=0;
//				
//			}
//			short form for circular down
			front=(front+1)%data.length;
			size--;
			if(size==0) {
				front=-1;
				rear=-1;
			}
			return temp;
			
		}
}

