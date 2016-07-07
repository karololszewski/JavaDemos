import java.util.Map;
import java.util.TreeMap;
/**
 * 
 * @author k.olszewski
 * 
 * A TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
 * It contains only unique elements.
 * It cannot have null key but can have multiple null values.
 * It is same as HashMap instead maintains ascending order.
 *
 */

public class TreeMapDemo {

	public static void main(String[] args) {

		TreeMap<Integer, String> treeMap = new TreeMap<>();
		
		treeMap.put(100, "100");
		treeMap.put(101, "101");
		treeMap.put(102, "102");
		
		for(Map.Entry entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
