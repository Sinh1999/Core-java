package practicals;
/**
 * Practical-8 A program to calculate EMI using Class, Object, Variables, Operators, and Datatypes.
 * 
 * @author Shailesh Sinh
 * 
 * @since 28-02-2023
 *
 * @version 1.0.1
 */
public class CalculateEmi {

	// Loan Rate or percentage
	float rate ; 
	
	 // Loan Amount 	
	float principalAmount;
	
	 // Loan time period in year  
	float time;
	
	public CalculateEmi(float amount, float percentage, float years) {
		this.rate = percentage;
		this.principalAmount = amount;
		this.time = years;
		 
		rate = rate/(12*100); 
		
		time = time*12;
		
		System.out.println("Your Per Month EMI Amount : " + (principalAmount * rate * Math.pow(1+rate, time) / (Math.pow(1+rate, time)-1)));
	}


	public static void main(String[] args) {
		CalculateEmi calculateEmi =  new CalculateEmi(1200, 10, 1);
	}
	
}
