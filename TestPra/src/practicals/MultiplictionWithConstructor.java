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

	public int number1;

	public int number2;

	// Default constructor
	public MultiplictionWithConstructor() {
		System.out.println("This is Default Constuctor");
	}

	// Parameterized constructor
	public MultiplictionWithConstructor(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;

		System.out.println("Multipliction  " + number1 * number2);
	}

	public static void main(String[] args) {
		// Create new keyword using object to calling constructor
		MultiplictionWithConstructor defaultConstructor = new MultiplictionWithConstructor();

		MultiplictionWithConstructor parameterizedConstructor = new MultiplictionWithConstructor(2, 3);
	}

}
