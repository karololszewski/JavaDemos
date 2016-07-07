import java.util.ArrayList;
import java.util.ListIterator;
/**
 * 
 * @author k.olszewski
 *
 * List Interface is the subinterface of Collection.
 * It contains methods to insert and delete elements in index basis.It is a factory of ListIterator interface.
 *
 */
public class ListIteratorDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("dupa1");
		list.add("dupa2");
		list.add("dupa3");
		list.add("dupa4");
		
		ListIterator it = list.listIterator();
		
		System.out.println("traversing elements in forward direction..."); 
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("traversing elements in backward direction...");
		
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		
	}

}
