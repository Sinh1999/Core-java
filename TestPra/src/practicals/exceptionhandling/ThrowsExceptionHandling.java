package practicals.exceptionhandling;
/**
 * Practical-18 a program to handle exceptions using try, catch, finally, throw, and throws keywords.
 * 
 * @author Shailesh Sinh
 * 
 * @since 01-03-2023
 *
 * @version 1.0.1
 */
public class ThrowsExceptionHandling {
	
	/**
	 * This method in using for Division
	 * 
	 * @param Integer number divison.
	 * @param Integer number divider.
	 * 
	 * @exception ArithmeticExceptionr
	 * 
	 * @author Shailesh Sinh
	 * 
	 * @since 01-03-2023
	 *
	 */
	public void divide(int num , int num2)throws ArithmeticException {
		int d = num/num2 ;
	}
	
	public static void main(String[] args) {
		ThrowsExceptionHandling throwsExceptionHandling = new ThrowsExceptionHandling();
		throwsExceptionHandling.divide(15, 0);
	}
	
}
