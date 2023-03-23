import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		pq.offer(10);
		pq.offer(3);
		pq.offer(5);
		pq.offer(2);
		pq.offer(7);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.peek());
	}
}
