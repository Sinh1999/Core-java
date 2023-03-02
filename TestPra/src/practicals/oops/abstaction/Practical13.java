package practicals.oops.abstaction;

public class Practical13 extends HidingDetails {

	/*
	 * Abstract method implemented
	 */
	
	@Override
	void call() {
		System.out.println("Callin abstract method");
	}
	public static void main(String[] args) {		
	
		Practical13 prac13 = new Practical13();
		
		prac13.call();
		prac13.run();
	}
}
