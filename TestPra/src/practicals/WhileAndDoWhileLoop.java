package practicals;
/**
 * Practical-4 The use of while loop and do while loop.
 * 
 * @author Shailesh Sinh
 * 
 * @since 28-02-2023
 *
 * @version 1.0.1
 */
public class WhileAndDoWhileLoop {

	public static void main(String[] args) {
		int number = 0;
		// While loop
		while (number <= 10) {
			System.out.println("Numbers for while loop : " + number);
			number++;
		}
		int number2 = 0;
		// Do While loop
		do {
			System.out.println("Number for doWhile loop : " + number2);
			number2++;
		} while (number2 <= 10);
	}

}
