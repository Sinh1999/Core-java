package practicals.collection;

import java.util.Comparator;

/**
 * Practical-23 A program to demonstrate comparable and comparator interface.
 * 
 * <p>
 * CarName class use to compare interface by sorting by name
 * </p>
 * 
 * @author Shailesh Sinh
 * 
 * @since 01-03-2023
 *
 * @version 1.0.1
 */
public class CarNameCompare implements Comparator<CarsDetails> {

	@Override
	public int compare(CarsDetails car1, CarsDetails car2) {
		return car1.carName.compareTo(car2.carName);
	}

}
