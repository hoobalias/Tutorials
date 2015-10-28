import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class AppSortedMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
		
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		
		System.out.println("Hash Map:"); //Random, but seems to sort usually
		testMap(hashMap);
		
		System.out.println("Linked Hash Map:"); //Preserves input order
		testMap(linkedHashMap);
		
		System.out.println("Tree Map:"); //Sorts them
		testMap(treeMap);
	}

	public static void testMap(Map<Integer, String> map) {
		
		map.put(9, "nine");
		map.put(1, "one");
		map.put(3, "three");
		map.put(10, "ten");
		map.put(5, "five");
		
		for(Integer key: map.keySet()) {
			String value = map.get(key);
			
			System.out.println(key + ": " + value);
		}
		
	}
}
