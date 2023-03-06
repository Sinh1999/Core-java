package practicals.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Practical-22 A program to prepare the list in remove duplicate values of the
 * list.
 * 
 * @author Shailesh Sinh
 * 
 * @since 01-03-2023
 *
 * @version 1.0.1
 */
public class ListRemoveDuplicateAlphabet {

	public static void main(String[] args) {
		// Add list in duplicate data
		List<String> listOfAlphabet = new ArrayList<>();

		listOfAlphabet.add("A");
		listOfAlphabet.add("B");
		listOfAlphabet.add("C");
		listOfAlphabet.add("D");
		listOfAlphabet.add("E");
		listOfAlphabet.add("A");
		listOfAlphabet.add("C");
		listOfAlphabet.add("E");

		for (int i = 0; i < listOfAlphabet.size(); i++) {
			for (int j = i + 1; j < listOfAlphabet.size(); j++) {
				if (listOfAlphabet.get(i).equals(listOfAlphabet.get(j))) { // Check in list duplicate data available or note .
					listOfAlphabet.remove(i);
				}
			}
		}

		// New List data get and print all data
		for (int i = 0; i < listOfAlphabet.size(); i++) {
			System.out.println("New List : " + listOfAlphabet.get(i));
		}
	}

}
