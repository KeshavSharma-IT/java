
public class StackUsingArray {

	
		// TODO Auto-generated method stub
		
	private int data[];
	private int topIndex;
		public StackUsingArray() {
			data=new int[10];
			topIndex=-1;

	}
		public int size() {
			
			return topIndex +1;
			
		}

		public void push(int elem) throws stackfullException {
			
			if(topIndex==data.length-1) {
				throw new stackfullException();
			}
			
			data[++topIndex]=elem;
		}
		
		public int top() {
			
			return data[topIndex];
		}
		public boolean isEmpty() throws StcakEmptyException {
			if (topIndex==-1) {
				
			throw new StcakEmptyException();
			}
			return topIndex==-1;
			
		}
		
		public int pop() throws StcakEmptyException {
			
			if(topIndex==-1) {
				
				throw new StcakEmptyException();
			}
			int temp=data[topIndex];
			topIndex--;
			return temp;
		}
		

}

