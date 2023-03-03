package practicals;

public class Practical7 {

	int num1 ;
	
	int num2 ;
	
	//Default constructor 
	public Practical7() {

		System.out.println("This is Default Constuctor");
	}
	
	//Parameter constructor 
	public Practical7(int number1, int number2) {
		
		num1 = number1;
		num2 = number2;
		
		System.out.println("Multipliction  " + num1 * num2);
	}
	
	public static void main(String[] args) {
		
		/*
		 * Create new keyword using object to calling constructor 
		 */
		
		Practical7 defaul = new Practical7(); 
		
		Practical7 perameter = new Practical7(2, 3);
		
	}

	
	
}
