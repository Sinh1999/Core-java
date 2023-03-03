package practicals.oops.abstaction;

/**
 * Practical-13 Encapsulation example in employee details.
 * 
 * @author Shailesh Sinh
 * 
 * @since 01-03-2023
 *
 *@version 13.0.2
 */

public class AbstractionExtends extends HidingDetails {

	/*
	 * Abstract method implemented
	 */
	
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
