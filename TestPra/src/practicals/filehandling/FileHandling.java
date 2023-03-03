package practicals.filehandling;
/**
 * Practical-24 A program to create a text file
 * 
 * @author Shailesh Sinh
 * 
 * @since 01-03-2023
 * 
 * @version 1.0.1
 */
import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		File file = new File("myTestFile");
		try {
			//File Create method
			file.createNewFile();
			System.out.println("File is Create" );
			System.out.println("Your file name : " + file.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
