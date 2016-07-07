import java.util.Iterator;
import java.util.LinkedList;
/**
 * 
 * @author k.olszewski
 *
 * Java LinkedList class uses doubly linked list to store the elements. It extends the AbstractList class and implements List and Deque interfaces.
 * Java LinkedList class can contain duplicate elements.
 * Java LinkedList class maintains insertion order.
 * Java LinkedList class is non synchronized.
 * In Java LinkedList class, manipulation is fast because no shifting needs to be occurred.
 * Java LinkedList class can be used as list, stack or queue.
 *
 */
public class LinkedListDemo {

	public static void main(String[] args) {
	
		LinkedList<String> list = new LinkedList<>();
		list.add("dupa1");
		list.add("dupa2");
		list.add("dupa3");
		list.add("dupa4");
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
