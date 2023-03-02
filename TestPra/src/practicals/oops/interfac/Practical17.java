package practicals.oops.interfac;

public class Practical17 implements InterfaceMethods {

	/*
	 * Interface methods implemented
	 */
	
	@Override
	public void call() {
		System.out.println("Calling method call");
		
	}

	@Override
	public void run() {
		System.out.println("Calling method run");
	}
	
	public static void main(String[] args) {
		
		Practical17  practical17 =  new Practical17();
		
		practical17.call();
		practical17.run();
	}
}
