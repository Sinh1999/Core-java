package practicals.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Practical20 {

	public static void main(String[] args) {
		
		/*
		 * List in adda some animal name 
		 */
		
		List<String> list =  new ArrayList<>();
		
		list.add("Dog");
		list.add("Cat");
		list.add("Cow");
		list.add("Lion");
		
		/*
		 * Iterator using geting data
		 */
		
		Iterator iterator = list.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
	}
}
