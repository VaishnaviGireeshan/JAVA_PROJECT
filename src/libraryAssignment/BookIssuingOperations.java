package libraryAssignment;

import java.util.Scanner;

public class BookIssuingOperations {

	int count = 0;
	ReaderDetails objRdetail = new ReaderDetails(null, null, null, 0);
	Books objBkDetails = new Books(null, null, null, false);
	Library objLbDetails = new Library(null);
	Scanner sc = new Scanner(System.in);
	Books[] allBooks;
	 // Arrays to store filtered books based on genre and library
	Books[] filteredBooks;
	Books[] filteredBooksByLibraryAndGenre;
	
	  public void setAllBooks(Books[] books) {
	        allBooks = books;
	    }

	public void displayBooksByGenre(Books[] allBooks, Books.BookGenre genre) {
		if (genre == null) {
			System.out.println("No genre selected.");
			return;
		}

		int countByGenre = 0;
		for (int i = 0; i < allBooks.length; i++) {
			 if (allBooks[i].genreOfTheBook.equalsIgnoreCase(genre.getGenreOfBook())) {
	                countByGenre++;
			}
		}

		if ( countByGenre > 0) {

			Books[] filteredBooksByGenre = new Books[countByGenre];
	            int index = 0;

	            for (int i = 0; i < allBooks.length; i++) {
	                if (allBooks[i].genreOfTheBook.equalsIgnoreCase(genre.getGenreOfBook())) {
	                    filteredBooksByGenre[index] = allBooks[i];
	                    index++;
	                }
	            }

			System.out.println("Books of genre " + genre.getGenreOfBook() + "------------------");
            for (int i = 0; i < countByGenre; i++) {
                System.out.println(filteredBooksByGenre[i].bookName + " by " + filteredBooksByGenre[i].authorName);
            }
		} else {
			System.out.println("No books found for the selected genre.");
		}
	}
	

	public void issueBookToReaders(Books[] allBooks) {
		while (objRdetail.continueIssue) {
			System.out.println("Enter the name of the book that you want to be issued");
			String bookName = sc.nextLine();
			boolean isBookListed = false;
			boolean isAvailableToIssue = false;

			for (int i = 0; i < allBooks.length; i++) {
				if (allBooks[i].bookName.equalsIgnoreCase(bookName)) {
					isBookListed = true;
					if (!allBooks[i].isBookIssued) {
						isAvailableToIssue = true;
						allBooks[i].isBookIssued = true;
						count++;
						break;
					} else {
						System.out.println("Book is already issued");
						break;
					}
				}
			}

			if (!isBookListed) {
				System.out.println("Book not found. Please select a book from the list.");
			} else if (!isAvailableToIssue) {
				System.out.println("The selected book is already issued. Please select another book.");
			} else {
				System.out.println("Book is available for issuing.");
			}

			if (count == objRdetail.numOfBukIssue) {
				System.out.println("Reached maximum books...Thank you for visiting");
			} else {
				System.out.println("Do you want to continue? (yes/no)");
				String answer = sc.nextLine();
				if (answer.equalsIgnoreCase("no")) {
					objRdetail.continueIssue = false;
					break; // Exit the loop if the reader does not want to continue
				}
				while(objRdetail.getNumOfBooksGranted()<=objRdetail.numOfBooksGranted) {
				Books.BookGenre selectedGenre = objBkDetails.selectGenreOfBook();
				displayBooksByGenre(filteredBooks, selectedGenre);
				}
			}
		}
	}
}