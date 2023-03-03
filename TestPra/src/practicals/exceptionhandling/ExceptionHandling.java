package practicals.exceptionhandling;

/**
 * Practical-18 a program to handle exceptions using try, catch, finally, throw, and throws keywords.
 * 
 * @author Shailesh Sinh
 * 
 * @since 01-03-2023
 *
 *@version 18.0.1
 */

public class ExceptionHandling {
	
	// Method create and return to throw exception
	static void ageCount(int age) {
		if(age < 18) 
		{
			throw new IllegalArgumentException("Your age is not eligiable");
		}
		else
		{
			System.out.println("Your are eligiable");
		}
	}

	public static void main(String[] args) {
		
		int num = 50 ;
	
		// Try Block in excuted code writing
		try {
			num = num/0;
		} catch (Exception e){// Catch block in exception show
			
			System.out.println(e);
			System.out.println("Check Your code");
		}
		//Final block is always execute 
		finally {
			System.out.println("Final block is always excicute");
		}
		
		ageCount(13);
	}
	
}
