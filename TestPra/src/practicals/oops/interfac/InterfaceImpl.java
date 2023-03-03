package practicals.oops.interfac;

/**
 * Practical-17 a program to demonstrate the interface.
 * 
 * @author Shailesh Sinh
 * 
 * @since 01-03-2023
 *
 *@version 17.0.2
 */

public class InterfaceImpl implements InterfaceMethods {

	 // Interface methods implemented
	@Override
	public void call() {
		System.out.println("Calling method call");
		
	}

	@Override
	public void run() {
		System.out.println("Calling method run");
	}
	
	public static void main(String[] args) {
		
		InterfaceImpl  interfaceImpl =  new InterfaceImpl();
		
		interfaceImpl.call();
		interfaceImpl.run();
	}
	
}
