package practicals.oops.abstaction;

public abstract class HidingDetails {

	/*
	 * Non-Abstract method
	 */
	
	void run () {
		System.out.println("Calling non- abtsract method");
	};
	
	/* 
	 * Abstract method
	 */
	
	abstract void call();
}
