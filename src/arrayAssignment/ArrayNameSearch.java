package arrayAssignment;

import java.util.Scanner;

public class ArrayNameSearch {
	String[] names = new String[5];
	Scanner sc = new Scanner(System.in);

	void populateNameArray() {

		for (int i = 0; i < names.length; i++) {
			System.out.println("Enter name: " + (i + 1));
			names[i] = sc.next();
		}
	}

	void printNames() {
		System.out.println("Names\n" + "------");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

	// Find the entered name if present in the array
	void findNameInArray() {
		String enteredName;
		int count = 0;
		System.out.println("Enter the name you want to search");
		enteredName = sc.next();
		for (int i = 0; i < names.length; i++) {

			if (enteredName.equals(names[i])) {
				count++;
			}
		}
		if (count > 0) {
			System.out.println("Name is present in the array " + count + " time(s)");
		} else {
			System.out.println("Name is not present in the array");
		}
	}

}
