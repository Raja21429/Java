package queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExampleQueue {

	public static void main(String[] args) {
		Queue <Integer> que = new LinkedList<Integer>();
		que.offer(10);
		que.offer(20);
		que.offer(30);
		que.offer(40);
		System.out.println(que.poll());
//		System.out.println(que.peek());
//		System.out.println(que.remove(1));

	}

}
