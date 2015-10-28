package demo2;

public class AppImpIterators {

	public static void main(String[] args) {
		
		UrlLibrary lib = new UrlLibrary();
		
		for (String url: lib) {
			System.out.println(url);
		}

	}

}
