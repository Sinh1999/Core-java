package practicals.collection;

/**
 * Practical-20 A program to add string values in the list and print all the values using an iterator.
 * 
 * @author Shailesh Sinh
 * 
 * @since 01-03-2023
 *
 * @version 1.0.1
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		 // List in add some animal name 
		List<String> list =  new ArrayList<>();
		
		list.add("Dog");
		list.add("Cat");
		list.add("Cow");
		list.add("Lion");
		
		 //Iterator using getting data
		Iterator iterator = list.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
	}
	
}
