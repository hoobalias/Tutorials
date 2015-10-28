package demo2;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ReadObjects {

		public static void main(String[] args) {
			System.out.println("Reading objects...");
			
			try (FileInputStream fi = new FileInputStream("people2.txt")) {
				
				ObjectInputStream os = new ObjectInputStream(fi);
				
				Person[] people = (Person[]) os.readObject();
				
				for (Person person: people) {
					System.out.println(person);
				}
				
				os.close();
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
}
