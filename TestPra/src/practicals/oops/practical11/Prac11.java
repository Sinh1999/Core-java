package practicals.oops.practical11;

public class Prac11 extends Practical11{
	
	/*
	 * Super Keyword use only parent class variable define
	 */

	void number () {
		System.out.println("This is super keyword :" + super.num);
	}
	
	public static void main(String[] args) {
		
		new Prac11().number();;
	}
}
