package practicals.oops.interfac;
/**
 * Practical-17 a program to demonstrate the interface.
 * 
 * @author Shailesh Sinh
 * 
 * @since 01-03-2023
 *
 * @version 1.0.1
 */
public class InterfaceImpl implements InterfaceMethods {

	@Override
	public void call() {
		System.out.println("Calling method call");
	}

	@Override
	public void run() {
		System.out.println("Calling method run");
	}

	public static void main(String[] args) {
		InterfaceImpl interfaceImpl = new InterfaceImpl();

		interfaceImpl.call();
		interfaceImpl.run();
	}

}
