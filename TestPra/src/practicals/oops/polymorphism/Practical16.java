package practicals.oops.polymorphism;

public class Practical16 extends RunTimePolymorphisam{

	/* 
	 * Craete Compiletime polymorphisam method
	 */
	
	void compileMethod() {
		System.out.println("Compile Polymorphisam method");
	}
	
	/*
	 * Compiletime method in same name but argumnets and return typr diference
	 */
	
	void compileMethod(String message) {
		
		System.out.println("Compile Polymorphisam method but argument different " + message );
	}
	
	/*
	 * Runtime polymorphisam method is @Override 
	 */
	
	void method() {
		System.out.println("RunTime Polymorphisam Method override");
	}
	
	public static void main(String[] args) {
		
		Practical16 practical16 = new Practical16() ;
		
		practical16.compileMethod();
		practical16.compileMethod("Hello");
		practical16.method();
	}
}
