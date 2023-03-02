package practicals.oops.encapsulation;

public class EmployeeDetails {

	/*
	 * Private Access modifier using only class 
	 */
	
	private String name;
	
	private int number;

	/*
	 * Get method use to private variable getting
	 */
	
	public String getName() {
		return name;
	}
	
	/*
	 * Set method use to private variable set the data
	 */

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
