package practicals.oops.abstaction;
/**
 * Practical-13 A program to demonstrate data abstraction.
 * 
 * @author Shailesh Sinh
 * 
 * @since 01-03-2023
 *
 * @version 1.0.1
 */
public class BikeWorks extends Bike {

	@Override
	void HornBlowing() {
		System.out.println("Bike Horn Blowing");

	}

	public static void main(String[] args) {
		BikeWorks bikeWorks = new BikeWorks();
		bikeWorks.EngineStart();
		bikeWorks.HornBlowing();
	}

}
