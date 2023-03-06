package practicals.oops.thisandstatick;
/**
 * Practical-12 A program to demonstrate static methods, variables, and blocks.
 * 
 * @author Shailesh Sinh
 * 
 * @since 01-03-2023
 *
 * @version 1.0.1
 */
public class StudentDetailsWithStatic {

	// Static Block run before main method
	static {
		System.out.println("Wel-Come");
	}
	String name;

	// Static variable
	public static String collegaeName = "Qdev";

	// This method is static print statement.
	public static void greeting() {
		System.out.println("Hello, Good Moring");
	}

	// This method is Only print statement.
	public void details(String name1) {
		this.name = name1;
		System.out.println("Name : " + name + "  " + collegaeName);
	}

	public static void main(String[] args) {
		// Static method or variable without create new object use
		greeting();
		StudentDetailsWithStatic studentDetailsWithStatic = new StudentDetailsWithStatic();
		studentDetailsWithStatic.details("shailesh");
	}

}
