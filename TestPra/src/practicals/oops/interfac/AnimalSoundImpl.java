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
public class AnimalSoundImpl implements AnimalSound {

	@Override
	public void Dog() {
		System.out.println("Braking....");
	}

	@Override
	public void Cat() {
		System.out.println("Mew....mew");
	}

	public static void main(String[] args) {
		AnimalSoundImpl animalSoundImpl = new AnimalSoundImpl();
		animalSoundImpl.Cat();
		animalSoundImpl.Dog();
	}

}
