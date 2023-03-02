package practicals.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practical21 {

	public static void main(String[] args) {
		
		Map<Integer, String> map =  new HashMap<>();
		
		map.put(1,"Sailesh");
		map.put(2,"Jay");
		map.put(3,"Javin");
		map.put(4,"Kevin");
		
		System.out.println(map.get(2));
		
		for (int i = 0; i <= map.size(); i++)
		{
			
			System.out.println(map.get(i));
			
		}
		
		Set<String> set = new HashSet<>();
		
		set.add("India");
		set.add("bhutan");
		set.add("ShriLanka");
		set.add("America");
		set.add("bhutan");
		
		System.out.println(set);
		
 	}
}
