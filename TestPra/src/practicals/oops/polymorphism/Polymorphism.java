package practicals.oops.polymorphism;

/**
 * Practical-16 a program to demonstrate two types of polymorphism like compile-time and runtime polymorphism.

 * 
 * @author Shailesh Sinh
 * 
 * @since 01-03-2023
 *
 *@version 16.0.2
 */

public class Polymorphism extends RunTimePolymorphism{

	 // Create Compiletime polymorphism method
	void compileMethod() {
		System.out.println("Compile Polymorphisam method");
	}
	
	 //Compiletime method in same name but argumnets and return typr diference
	void compileMethod(String message) {
		
		System.out.println("Compile Polymorphisam method but argument different " + message );
	}
	
	 // Runtime polymorphisam method is @Override 
	void method() {
		System.out.println("RunTime Polymorphisam Method override");
	}
	
	public static void main(String[] args) {
		
		Polymorphism polymorphism= new Polymorphism() ;
		
		polymorphism.compileMethod();
		polymorphism.compileMethod("Hello");
		polymorphism.method();
	}
	
}
