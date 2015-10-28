import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class AppList {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		doTimings("ArrayList", arrayList);   //removing things at end
		doTimings("LinkedList", linkedList); //removing or adding from anywhere else
	}
	
	private static void doTimings(String type, List<Integer> list) {
		
		//Fill it up
		for(int i=0; i<1E5; i++) {
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		
		// Add Items at end of list (AL BETTER)
//		for (int i=0; i<1E5; i++) {
//			list.add(i);
//		}
//		
		//Add items at beginning of list (LL Better)
//		for (int i=0; i<1E5; i++) {
//			list.add(0, i);
//		}
		
		//Add items near end of list (AL BETTER)
		for (int i=0; i<1E5; i++) {
			list.add(list.size() - 100, i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken: " + (end-start) + " ms for " + type);
	}

}
