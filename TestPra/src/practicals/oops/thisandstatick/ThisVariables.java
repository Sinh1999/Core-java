package practicals.oops.practical11;

public class Practical11 {

	int num = 5;
	
	/*
	 * This keyword use to reference variable that refers to the current object.
	 */
	
	public void number(int number) {
		
		this.num = number;
		System.out.println("This keyword : "+ this.num);
	}
	
	public static void main(String[] args) {
		
		new Practical11().number(20);
	}
}
