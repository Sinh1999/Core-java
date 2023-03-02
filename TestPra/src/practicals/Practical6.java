package practicals;

public class Practical6 {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 15; i++) {
			
			if(i == 7) 
			{
				
				/*
				 * Continue Statement
				 */
				
				continue;
			}
			else if(i > 12)
			{
				/*
				 * Break Statement
				 */
				
				break;
			}
			
			System.out.println(i);
		}
	}
}
