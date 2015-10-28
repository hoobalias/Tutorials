class Thing {
	public final static int LUCKY_NUMBER = 69;
	
	public String name;
	public static String description;
	public static int count = 0;
	public int id;
	
	
	public Thing() {
		id = count;
		count++;
	}
	
	public void showName() {
		System.out.println(id +":" + name);
	}
	
	public static void showInfo() {
		System.out.println("Hello");
		System.out.println(description);
	}
}

public class App {

	public static void main(String[] args) {
		
		Thing.description = "I am a thing.";
		
		System.out.println("Count: "+ Thing.count);
		
		Thing thing1 = new Thing();
		System.out.println("Count: "+ Thing.count);
		
		Thing thing2 = new Thing();
		System.out.println("Count: "+ Thing.count);
		
		thing1.name = "Bob";
		thing2.name = "Sue";
		
		Thing.showInfo();
		
		thing1.showName();
		thing2.showName();
		
		System.out.println(Math.PI);
		
		System.out.println(Thing.LUCKY_NUMBER);
	}

}
