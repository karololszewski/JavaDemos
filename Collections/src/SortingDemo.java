import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * 
 * @author k.olszewski
 *
 * String class and Wrapper classes implements the Comparable interface.
 * So if you store the objects of string or wrapper classes, it will be Comparable.
 *
 */
public class SortingDemo {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();  
		list.add("Viru");  
		list.add("Saurav");  
		list.add("Mukesh");  
		list.add("Tahir");  

		Collections.sort(list);  
		Iterator it = list.iterator();  
		while(it.hasNext()) {  
			System.out.println(it.next());  
		}
	}

}
