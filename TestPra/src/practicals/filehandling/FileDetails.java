package practicals.filehandling;
/**
 * Practical-25 a program to read the data from a myTestFile file
 * Using File Handling, Input Handling, Loops, String Handling, and Exception Handling
 * 
 * @author Shailesh Sinh
 * 
 * @since 01-03-2023
 *
 * @version 1.0.1
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDetails {

	public static void main(String[] args) {
		File file = new File("myTestFile");

		try { // Scanner Class use to user input
			Scanner fileRead = new Scanner(file);
			// While loop helps to text file in line exist or not checked after read the line
			while (fileRead.hasNextLine()) {
				String fileData = fileRead.nextLine();
				System.out.println(fileData);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
