package libraryAssignment;

import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {
		LibraryDetails objLbDetails = new LibraryDetails(null);
		BookDetails objBkDetails = new BookDetails(null, null, null, false);
		BookIssuingOperations objBkIssuingOps = new BookIssuingOperations();
		ReaderDetails objRdetail = new ReaderDetails(null, null, null, 0);

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Ontario Books World\n" + "-------------------------------");

		objLbDetails.getLibraryDetails();

		BookDetails[] booksByLibrary = objLbDetails.getBookByLibrary();

		BookDetails.BookGenre selectedGenre = objBkDetails.selectGenreOfBook();

		objBkIssuingOps.displayBooksByGenre(booksByLibrary, selectedGenre);
		// objRdetail.getReaderDetails();
		/*-----------------------------------------------------------------------------*/
		System.out.println("\nEnter 'R' if you are a reader:");
		String userType = sc.nextLine();

		if (userType.equalsIgnoreCase("R")) {
			objRdetail.getReaderDetails(); // Call the getReaderDetails() method to handle reader book borrowing
		}

		sc.close();

	}
}