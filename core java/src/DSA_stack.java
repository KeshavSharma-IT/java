import java.util.Stack;

public class DSA_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		it maintain LIFO-last in first out
		
		Stack<String> stack=new Stack<>();
		
		stack.push("india");
		stack.push("usa");
		stack.push("china");
		
		System.out.println("stack"+stack);
		
		String poopedElement=stack.pop();
		System.out.println("poped elemnt: "+poopedElement);
		System.out.println(stack);
		
		String peekelement=stack.peek();
		System.out.println("check which element is on top: "+stack.peek());
		
		System.out.println("stack"+stack);
		
		
		
		
		
	}

}
