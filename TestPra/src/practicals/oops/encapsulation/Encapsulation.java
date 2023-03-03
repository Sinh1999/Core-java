package practicals.oops.encapsulation;

public class Practical14 {

	public static void main(String[] args) {
		
		EmployeeDetails employeeDetails = new EmployeeDetails();
		
		/*
		 * Set the date for employee details 
		 */
		
		employeeDetails.setName("Shailesh");
		employeeDetails.setNumber(789456132);
		
		System.out.println("Employee Name : " + employeeDetails.getName());
		
		System.out.println("Employee Number : " + employeeDetails.getNumber());
	}
}
