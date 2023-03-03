package practicals.oops.thisandstatick;

/**
 * Practical-12 A program to demonstrate static methods, variables, and blocks.
 * 
 * @author Shailesh Sinh
 * 
 * @since 01-03-2023
 *
 */

public class StaticKeyword {

	// Static Block run before main method
	static {
		System.out.println("Wel-Come");
	}
	
	String name ;
	
	 // Static variable 
	static String companyName= "Qdev";
	
	 // Static method 
	static void greeting() {
		System.out.println("Hello, Good Moring");
	}
	
	void details(String name1) {
		this.name = name1;
		System.out.println("Name : " + name + "  " +companyName);
	}
	
	public static void main(String[] args) {
		
		 // Static method or variable without create new object use
		greeting();
		StaticKeyword staticKeyword = new StaticKeyword();
		staticKeyword.details("shailesh");
	}
	
}
