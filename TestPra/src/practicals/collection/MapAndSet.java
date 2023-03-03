package practicals.collection;

/**
 * Practical-21 A program using Map and Set concepts.
 * 
 * @author Shailesh Sinh
 * 
 * @since 01-03-2023
 *
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapAndSet {

	public static void main(String[] args) {
		
		// Use map in key value pair 
		Map<Integer, String> map =  new HashMap<>();
		
		map.put(1,"Sailesh");
		map.put(2,"Jay");
		map.put(3,"Javin");
		map.put(4,"Kevin");
		
		//Map in get values for use keys
		for (int i = 0; i <= map.size(); i++) {

			System.out.println(map.get(i));
		}
		
		// Set in data is no duplication.
		Set<String> set = new HashSet<>();
		
		set.add("India");
		set.add("bhutan");
		set.add("ShriLanka");
		set.add("America");
		set.add("bhutan");
		
		System.out.println(set);
		
 	}
	
}
