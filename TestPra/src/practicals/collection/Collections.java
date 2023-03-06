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
		List<String> listOfAnimal = new ArrayList<>();

		listOfAnimal.add("Dog");
		listOfAnimal.add("Cat");
		listOfAnimal.add("Cow");
		listOfAnimal.add("Lion");

		// Iterator using getting data
		Iterator iterator = listOfAnimal.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
