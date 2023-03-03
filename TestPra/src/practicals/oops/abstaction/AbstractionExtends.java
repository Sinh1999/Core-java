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
public class AbstractionExtends extends HidingDetails {

	@Override
	void call() {
		System.out.println("Callin abstract method");
	}
	public static void main(String[] args) {		
		AbstractionExtends abstractionExtends = new AbstractionExtends();
		abstractionExtends.call();
		abstractionExtends.run();
	}
	
}
