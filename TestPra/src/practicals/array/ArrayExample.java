package practicals.array;

/**
 * Practical-9 A  a program to find the index of an array element.
 * 
 * @author Shailesh Sinh
 * 
 * @since 01-03-2023
 *
 */

public class ArrayExample {

	 // The method is find out the given number is array element index  
	static void findIndexArray(int arr[], int element) {
		
		// Check array in element available or not
		if (arr.length < 0) {
			
			System.out.println("Array Not valid");
		} else {
			
			  for (int i = 0; i < arr.length; i++) {
					
				 // Compare to elemnet number and array elment if exixt or not 
					if(arr[i] == element) {
					System.out.println("Your array element " + arr[i] + " index number is : " + i);
					}
				}
		}
	}
	
	public static void main(String[] args) {
		
		int array[] = {5,7,8,9,4,2};
		
		findIndexArray(array, 9);
	}
	
}
