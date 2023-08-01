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

		objRdetail.getReaderDetails();
		BookDetails[] booksByLibrary = objLbDetails.getBookByLibrary();
		BookDetails.BookGenre selectedGenre = objBkDetails.selectGenreOfBook();
		objBkIssuingOps.displayBooksByGenre(booksByLibrary, selectedGenre);
		objBkIssuingOps.issueBookToReaders(booksByLibrary);
		sc.close();

	}
}