package libraryAssignment;

import java.util.Scanner;

//import constructorLearning.BookDetails;

public class LibraryMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*----------------------------------------------------------------------------------------------*/

		ReaderDetails sam = new ReaderDetails("Premium", "Sam", 5346, 3);
		ReaderDetails jon = new ReaderDetails("Baic", "Jon", 7689, 2);
		ReaderDetails kate = new ReaderDetails("Baic", "Kate", 3789, 2);
		ReaderDetails rick = new ReaderDetails("Premium", "Rick", 4570, 3);

		ReaderDetails[] allReaders = { sam, jon, kate, rick };

		/*----------------------------------------------------------------------------------------------*/
		BookDetails harryPotter = new BookDetails("Deathly Hallows", "J K Rowling", false);
		BookDetails famousFive = new BookDetails("On an Island", "Andy Blyton", false);
		BookDetails fivePointSomeone = new BookDetails("Five Point Someone", "Chetan Bhagat", false);
		BookDetails iceAndFire = new BookDetails("Ice and Fire", "R Martin", false);
		BookDetails lordOfTheRings = new BookDetails("Lord of the Rings", "JR", false);
		BookDetails narnia = new BookDetails("Prince Caspin", "C S Lewis", false);
		BookDetails bridgerton = new BookDetails("The Duke and I", "Julia Quinn", false);
		BookDetails outlander = new BookDetails("Dragonfly in Amber", "Diana Gabaldon", false);
		BookDetails sherlockHolmes = new BookDetails("The Valley of Fear", "Arthur Conan Doyle", false);

		BookDetails[] allBooks = { harryPotter, famousFive, fivePointSomeone, iceAndFire, lordOfTheRings, narnia,
				bridgerton, outlander, sherlockHolmes };

		BookDetails[] torontoBooks = { harryPotter, famousFive, fivePointSomeone, iceAndFire, lordOfTheRings, narnia,
				bridgerton, outlander, sherlockHolmes };
		BookDetails[] scarbroughBooks = { famousFive, fivePointSomeone, iceAndFire, lordOfTheRings };
		BookDetails[] markamBooks = { iceAndFire, lordOfTheRings, narnia };

		/*----------------------------------------------------------------------------------------------*/

		LibraryDetails toronto = new LibraryDetails("Toronto", allBooks);
		LibraryDetails scarbrough = new LibraryDetails("Scarbrough", allBooks);
		LibraryDetails markham = new LibraryDetails("Markham", allBooks);

		LibraryDetails[] allLibraries = { toronto, scarbrough, markham };

		/*----------------------------------------------------------------------------------------------*/

		boolean isLibraryFound = false;
		int enteredRid;
		int numOfBukIssue = 0;
		int count = 0;
		boolean continueIssue = true;
		/*----------------------------------------------------------------------------------------------*/
		System.out.println("Welcome to Ontario Books World\n" + "---------------------------");

		for (LibraryDetails library : allLibraries) {// for (DataType variable : arrayOrCollection)-->for...each loop
			System.out.println(library.libraryName);
		}

		LibraryDetails enteredLibrary = null;// declared a variable of type LibraryDetails

		System.out.println("Select library to view avilable books");
		String libraryName = sc.next();

		for (LibraryDetails libray : allLibraries) {
			if (libray.libraryName.equalsIgnoreCase(libraryName)) {
				isLibraryFound = true;
				enteredLibrary = libray;
				break;
			}

		}

		if (isLibraryFound) {
			System.out.println("\nBooks available in " + enteredLibrary.libraryName + "library are");
			BookDetails[] booksOfSelectedLibrary = enteredLibrary.book;

			for (BookDetails book : booksOfSelectedLibrary) {
				System.out.println(book.bookName + " by " + book.authorName);
			}
		} else {
			System.out.println("Invalid library name. Please select a valid library.");
			return;
		}

		/*----------------------------------------------------------------------------------------------*/
		ReaderDetails enteredReaderId = null;

		System.out.println("Enter your reader id");
		enteredRid = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < allReaders.length; i++) {
			if (allReaders[i].getReaderID() == enteredRid)
				enteredReaderId = allReaders[i];
			break;
		}

		if (enteredReaderId != null) {

			while (count < enteredReaderId.numOfBooksGranted && continueIssue) {

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
					System.out.println("Book not found Please select book from the list.");
				} else if (!isAvailableToIssue) {
					System.out
							.println("The Selected book is already issued , please select another book from the list.");
				} else if (count == numOfBukIssue) {
					System.out.println("Reached maximum books...Thank you for visiting");
					break;
				} else {
					System.out.println("Book is available for issuing.");
				}
				if (count < numOfBukIssue) {
					System.out.println("Do you want to continue? (yes/no)");
					String answer = sc.nextLine();
					continueIssue = answer.equalsIgnoreCase("yes");
					// isBookListed=false;

				} else {
					continueIssue = false;
				}
			}
			sc.close();

		} else {
			System.out.println("Invalid reader Id");
		}

	}

}
