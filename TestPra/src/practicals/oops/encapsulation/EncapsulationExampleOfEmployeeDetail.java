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
public class EncapsulationExampleOfEmployeeDetail {

	public static void main(String[] args) {
		EmployeeDetails employeeDetails = new EmployeeDetails();
		// Set the date for employee details
		employeeDetails.setName("Shailesh");
		employeeDetails.setNumber(789456132);

		System.out.println("Employee Name : " + employeeDetails.getName());
		System.out.println("Employee Number : " + employeeDetails.getNumber());
	}

}
