package libraryApplication;

public class Library {
	private String libraryName;
	private Books[] books;

	public Library(String libraryName) {
		this.libraryName = libraryName;
		this.books = new Books[0];
	}

	public String getLibraryName() {
		return libraryName;
	}

	public Books[] getBooks() {
		return books;
	}

	public void setBooks(Books[] books) {
		this.books = books;
	}

	public static Library[] getLibraries() {
		Library toronto = new Library("Toronto");
		Library scarborough = new Library("Scarborough");
		Library markham = new Library("Markham");

		Library[] allLibraries = { toronto, scarborough, markham };

		return allLibraries;
	}
}