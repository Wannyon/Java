package Data_Structure;

import java.util.LinkedList;

class StackExample1 {
	public static void main(String args[]) {
		LinkedList<Integer> stack = new LinkedList<Integer>();
		stack.addLast(12);
		stack.addLast(59);
		stack.addLast(7);
		System.out.println("stack.getLast() : " + stack.getLast());
		while (!stack.isEmpty()) {
			Integer num = stack.removeLast();
			System.out.println(num);
		}
	}
}
