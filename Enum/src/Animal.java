
public enum Animal {
	CAT("Felix"), DOG("Rex"), RABBIT("Bugs");
	
	private String name;
	
	Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
