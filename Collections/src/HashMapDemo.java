import java.util.HashMap;
import java.util.Map;
/**
 * 
 * @author k.olszewski
 *
 * A HashMap contains values based on the key. It implements the Map interface and extends AbstractMap class.
 * It contains only unique elements.
 * It may have one null key and multiple null values.
 * It maintains no order
 *
 */

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<>();
		
		hashMap.put(100, "100");
		hashMap.put(101, "101");
		hashMap.put(102, "102");
		
		for(Map.Entry entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
