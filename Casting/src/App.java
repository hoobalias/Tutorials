class Machine {
	
	public void start() {
		System.out.println("Machine started");
	}
}

class Camera extends Machine {
	
	public void start() {
		System.out.println("Camera started");
	}
	
	public void snap() {
		System.out.println("Snapped a picture");
	}
}
public class App {

	public static void main(String[] args) {
		
		Machine mach1 = new Machine();
		Camera cam1 = new Camera();
		
		mach1.start();
		
		cam1.start();
		cam1.snap();
		
		//Upcasting
		System.out.println("\nUpcasting:");
		Machine mach2 = cam1;
		mach2.start();
		
		//Downcasting (CAN'T DOWNCAST OBJECT, ONLY REFERENCE VARIABLE)
		System.out.println("\nDowncasting:");
		Camera cam2 = (Camera) mach2;
		cam2.start();
		cam2.snap();
		
		//Doesn't work
		//Camera cam2 = (Camera) mach1;
		//cam2.start();
		//cam2.snap();
		

	}

}
