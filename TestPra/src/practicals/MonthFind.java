package practicals;
import java.util.Scanner;

/**
 * Practical-3 a program to find the current month name from the given number of the switch case. 
 * 
 * @author Shailesh Sinh
 * 
 * @since 28-02-2023
 *
 * @version 1.0.1
 */
public class MonthFind {

	public static void main(String[] args) {
		// Scanner class to use of user input
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();

		switch (month) {

			case 1:
				System.out.println("January");
				break;

			case 2:
				System.out.println("Febuary");
				break;

			case 3:
				System.out.println("March");
				break;

			case 4:
				System.out.println("April");
				break;

			case 5:
				System.out.println("May");
				break;

			case 6:
				System.out.println("June");
				break;

			case 7:
				System.out.println("July");
				break;

			case 8:
				System.out.println("August");
				break;

			case 9:
				System.out.println("September");
				break;

			case 10:
				System.out.println("Octber");
				break;

			case 11:
				System.out.println("November");
				break;

			case 12:
				System.out.println("Decmber");
				break;

			default:
				System.out.println("Your output is worng");
				break;
		}
	}

}
