import java.util.ArrayList;
import java.util.HashMap;


public class App {

	public static void main(String[] args) {

		//////Before Java 5/////////////
		ArrayList list = new ArrayList();

		list.add("apple");
		list.add("banana");
		list.add("orange");
		
		String fruit = (String)list.get(1);
		System.out.println(fruit);
		
		/////Modern////
		ArrayList<String> strings = new ArrayList<String>();
		
		strings.add("cat");
		strings.add("dog");
		strings.add("dragon");
		
		String animal = strings.get(1);
		System.out.println(animal);
		
		
		///////Multiple type parameters/////
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		////Java 7////
		ArrayList<Integer> someList = new ArrayList<>();
		someList.add(1);
		someList.add(2);
		someList.add(3);
		//someList.add(3.14);
		
		int result = someList.get(1);
		System.out.println(result);
		
	}
}
