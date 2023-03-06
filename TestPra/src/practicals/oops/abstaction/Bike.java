package practicals.oops.abstaction;
/**
 * Practical-13 A program to demonstrate data .
 * 
 * @author Shailesh Sinh
 * 
 * @since 01-03-2023
 *
 * @version 1.0.1
 */
public abstract class Bike {

	// Non-Abstract method
	void EngineStart() {
		System.out.println("Engine Start....");
	}

	// Abstract method
	abstract void HornBlowing();

}
