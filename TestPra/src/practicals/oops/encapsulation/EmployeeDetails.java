package practicals.oops.encapsulation;
/**
 * Practical-14 Encapsulation example in employee details.
 * 
 * @author Shailesh Sinh
 * 
 * @since 01-03-2023
 *
 * @version 1.0.1
 */
public class EmployeeDetails {

	// Private Access modifier using only class
	private String name;

	private int number;

	// Get method use to private variable getting
	public String getName() {
		return name;
	}

	// Set method use to private variable set the data
	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
