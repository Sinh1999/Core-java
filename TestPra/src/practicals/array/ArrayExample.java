package practicals.array;
/**
 * Practical-9 A a program to find the index of an array element.
 * 
 * @author Shailesh Sinh
 * 
 * @since 01-03-2023
 *
 * @version 1.0.1
 */
public class ArrayExample {

	// This method is create for findArray element index
	public void findIndexArray(int array[], int element) {
		// Check array in element available or not
		if (array.length < 0) {
			System.out.println("Array Not valid");
		} else {
			for (int i = 0; i < array.length; i++) {

				// Compare to element number and array element if exist or not
				if (array[i] == element) {
					System.out.println("Your array element " + array[i] + " index number is : " + i);
				}
			}
		}
	}

	public static void main(String[] args) {
		int array[] = { 5, 7, 8, 9, 4, 2 };

		ArrayExample arrayExample = new ArrayExample();
		arrayExample.findIndexArray(array, 9);
	}

}
