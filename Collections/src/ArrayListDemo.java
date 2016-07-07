import java.util.ArrayList;
import java.util.Iterator;
/**
 * 
 * @author k.olszewski
 * 
 * Java ArrayList class uses a dynamic array for storing the elements.It extends AbstractList class and implements List interface.
 * Java ArrayList class can contain duplicate elements.
 * Java ArrayList class maintains insertion order.
 * Java ArrayList class is non synchronized.
 * Java ArrayList allows random access because array works at the index basis.
 * In Java ArrayList class, manipulation is slow because a lot of shifting needs to be occurred if any element is removed from the array list.
 */

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
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
