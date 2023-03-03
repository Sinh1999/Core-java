package practicals.collection;

/**
 * Practical-23 A program to demonstrate comparable and comparator interface.
 * 
 *<p>CarDetails class use comparable interface by sorting by price</p> 
 * 
 * @author Shailesh Sinh
 * 
 * @since 01-03-2023
 *
 */

public class CarsDetails implements Comparable<CarsDetails> {

	String carName;
	
	String carModel;
	
	Integer carPrice;

	//Comparable method in single object sort.
	//Comparable method  implement by carPrices 
	@Override
	public int compareTo(CarsDetails price) {
		
		return carPrice - price.carPrice;
	}

	@Override
	public String toString() {
		return "CarsDetails [carName=" + carName + ", carModel=" + carModel + ", carPrice=" + carPrice + "]";
	}

	public CarsDetails(String carName, String carModel, Integer carPrice) {
		this.carName = carName;
		this.carModel = carModel;
		this.carPrice = carPrice;

	}
	
	

}
