import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String arg0, String arg1) {
		if (arg0.length() > arg1.length()) {
			return 1;
		}
		else if (arg0.length() < arg1.length()){
			return -1;
		}
		return 0;
	}
	
}

class AlphabeticComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		
		return o1.compareTo(o2);
	}
	
}

public class AppSortedLists {

	public static void main(String[] args) {
		
		List<String> animals = new ArrayList<>();
		
		animals.add("zebra");
		animals.add("cat");
		animals.add("dog");
		animals.add("mouse");
		animals.add("lion");
		animals.add("alligator");
		
		Collections.sort(animals); //Default: Alphabetic
		
		for(String animal: animals) {
			System.out.println(animal);
		}
		System.out.println("");
		
		Collections.sort(animals, new StringLengthComparator());
		
		for(String animal: animals) {
			System.out.println(animal);
		}
		System.out.println("");
		
		Collections.sort(animals, new AlphabeticComparator());
		
		for(String animal: animals) {
			System.out.println(animal);
		}
		System.out.println("");
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(3);
		numbers.add(36);
		numbers.add(73);
		numbers.add(40);
		numbers.add(1);
		
		Collections.sort(numbers);
		
		for(Integer number: numbers) {
			System.out.println(number);
		}
		
		

	}

}