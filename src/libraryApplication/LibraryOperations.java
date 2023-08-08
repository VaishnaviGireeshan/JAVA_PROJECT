package libraryApplication;

import java.util.Arrays;
import java.util.Scanner;

public class LibraryOperations {

	private Library selectedLibrary = null;
	private Books[] allBooks = null;
	private Users[] allUsers = null;
	private Users users = new Users();
	private Scanner sc = new Scanner(System.in);
	private int maxBooksPerUser = 3;

	public LibraryOperations(String libraryName) {
		this.selectedLibrary = new Library(libraryName);
		this.allBooks = Books.setAllBooks();
		this.allUsers = users.getUserDetails();

		// Set books for each library
		Library[] libraries = Library.getLibraries();
		for (Library library : libraries) {
			if (library.getLibraryName().equals(libraryName)) {
				Books[] libraryBooks = Arrays.stream(allBooks).filter(book -> book.getLibrary() == library)
						.toArray(Books[]::new);
				library.setBooks(libraryBooks);
				break;
			}
		}
	}

	/*---------------------------DashBoard------------------------*/
	public void dashboard() {
		System.out.println("Ontario Books World\n" + "--------------------");
		System.out.println("1. LogIn\n2. SignUp\n3. Guest Login");
		String answer = sc.nextLine();
		switch (answer) {
		case "1":
			String userId = getLogin();
			String userType = getUserType(userId);
			handleUserType(userType);
			break;
		case "2":
			signUp();
			break;
		case "3":
			// Guest Login logic here
			break;
		default:
			System.out.println("Invalid selection!!!");
			break;
		}
	}

	/*---------------------------Login------------------------*/

	private String getLogin() {
		int loginAttempt = 0;

		while (loginAttempt <= 3) {
			System.out.println("Enter your userId");
			String userId = sc.nextLine();
			System.out.println("Enter your password");
			String userPassword = sc.nextLine();

//	            char[] passwordChars = console.readPassword();
//	            String passwordString = new String(passwordChars);

			for (Users user : allUsers) {
				if (user.getUserId().equals(userId) && user.getUserPassword().equals(userPassword)) {
					System.out.println("\n-----------------------------\nHi " + user.getUserName()
							+ ", Welcome to homepage\n-----------------------------");
					return userId;
				}
			}
			System.out.println("Invalid userId or password.");
			loginAttempt++;
			if (loginAttempt == 3) {
				System.out.println("Reached maximum attempts!!! Contact customer support for further details!!!");
			}
		}

		return null;
	}

	/*---------------------------Signup ------------------------*/

	private void signUp() {
		System.out.println("Sign Up\n" + "------------------");

		System.out.println("Enter your userId");
		String userId = sc.nextLine();

		// Checking if the userId already exists
		for (Users user : allUsers) {
			if (user.getUserId().equals(userId)) {
				System.out.println("User with the same userId already exists. Please choose a different userId.");
				return;
			}
		}

		System.out.println("Enter your user name");
		String userName = sc.nextLine();

		System.out.println("Enter your password");
		String userPassword = sc.nextLine();

		// Create a new user and add it to the list of all users
		Users newUser = new Users(userId, userName, userPassword);
		Users[] newAllUsers = Arrays.copyOf(allUsers, allUsers.length + 1);
		newAllUsers[newAllUsers.length - 1] = newUser;
		allUsers = newAllUsers;

		System.out.println("User registered successfully!");
	}

	/*----------------------Setting User type------------------------*/
	private String getUserType(String userId) {
		return setUserType(userId);
	}

	private String setUserType(String userId) {
		if (userId.startsWith("A")) {
			return "Admin";
		} else if (userId.startsWith("R")) {
			return "Reader";
		} else {
			return "Guest";
		}
	}

	private void handleUserType(String userType) {
		if (userType.equals("Reader")) {
			selectedLibrary = selectLibrary();
			if (selectedLibrary != null) {
				handleReaderOperations(selectedLibrary);
			}
		} else if (userType.equals("Admin")) {
			// Code to handle admin operations
			System.out.println("Welcome Admin!");

		} else {
			// Code to handle guest operations
			System.out.println("Welcome Guest!");

		}
	}

	/*---------------------------Library Selection------------------------*/
	private Library selectLibrary() {
		System.out.println("Select a library:");
		System.out.println("1. Toronto\n2. Markham\n3. Scarborough");
		String librarySelection = sc.nextLine();

		Library selectedLibrary = null;
		switch (librarySelection) {
		case "1":
			selectedLibrary = new Library("Toronto");
			selectedLibrary.setBooks(Books.getTorontoBooks());
			break;
		case "2":
			selectedLibrary = new Library("Markham");
			selectedLibrary.setBooks(Books.getMarkhamBooks());
			break;
		case "3":
			selectedLibrary = new Library("Scarborough");
			selectedLibrary.setBooks(Books.getScarboroughBooks());
			break;
		default:
			System.out.println("Invalid library selection. Please try again.");
			return selectLibrary();
		}
		System.out.println("You have selected the library: " + selectedLibrary.getLibraryName());
		return selectedLibrary;
	}

	/*--------------------Reader Operations----------------------*/
	private void handleReaderOperations(Library selectedLibrary) {
		boolean continueReading = true;

		System.out.println("What service you want?\n1. Issue Books\n2. Return books\n3. LogOut");
		String answer = sc.nextLine();

		switch (answer) {
		case "1":
			issueBookToReader(selectedLibrary);
			break;
		case "2":
			// Return books logic here
			break;
		case "3":
			logout();
			continueReading = false;
			break;
		default:
			System.out.println("Invalid selection!!!");
			break;
		}
		if (continueReading) {
			System.out.println("Do you want to continue? (yes/no)");
			String continueChoice = sc.nextLine();
			if (!continueChoice.equalsIgnoreCase("yes")) {
				System.out.println("Logging out...");
				continueReading = false;
			}
		}
	}

	/*--------------------Display Books By Genre----------------------*/

	private void displayBooksByGenre(Books.BookGenre genre, Library library) {
		System.out.println("Books in " + library.getLibraryName() + " under the genre " + genre + " are:");

		boolean foundBooks = false;
		for (Books book : library.getBooks()) {
			if (book.getGenreOfTheBook().getGenreOfBook().equals(genre.getGenreOfBook())) {
				System.out.println(book.getBookName() + " by " + book.getAuthorName());
				foundBooks = true;
			}
		}

		if (!foundBooks) {
			System.out.println("No books found in the selected library and genre.");
		}
	}

	/*--------------------Issuing books----------------------*/
	private void issueBookToReader(Library selectedLibrary) {
		int booksIssued = 0;
		boolean continueIssuing = true;
		while (continueIssuing && booksIssued < maxBooksPerUser) {
			System.out.println("Available Genres in " + selectedLibrary.getLibraryName() + ":");
			Books.BookGenre[] genres = Books.BookGenre.values();
			for (int i = 0; i < genres.length; i++) {
				System.out.println((i + 1) + ". " + genres[i].getGenreOfBook());
			}

			System.out.println("Enter the number of the genre you want to choose:");
			int genreSelection = sc.nextInt();
			sc.nextLine();

			if (genreSelection < 1 || genreSelection > genres.length) {
				System.out.println("Invalid genre selection. Please select a valid genre.");
				return;
			}

			Books.BookGenre selectedGenre = genres[genreSelection - 1];

			displayBooksByGenre(selectedGenre, selectedLibrary);
			System.out.println("Enter the name of the book that you want to be issued:");
			String bookName = sc.nextLine();
			boolean isBookFound = false;
			for (Books book : selectedLibrary.getBooks()) {
				if (book.getGenreOfTheBook() == selectedGenre && book.getBookName().equalsIgnoreCase(bookName)
						&& !book.isBookIssued()) {
					book.setBookIssued(true);
					isBookFound = true;
					System.out.println("Book " + book.getBookName() + " has been issued to you. Enjoy reading!");
					booksIssued++;
					break;
				}
			}

			if (!isBookFound) {
				System.out.println("The selected book is not available or already issued. Please select another book.");
			}
			if (booksIssued >= maxBooksPerUser) {
				System.out.println("Reached the maximum number of books issued per user.");
				continueIssuing = false;
			} else {
				System.out.println("Do you want to issue another book? (yes/no)");
				String continueChoice = sc.nextLine();
				if (!continueChoice.equalsIgnoreCase("yes")) {
					continueIssuing = false;
				}
			}
		}
	}

	/*--------------------Method overloading----------------------*/
	private void issueBookToReader(Books[] allBooks, Library selectedLibrary, int maxBooksPerUser) {
		int count = 0;
		boolean continueIssue = true;
		while (continueIssue) {
			System.out.println("Enter the name of the book that you want to be issued:");
			String bookName = sc.nextLine();
			boolean isBookListed = false;
			boolean isAvailableToIssue = false;

			for (int i = 0; i < allBooks.length; i++) {
				if (allBooks[i].getBookName().equalsIgnoreCase(bookName)
						&& allBooks[i].getLibrary() == selectedLibrary) {
					isBookListed = true;
					if (!allBooks[i].isBookIssued()) {
						isAvailableToIssue = true;
						allBooks[i].setBookIssued(true);
						count++;
						break;
					} else {
						System.out.println("Book is already issued.");
						break;
					}
				}
			}

			if (!isBookListed) {
				System.out.println("Book not found in the selected library. Please select a book from the list.");
			} else if (!isAvailableToIssue) {
				System.out.println("The selected book is already issued. Please select another book.");
			} else {
				System.out.println("Book is available for issuing.");
			}

			if (count == maxBooksPerUser) {
				System.out.println("Reached the maximum number of books issued per user. Thank you for visiting.");
				break;
			} else {
				System.out.println("Do you want to continue issuing books? (yes/no)");
				String answer = sc.nextLine();
				if (answer.equalsIgnoreCase("no")) {
					continueIssue = false;
				}
			}
		}
	}

	/*--------------------Logout----------------------*/
	private void logout() {
		System.out.println("Logged out successfully. Thank you for visiting Ontario Books World!");

	}

}
