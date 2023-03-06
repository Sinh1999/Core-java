package practicals.collection;
/**
 * Practical-22 A program to prepare the list in remove duplicate values of the list.
 * 
 * @author Shailesh Sinh
 * 
 * @since 01-03-2023
 *
 * @version 1.0.1
 */
import java.util.ArrayList;
import java.util.List;

public class ListRemoveDuplicateData {

	public static void main(String[] args) {
		// Add list in duplicate data
		List<String> list = new ArrayList<>();

		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("A");
		list.add("C");
		list.add("E");

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) { // Check in list duplicate data available or note .
					list.remove(i);
				}
			}
		}
		// New List data get and print all data
		for (int i = 0; i < list.size(); i++) {
			System.out.println("New List : " + list.get(i));
		}
	}

}
