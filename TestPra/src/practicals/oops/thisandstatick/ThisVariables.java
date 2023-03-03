package practicals.oops.thisandstatick;
/**
 * Practical-11 A practical to use this variable.
 * 
 * @author Shailesh Sinh
 * 
 * @since 01-03-2023
 *
 * @version 1.0.1
 */
public class ThisVariables {

	int number = 5;
	
	 // This keyword use to reference variable that refers to the current object.
	public void number(int number) {
		this.number = number;
		System.out.println("This keyword : " + this.number);
	}
	
	public static void main(String[] args) {
		new ThisVariables().number(20);
	}
	
}
