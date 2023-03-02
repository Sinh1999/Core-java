package practicals;

public class Practical8 {

	/*
	 * Interest Rate per month	
	 */
	float rate ; 
	
	/*
	 * Loan Amount 	
	 */
	float principalAmount;
	
	/*
	 * Loan time period in year  
	 */
	float time;
	
	
	
	public Practical8(float pa, float r, float t) {
		
		
		rate = r;
		principalAmount =pa;
		time = t;
		 
		rate=rate/(12*100); 
		
		time=time*12;
		
		System.out.println("Your Per Month EMI Amount : " + (principalAmount * rate * Math.pow(1+rate, time) / (Math.pow(1+rate, time)-1)));
	}


	public static void main(String[] args) {
		
		/*
		 * Pass arguments in constructor for loan details 
		 */
		
		Practical8 obj =  new Practical8(1200, 10, 1);
 		
	}
}
