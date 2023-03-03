package practicals.array;

public class Practical19 {

	/*
	 * Find the index of an array element method.

	 */
	
	static void findIndexArray(int arr[], int element) {
		
		/*
		 * Check array in element available or not
		 */
		
		if (arr.length < 0) 
		{
			System.out.println("Array Not valid");
		}
		else
		{
			for (int i = 0; i < arr.length; i++) 
			{
				/*
				 * Compare to elemnet number and array elment if exixt or not 
				 */
				
				if(arr[i] == element) 
				{
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
