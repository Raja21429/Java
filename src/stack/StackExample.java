package stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(21);
		stack.push(23);
		System.out.println(stack.pop());
		
//		System.out.println(stack);
//		System.out.println(stack.size());
//		System.out.println(stack.clone());
		System.out.println(stack.indexOf(2));
		//int last_removed_value = stack.pop();
		//System.out.println("last_removed_value: "+last_removed_value);
		

	}

}
