package practicals.oops.Inheritance;

public class Practical15 {

	public static void main(String[] args) {
		
		/*
		 * Single And Multi Level Inheritance call constructor 
		 */
		
		ClassC c = new  ClassC();
		
		c.classA();
		c.classC();
		
		/*
		 * Hierarchical Inheritance call by constructor
		 */
		
		ClassD d = new ClassD();
		
		d.classA();
		d.classB();
		d.classD();
	}
}
