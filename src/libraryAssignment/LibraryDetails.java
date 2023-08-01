package libraryAssignment;

import java.util.Scanner;

public class LibraryDetails {

	String libraryName;
	boolean isMember;
	BookDetails[] book;
	boolean isLibraryFound = false;

	Scanner scr = new Scanner(System.in);
	BookDetails objBkDetails = new BookDetails(null, null, null, false);

	public LibraryDetails(String lName) {
		libraryName = lName;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public LibraryDetails[] getLibraryDetails() {
		LibraryDetails toronto = new LibraryDetails("Toronto");
		LibraryDetails scarbrough = new LibraryDetails("Scarbrough");
		LibraryDetails markham = new LibraryDetails("Markham");

		LibraryDetails[] allLibraries = { toronto, scarbrough, markham };

		return allLibraries;
	}

	public void displayAllLibraryNames() {
		System.out.println("\nSelect library to view available books\n-----------------------------------");
		for (LibraryDetails library : getLibraryDetails()) {
			System.out.println(library.getLibraryName());
		}
	}

	public BookDetails[] getBookByLibrary() {
		displayAllLibraryNames();
		String lName = scr.nextLine();
		if (lName.equalsIgnoreCase(libraryName)) {
			System.out.println("\nAvailable books in " + lName + "\n-----------------------------");
		}
		switch (lName) {
		case "Toronto":
			return objBkDetails.getTorontoBookDetails();
		case "Scarborough":
			return objBkDetails.getScarebroughBookDetails();
		case "Markham":
			return objBkDetails.getMarkhamBookDetails();
		default:
			System.out.println("Invalid library name");
			return null;
		}
	}
}