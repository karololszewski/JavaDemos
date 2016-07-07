import java.util.Hashtable;
import java.util.Map;
/**
 * 
 * @author k.olszewski
 *
 * A Hashtable is an array of list.Each list is known as a bucket.The position of bucket is identified by calling the hashcode() method.
 * A Hashtable contains values based on the key. It implements the Map interface and extends Dictionary class.
 * It contains only unique elements.
 * It may have not have any null key or value.
 * It is synchronized.
 *
 */

public class HashTableDemo {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> hashTable = new Hashtable<>();
		
		hashTable.put(101, "101");
		hashTable.put(100, "100");
		hashTable.put(102, "102");
		
		for(Map.Entry entry : hashTable.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
