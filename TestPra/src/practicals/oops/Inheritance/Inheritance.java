package practicals.oops.Inheritance;
/**
 * Practical-15 A program to demonstrate all types of Inheritance concepts like
 * 
 * 1.Single Inheritance
 * 2.Multi-level Inheritance
 * 3.Hierarchical Inheritance
 * 4.Hybrid Inheritance
 * 
 * @author Shailesh Sinh
 * 
 * @since 01-03-2023
 *
 * @version 1.0.1
 */
public class Inheritance {

	public static void main(String[] args) {
		 // Single And Multi Level Inheritance call constructor 
		Son son = new Son();
	
		son.grandParent();
		son.parents();
		son.son();
		 // Hierarchical Inheritance call by constructor
		Daughter daughter = new Daughter();
	
		daughter.grandParent();
		daughter.parents();
		daughter.daughter();
	}
	
}
