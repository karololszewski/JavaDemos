import java.util.Iterator;
import java.util.PriorityQueue;
/**
 * 
 * @author k.olszewski
 *
 * The Queue interface basically orders the element in FIFO(First In First Out)manner.
 *
 */

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("3");
		queue.add("1");
		queue.add("5");
		queue.add("2");
		queue.add("4");
		
		System.out.println("head: " + queue.element());
		System.out.println("head: " + queue.peek());

		System.out.println("Iterating the queue elements: ");
		
		Iterator it = queue.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		queue.remove();
		queue.poll();
		
		System.out.println("After removing two elements:");
		
		Iterator it2 = queue.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
	}

}
