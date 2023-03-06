package practicals.exceptionhandling;
/**
 * Practical-18 a program to handle exceptions using try, catch, finally, throw,
 * and throws keywords.
 * 
 * @author Shailesh Sinh
 * 
 * @since 01-03-2023
 *
 * @version 1.0.1
 */
public class ThrowsExceptionHandling {

	// This method in using for Division
	public void divide(int number, int number2) throws ArithmeticException {
		System.out.println("Division : " + number / number2);
	}

	public static void main(String[] args) {
		ThrowsExceptionHandling throwsExceptionHandling = new ThrowsExceptionHandling();
		throwsExceptionHandling.divide(15, 3);
	}

}
