package practicals.collection;

/**
 * Practical-23 A program to demonstrate comparable and comparator interface.
 * 
 *<p>CarName class use to compare interface by sorting by name</p> 
 * 
 * @author Shailesh Sinh
 * 
 * @since 01-03-2023
 *
 */

import java.util.Comparator;

public class CarNameCompare implements Comparator<CarsDetails> {

	//implement to compare to method in Comparator because multiple object provide and compare 
	@Override
	public int compare(CarsDetails car1, CarsDetails car2) {
	
		return car1.carName.compareTo(car2.carName);
	}

}
