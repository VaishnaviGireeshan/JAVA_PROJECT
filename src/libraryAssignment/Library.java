package libraryAssignment;

import java.util.Scanner;

public class Library {

	String libraryName;
	boolean isMember;
	Books[] book;
	boolean isLibraryFound = false;

	Scanner scr = new Scanner(System.in);
	Books objBkDetails = new Books(null, null, null, false);

	public Library(String lName) {
		libraryName = lName;
	}
public Library() {
	
}
	public String getLibraryName() {
		return libraryName;
	}

	public Library[] getLibraryDetails() {
		Library toronto = new Library("Toronto");
		Library scarbrough = new Library("Scarbrough");
		Library markham = new Library("Markham");

		Library[] allLibraries = { toronto, scarbrough, markham };

		return allLibraries;
	}

	public void displayAllLibraryNames() {
		System.out.println("\nSelect library to view available books\n-----------------------------------");
		for (Library library : getLibraryDetails()) {
			System.out.println(library.getLibraryName());
		}
	}

	public Books[] getBookByLibrary() {
		displayAllLibraryNames();
		String lName = scr.nextLine();
		Books[] selectedLibrary=null;
		if (lName.equalsIgnoreCase(libraryName)) {
			System.out.println("\nAvailable books in " + lName + "\n-----------------------------");
		}
		switch (lName) {
		case "Toronto":
			return selectedLibrary=objBkDetails.getTorontoBookDetails();
		case "Scarborough":
			return selectedLibrary=objBkDetails.getScarebroughBookDetails();
		case "Markham":
			return selectedLibrary=objBkDetails.getMarkhamBookDetails();
		default:
			System.out.println("Invalid library name");
			return selectedLibrary;
		}
	}
}