package Data_Structure;

import java.util.LinkedList;

class QueueExample1 {
	public static void main(String args[]) {
		LinkedList<String> queue = new LinkedList<String>();
		queue.offer("토끼");
		queue.offer("사슴");
		queue.offer("호랑이");
		System.out.println("Queue.peek() : " + queue.peek());
		while (!queue.isEmpty()) {
			String str = queue.poll();
			System.out.println(str);
		}
	}
}