package practicals.collection;

import java.util.ArrayList;
import java.util.List;

public class Practical22 {

	public static void main(String[] args) {
		
		List<String> list =  new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("A");
		list.add("C");
		list.add("E");
		
		for (int i = 0; i <list.size(); i++) {
			
			for (int j = i+1; j < list.size(); j++) {
				
				if (list.get(i).equals(list.get(j))) {
					
					 list.remove(i);
				}
			}
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println("New List : " + list.get(i));
		}
		
		
		
	}
}
