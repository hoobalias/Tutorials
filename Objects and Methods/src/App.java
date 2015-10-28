
class Person {
	String name;
	int age;
	
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person() {
		
	}

	void speak() {
		System.out.println("My name is " + name + " and I am " + age + " years old!");
	}
	
	void sayHello() {
		System.out.println("Hello there");
	}
	
	void calculateYearsToRetirement() {
		int yearsLeft = 65 - age;
		
		System.out.println("Years left: " + yearsLeft);
	}
	
}

public class App {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "John";
		person1.age = 20;
		
		Person person2 = new Person();
		person2.name = "Amy";
		person2.age = 30;
		
		person1.speak();
		person1.sayHello();
		person2.speak();
		person2.sayHello();
		
		person1.calculateYearsToRetirement();
		person2.calculateYearsToRetirement();
		
		Person person3 = new Person("Ron", 40);
		person3.speak();

	}

}
