package demo2;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class WriteObjects {

	public static void main(String[] args) {
		System.out.println("Writing objects...");
		
		Person[] people = {new Person(1,"Mike"), new Person(2,"Sue")};
		
		System.out.println(people[0]);
		System.out.println(people[1]);
		
		try (FileOutputStream fs = new FileOutputStream("people2.txt")) {
			
			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			os.writeObject(people);
			
			os.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
