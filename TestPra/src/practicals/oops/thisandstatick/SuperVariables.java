package practicals.oops.thisandstatick;

/**
 * Practical-11 A practical to use super variable.
 * 
 * @author Shailesh Sinh
 * 
 * @since 01-03-2023
 *
 *@version 11.0.2
 */

public class SuperVariables extends ThisVariables{
	
	 // Super Keyword use only parent class variable define
	void number () {
		System.out.println("This is super keyword :" + super.num);
	}
	
	public static void main(String[] args) {
		
		new SuperVariables().number();;
	}
}
