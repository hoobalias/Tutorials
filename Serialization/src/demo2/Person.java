package demo2;
import java.io.Serializable;


public class Person implements Serializable {
	
	//private transient int id; TRANSIENT AND STATIC FIELDS NOT SERIALIZED
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person " + id + " is " + name;
	}
}
