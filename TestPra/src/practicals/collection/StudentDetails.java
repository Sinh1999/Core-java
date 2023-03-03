package practicals.collection;

/**
 * Practical-23 a program to demonstrate comparable and comparator interface.
 * 
 * <p>StudentDetails class use to comparable interface sort by rolenumber.
 * Comparable use to single sorting.
 * </p>
 * 
 * @author Shailesh Sinh
 * 
 * @since 01-03-2023
 *
 */

public class StudentDetails implements Comparable<StudentDetails>{

	String name;
	
	Integer roleNumber;
	
	 String schoolName;

	 //Comparable method in single object sort.
	@Override
	public int compareTo(StudentDetails studentDetails) {
		return roleNumber - studentDetails.roleNumber ;
	}
	
	public StudentDetails(String name, Integer roleNumber, String schoolName) {
		this.name = name;
		this.roleNumber = roleNumber;
		this.schoolName = schoolName;
	}

	// Use method for data string converted 
	@Override
	public String toString() {
		return "StudentDetails [name=" + name + ", roleNumber=" + roleNumber + ", schoolName=" + schoolName + "]";
	}

}
