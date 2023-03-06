package practicals.collection;
/**
 * Practical-21 A program using Map and Set concepts.
 * 
 * @author Shailesh Sinh
 * 
 * @since 01-03-2023
 * 
 * @version 1.0.1
 *
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapAndSet {

	public static void main(String[] args) {
		// Use map in key value pair
		Map<Integer, String> countryAndCode = new HashMap<>();

		countryAndCode.put(91, "India");
		countryAndCode.put(92, "Pakistan");
		countryAndCode.put(94, "ShriLanka");
		countryAndCode.put(1, "USA");

		// Map in get values for use keys
		for (int i = 0; i <= countryAndCode.size(); i++) {
			System.out.println(countryAndCode.get(i));
		}

		// Set in data is no duplication.
		Set<String> setOfCountry = new HashSet<>();

		setOfCountry.add("India");
		setOfCountry.add("bhutan");
		setOfCountry.add("ShriLanka");
		setOfCountry.add("America");
		setOfCountry.add("bhutan");

		System.out.println(setOfCountry);
	}

}
