package practicals.exceptionhandling;

public class Practical18 {
	
	static void ageCount(int age) {
		if(age < 18) 
		{
			throw new IllegalArgumentException("Your age is not eligiable");
		}
		else
		{
			System.out.println("Your are eligiable");
		}
	}

	public static void main(String[] args) {
		
		int num = 50 ;
		
		try {
			num = num/0;
		}
		catch (Exception e)
		{
			
			System.out.println(e);
			
			System.out.println("Check Your code");
		}
		finally 
		{
			System.out.println("Final block is always excicute ");
		}
		
		ageCount(13);
		
	}
}
