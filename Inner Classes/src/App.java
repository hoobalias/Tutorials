
public class App {

	public static void main(String[] args) {
		
		Robot rob1 = new Robot(7);
		rob1.start();
		
		Robot.Battery battery = new Robot.Battery();
		battery.charge();

	}

}
