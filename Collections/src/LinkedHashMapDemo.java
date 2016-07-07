import java.util.LinkedHashMap;
import java.util.Map;
/**
 * 
 * @author k.olszewski
 *
 * A LinkedHashMap contains values based on the key. It implements the Map interface and extends HashMap class.
 * It contains only unique elements.
 * It may have one null key and multiple null values.
 * It is same as HashMap instead maintains insertion order.
 *
 */

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> hashMap = new LinkedHashMap<>();
		
		hashMap.put(100, "100");
		hashMap.put(101, "101");
		hashMap.put(102, "102");
		
		for(Map.Entry entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
