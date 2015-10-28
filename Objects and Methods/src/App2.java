class Robot {
	public void speak() {
		System.out.println("Hello");
	}
	
	public void speak (String input) {
		System.out.println(input);
	}
	
	public int add(int first, int second) {
		return first + second;
	}
}


public class App2 {

	public static void main(String[] args) {
		
		Robot one = new Robot();
		
		one.speak();
		one.speak("Beep boop beep");
	
		System.out.println(one.add(1,2));
		
		Robot two = new Robot();
		
		System.out.println(one);
		System.out.println(two);

	}

}
