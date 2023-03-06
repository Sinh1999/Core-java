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
public class ExceptionHandling {

	// A method is the age check and show your is eligiable or not.
	public void ageCount(int age) {
		if (age < 18) {
			throw new IllegalArgumentException("Your age is not eligiable");
		} else {
			System.out.println("Your are eligiable");
		}
	}

	public static void main(String[] args) {
		int array[] = { 1, 5, 7, 8 };

		try { // Try Block in excuted code writing
			System.out.println(array[6]);
		} catch (Exception e) { // Catch block in exception show
			System.out.println(e);
			System.out.println("Check Your code");
		} finally { // Final block is always execute
			System.out.println("Final block is always excicute");
		}

		ExceptionHandling exceptionHandling = new ExceptionHandling();
		exceptionHandling.ageCount(13);
	}

}
