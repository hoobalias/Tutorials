import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class AppIterators {

	public static void main(String[] args) {
		
		List<String> animals = new LinkedList<>();
		
		animals.add("cat");
		animals.add("pheonix");
		animals.add("dog");
		animals.add("bull");
		
		Iterator <String> it = animals.iterator();
		
		while (it.hasNext()) {
			
			if (it.next().equals("cat")) {
				it.remove();
			}

			System.out.println(it.next());
		}
		
		System.out.println("");
		
		
		for(String animal: animals) {
			System.out.println(animal);
			
			//animals.remove(2); //Concurrent modificatione xception
		}

	}

}
