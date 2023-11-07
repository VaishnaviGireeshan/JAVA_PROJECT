package libraryAssignment;

import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {
		
		Library objLbDetails = new Library();
		Books objBkDetails = new Books();
		BookIssuingOperations objBkIssuingOps = new BookIssuingOperations();
		ReaderDetails objRdetail = new ReaderDetails();

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Ontario Books World\n" + "-------------------------------");

		objRdetail.getReaderDetails(false);
		
		
//		while(objRdetail.getNumOfBooksGranted()<=objRdetail.numOfBooksGranted) {
//			BookDetails.BookGenre selectedGenre = objBkDetails.selectGenreOfBook();
//			displayBooksByGenre(filteredBooks, selectedGenre);
//			}
		
		
		Books[] booksByLibrary = objLbDetails.getBookByLibrary();
		Books.BookGenre selectedGenre = objBkDetails.selectGenreOfBook();
		objBkIssuingOps.displayBooksByGenre(booksByLibrary, selectedGenre);
		objBkIssuingOps.issueBookToReaders(booksByLibrary);
		
		sc.close();

	}
}