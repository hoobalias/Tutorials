
public class App {

	public static void main(String[] args) {
		
		Animal animal = Animal.DOG;
		
		switch(animal) {
		case CAT:
			System.out.println("cat");
			break;
		case DOG:
			System.out.println("dog");
			break;
		case RABBIT:
			System.out.println("rabbit");
			break;
		default:
			break;
		
		}
		
		System.out.println(Animal.RABBIT.getName());

		System.out.println(Animal.RABBIT.name());

	}

}
