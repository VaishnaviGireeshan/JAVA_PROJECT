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
        for (LibraryDetails library : allLibraries) {
            System.out.println(library.getLibraryName());
        }
        return allLibraries;
    }

    public BookDetails[] getBookByLibrary() {
        System.out.println("\nSelect library from the list to view available books");
        String lName = scr.nextLine();
        if (lName.equalsIgnoreCase(libraryName)) {
            System.out.println("\nAvailable books in " + lName + "\n-----------------------------");
        }
        switch (lName) {
            case "Toronto":
                return objBkDetails.getTorontoBookDetails();
            case "Scarbrough":
                return objBkDetails.getScarebroughBookDetails();
            case "Markham":
                return objBkDetails.getMarkhamBookDetails();
            default:
                System.out.println("Invalid library name");
                return null;
        }
    }
}