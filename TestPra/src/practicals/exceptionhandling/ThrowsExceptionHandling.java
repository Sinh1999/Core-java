package practicals.exceptionhandling;

public class ThrowsException {

	static void divide(int num , int num2)throws ArithmeticException {
		int d = num/num2 ;
	}
	
	public static void main(String[] args) {
		
		divide(15, 0);
	}
}
