package practicals;

/**
 * Practical-7 The example of default constructor and Parameterized constructor. 
 * 
 * @author Shailesh Sinh
 * 
 * @since 28-02-2023
 *
 */

public class Constructors {

	int num1 ;
	
	int num2 ;
	
	//Default constructor 
	public Constructors() {

		System.out.println("This is Default Constuctor");
	}
	
	//Parameterized constructor 
	public Constructors(int number1, int number2) {
		
		num1 = number1;
		num2 = number2;
		
		System.out.println("Multipliction  " + num1 * num2);
	}
	
	public static void main(String[] args) {
		
		/*
		 * Create new keyword using object to calling constructor 
		 */
		
		Constructors defaultConstructor = new Constructors(); 
		
		Constructors parameterizedConstructor = new Constructors(2, 3);
		
	}
	
}

