package libraryAssignment;

public class BookDetails {

	// String genre;
	String bookName;
	String authorName;
	boolean isBookIssued;

	BookDetails(String nameOfBook, String nameOfAuthor, boolean isIssued) {
		bookName = nameOfBook;
		authorName = nameOfAuthor;
		isBookIssued = isIssued;
	}

}