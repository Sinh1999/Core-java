package practicals;

/**
 * Practical-6 The example of a break/Continue statement. 
 * 
 * @author Shailesh Sinh
 * 
 * @since 28-02-2023
 *
 */

public class BreakAndContinueStatement  {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 15; i++) {
			
			if(i == 7) {//The number is true there is skip and continue
				continue;
			} else if(i > 12){//The number is true there is stop or break the loop
				
				break;
			}
			
			System.out.println(i);
		}
	}
	
}
