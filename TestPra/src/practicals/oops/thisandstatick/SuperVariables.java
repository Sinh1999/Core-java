package practicals.oops.thisandstatick;
/**
 * Practical-11 A practical to use super variable.
 * 
 * @author Shailesh Sinh
 * 
 * @since 01-03-2023
 *
 * @version 1.0.1
 */
public class SuperVariables extends ThisVariables {
	/**
	 *This method is use of super key. 
 	 * 
	 * @author Shailesh Sinh
	 * 
	 * @since 01-03-2023
	 *
	 */
	public void number () {
		System.out.println("This is super keyword :" + super.number);
	}
	
	public static void main(String[] args) {
		new SuperVariables().number();;
	}
	
}
