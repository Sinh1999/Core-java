package practicals;
/**
 * Practical-7 The example of default constructor and Parameterized constructor.
 *
 * @author Shailesh Sinh
 * 
 * @since 28-02-2023
 *
 * @version 1.0.1
 */
public class MultiplictionWithConstructor {

	// Default constructor
	public MultiplictionWithConstructor() {
		System.out.println("This is Default Constuctor");
	}

	// Parameterized constructor
	public MultiplictionWithConstructor(int multipilicationNumber, int multipilicationNumber2) {
		int number1 = multipilicationNumber;
		int number2 = multipilicationNumber2;

		System.out.println("Multipliction  " + number1 * number2);
	}

	public static void main(String[] args) {
		// Create new keyword using object to calling constructor
		MultiplictionWithConstructor defaultConstructor = new MultiplictionWithConstructor();

		MultiplictionWithConstructor parameterizedConstructor = new MultiplictionWithConstructor(2, 3);
	}

}
