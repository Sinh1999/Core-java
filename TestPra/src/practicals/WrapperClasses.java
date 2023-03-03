package practicals;
/**
 * Practical-9 A  practical to compare two variables of Wrapper class using Wrapper classes.
 * 
 * @author Shailesh Sinh
 * 
 * @since 01-03-2023
 *
 * @version 1.0.1
 */

public class WrapperClasses {

	public static void main(String[] args) {
		// Integer using Wrapper class 
		Integer num = 102;
		Integer num2 = 103;
		
		if (num == num2) {
			System.out.println("Same Objects");
		} else {
			System.out.println("Not same objects");
		}
	}
	
}
