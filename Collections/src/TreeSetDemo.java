import java.util.Iterator;
import java.util.TreeSet;
/**
 * 
 * @author k.olszewski
 *
 * contains unique elements only like HashSet. The TreeSet class implements NavigableSet interface that extends the SortedSet interface.
 * maintains ascending order.
 *
 */

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet<String> list = new TreeSet<>();  
		list.add("Ravi");  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  

		Iterator it = list.iterator();  
		
		while(it.hasNext()){  
			System.out.println(it.next());  
		}  

	}

}
