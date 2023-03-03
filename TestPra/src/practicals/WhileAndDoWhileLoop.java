package practicals;

/**
 * Practical-4 The use of while loop and do while loop.  
 * 
 * @author Shailesh Sinh
 * 
 * @since 28-02-2023
 *
 */

public class WhileAndDoWhileLoop {

	public static void main(String[] args) {
		
		int num = 0 ;
		
		// While Loop
		while (num <= 10) {
			System.out.println("Numbers for while loop : "+ num);
			num++;
		}
		
		int num2 = 0;
		
		//Do While Loop
		do {
			System.out.println("Number for doWhile loop : "+ num2);
			num2 ++;
		} while (num2 <= 10);
		
	}
	
}
