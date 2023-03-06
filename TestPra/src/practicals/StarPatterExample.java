package practicals;
/**
 * Practical-5 The example of the 'for' loop and print pattern.
 * 
 * @author Shailesh Sinh
 * 
 * @since 28-02-2023
 *
 * @version 1.0.1
 */
public class StarPatterExample {

	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {// Column in print "*" for using 'for' loop
			for (int j = 0; j < i; j++) {// Row in print "*" for using 'for' loop
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
	}

}
