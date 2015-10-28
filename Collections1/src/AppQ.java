import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;


public class AppQ {

	public static void main(String[] args) {
		
		// (head) <- ooooooooooooo <- (tail) FIFO
		
		Queue<Integer> queue = new ArrayBlockingQueue<>(3); //Fixed size
		
		queue.add(1);
		queue.add(2);
		queue.add(3);
		//queue.add(4);
		
		for(Integer element: queue) {
			System.out.println(element);
			System.out.println(queue.remove());
		}
		
		System.out.println("Anything?");
		for(Integer element: queue) {
			System.out.println("Anything?");
			System.out.println(element);
		}

	}

}
