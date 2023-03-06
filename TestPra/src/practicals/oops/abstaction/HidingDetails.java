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
public abstract class HidingDetails {

	// Non-Abstract method
	void run() {
		System.out.println("Calling non- abtsract method");
	}

	// Abstract method
	abstract void call();

}
