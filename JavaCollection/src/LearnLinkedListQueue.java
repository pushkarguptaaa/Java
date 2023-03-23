import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(3);
		queue.offer(5);
		queue.offer(2);
		queue.offer(7);
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.peek());
	}
}
