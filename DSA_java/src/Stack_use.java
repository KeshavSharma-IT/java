
public class Stack_use {

	public static void main(String[] args) throws stackfullException, StcakEmptyException {
		
		// TODO Auto-generated method stub
		StackUsingArray stack=new StackUsingArray();

		int arr[]= {5,6,7,1,9};
		
		for (int i=0;i<arr.length;i++) {
			stack.push(arr[i]);
		}
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		
//		stack.push(10);
//		System.out.println(stack.top());
//		stack.pop();
//		stack.size();
//		System.out.println(stack.isEmpty());
		
	}

}
