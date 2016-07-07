import java.util.HashSet;
import java.util.Iterator;
/**
 * 
 * @author k.olszewski
 *
 * uses hash table to store the elements.It extends AbstractSet class and implements Set interface.
 * contains unique elements only.
 *
 */

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> list = new HashSet<>();
		list.add("dupa3");
		list.add("dupa1");
		list.add("dupa2");
		list.add("dupa2");
		list.add("dupa4");
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
