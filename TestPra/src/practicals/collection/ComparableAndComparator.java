package practicals.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Practical-23 A program to demonstrate comparable and comparator interface.
 * 
 * @author Shailesh Sinh
 * 
 * @since 01-03-2023
 *
 * @version 1.0.1
 */
public class ComparableAndComparator {

	public static void main(String[] args) {
		List<StudentDetails> listOfStudent = new ArrayList<>();

		listOfStudent.add(new StudentDetails("Rahul", 18, "MasumSchool"));
		listOfStudent.add(new StudentDetails("Rihan", 17, "MadhavSchool"));
		listOfStudent.add(new StudentDetails("Rohan", 25, "GokulSchool"));

		// Collections.sort(list) is extend to comparable
		Collections.sort(listOfStudent);

		for (int i = 0; i < listOfStudent.size(); i++) {
			System.out.println(listOfStudent.get(i));
		}
		List<CarsDetails> carsList = new ArrayList<>();

		carsList.add(new CarsDetails("MarutiSuzuki", "SZ78", 700000));
		carsList.add(new CarsDetails("BMW", "BW478", 7700000));
		carsList.add(new CarsDetails("Shiwft", "Sft4568", 600000));
		carsList.add(new CarsDetails("Scropiao", "SCrp99", 1500000));

		// Car list short by price
		Collections.sort(carsList);

		for (int i = 0; i < carsList.size(); i++) {
			System.out.println("CarList : " + carsList.get(i).carPrice);
		}

		// Sort by name
		CarNameCompare carNameCompare = new CarNameCompare();
		Collections.sort(carsList, carNameCompare);
		for (int i = 0; i < carsList.size(); i++) {
			System.out.println("CarList : " + carsList.get(i).carName);
		}
	}

}
