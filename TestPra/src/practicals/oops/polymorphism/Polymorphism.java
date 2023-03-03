package practicals.oops.polymorphism;
/**
 * Practical-16 a program to demonstrate two types of polymorphism like compile-time and runtime polymorphism.

 * 
 * @author Shailesh Sinh
 * 
 * @since 01-03-2023
 *
 * @version 1.0.1
 */
public class Polymorphism extends RunTimePolymorphism{

	 // Create Compiletime polymorphism method
	public void compileMethod() {
		System.out.println("Compile Polymorphisam method");
	}
	 // Compiletime method in same name but arguments and return type difference
	public void compileMethod(String message) {
		System.out.println("Compile Polymorphisam method but argument different " + message );
	}
	
	 // Runtime polymorphisam method is @Override 
	public void method() {
		System.out.println("RunTime Polymorphisam Method override");
	}
	
	public static void main(String[] args) {
		Polymorphism polymorphism = new Polymorphism() ;
		
		polymorphism.compileMethod();
		polymorphism.compileMethod("Hello");
		polymorphism.method();
	}
	
}
