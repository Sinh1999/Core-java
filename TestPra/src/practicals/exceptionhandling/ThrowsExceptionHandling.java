package practicals.exceptionhandling;

/**
 * Practical-18 a program to handle exceptions using try, catch, finally, throw, and throws keywords.
 * 
 * @author Shailesh Sinh
 * 
 * @since 01-03-2023
 *
 *@version 18.0.2
 */


public class ThrowsExceptionHandling {

	// Throws keyword use in method
	static void divide(int num , int num2)throws ArithmeticException {
		int d = num/num2 ;
	}
	
	public static void main(String[] args) {
		
		divide(15, 0);
	}
	
}
