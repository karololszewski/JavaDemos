import java.util.Iterator;
import java.util.LinkedHashSet;
/**
 * 
 * @author k.olszewski
 *
 * contains unique elements only like HashSet. It extends HashSet class and implements Set interface.
 * maintains insertion order.
 *
 */

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet<String> list = new LinkedHashSet<>();
		list.add("dupa1");
		list.add("dupa4");
		list.add("dupa2");
		list.add("dupa2");
		list.add("dupa3");
		
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
