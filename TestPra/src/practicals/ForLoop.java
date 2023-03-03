package practicals;
/**
 * Practical-5 The example of the 'for' loop and print  pattern.
 * 
 * @author Shailesh Sinh
 * 
 * @since 28-02-2023
 *
 * @version 1.0.1
 */
public class ForLoop{

	public static void main(String[] args) {
		//Column in print "*" for using 'for' loop
		for (int i = 0; i <=5; i++) {
			//Row in print "*" for using 'for' loop
			for (int j = 0; j < i; j++) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
	}
	
}
