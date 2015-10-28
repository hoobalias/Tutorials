package demo2;

import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary implements Iterable<String>{
	
	private LinkedList<String> urls = new LinkedList<>();
	
	public UrlLibrary() {
	
		urls.add("www.google.com");
		urls.add("www.yahoo.com");
		urls.add("www.bing.com");
	}

	@Override
	public Iterator<String> iterator() {
		
		return urls.iterator();
	}
}
