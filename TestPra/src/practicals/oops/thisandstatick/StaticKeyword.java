package practicals.oops.practical11;

public class Practical12 {

	/*
	 * Static Block run before main method
	 */
	
	static {
		System.out.println("Wel-Come");
	}
	
	String name ;
	
	/*
	 * Static variable 
	 */
	
	static String companyName= "Qdev";
	
	/*
	 * Static method 
	 */
	
	static void greeting() {
		System.out.println("Hello, Good Moring");
	}
	
	void details(String name1) {
		this.name = name1;
		System.out.println("Name : " + name + "  " +companyName);
	}
	
	public static void main(String[] args) {
		
		/*
		 * Static method or variable without create new object use
		 */
		
		greeting();
		Practical12 practical12 = new Practical12();
		practical12.details("shailesh");
	}
}
