package libraryAssignment;

import java.util.Scanner;

public class BookDetails {

	String bookName;
	String genreOfTheBook;
	String authorName;
	boolean isBookIssued;

	Scanner sc = new Scanner(System.in);
	

	BookDetails(String nameOfBook, String genreBook, String nameOfAuthor, boolean isIssued) {
		bookName = nameOfBook;
		authorName = nameOfAuthor;
		isBookIssued = isIssued;
		genreOfTheBook = genreBook;
	}


	public BookDetails[] getTorontoBookDetails() {

		BookDetails tigana = new BookDetails("Tigana", "Fantacy", "Gavriel Kay", false);
		BookDetails americanGods = new BookDetails("American Gods", "Fantacy", "Neil Gaiman", false);
		BookDetails fightClub = new BookDetails("Fight Club", "Fiction", "  Chuck Palahniuk", false);
		BookDetails lilacGirls = new BookDetails("Lilac Girls", "Fiction", "  Martha Hall", false);
		BookDetails glimpse = new BookDetails("Glimpse", "Poetry", "Carol Lynch Williams", false);
		BookDetails babyTeeth = new BookDetails("Baby Teeth", "Poetry", "Meg Grehan", false);
		BookDetails dry = new BookDetails("The Dry", "Mystery", "Jane Harper", false);
		BookDetails rebecca = new BookDetails("Rebecca", "Mystery", "De Maurier ", false);
		BookDetails odyssey = new BookDetails("The Odyssey", "Mythology", "Homer", false);
		BookDetails norse = new BookDetails("Norse Mythology", "Mythology", "Neil Gaiman", false);

		BookDetails[] torontoBooks = { tigana, americanGods, fightClub, lilacGirls, glimpse, babyTeeth, dry, rebecca,odyssey,norse };
		for (int i = 0; i < torontoBooks.length; i++) {
			BookDetails books = torontoBooks[i];
			System.out.println(books.bookName + " by " + books.authorName);
		}
		return torontoBooks;

	}

	public BookDetails[] getMarkhamBookDetails() {
		BookDetails harryPotter = new BookDetails("Deathly Hallows", "Fantacy", "J K Rowling", false);
		BookDetails iceAndFire = new BookDetails("Ice and Fire", "Fantacy", "R Martin", false);
		BookDetails famousFive = new BookDetails("On an Island", "Fiction", "Andy Blyton", false);
		BookDetails fivePointSomeone = new BookDetails("Five Point Someone", "Fiction", "Chetan Bhagat", false);
		BookDetails bridgerton = new BookDetails("The Duke and I", "Poetry", "Julia Quinn", false);
		BookDetails alchemist = new BookDetails("The Alchemist", "Poetry", "Paulo Coelho", false);
		BookDetails sherlockHolmes = new BookDetails("The Valley of Fear", "Mystery", "Arthur Conan Doyle", false);
		BookDetails goneGirl = new BookDetails("Gone Girl", "Mystery", "Gillian Flynn", false);
		BookDetails bulfinch = new BookDetails("Bulfinch's Mythology", "Mythology", "Thomas Bulfinch", false);
		BookDetails iliad = new BookDetails("The Iliad", "Mythology", "Homer", false);

		BookDetails[] markhamBooks = { harryPotter, iceAndFire, famousFive, fivePointSomeone, bridgerton, alchemist,
				sherlockHolmes, goneGirl,bulfinch,iliad };
		for (int i = 0; i < markhamBooks.length; i++) {
			BookDetails books = markhamBooks[i];
			System.out.println(books.bookName + " by " + books.authorName);
		}
		return markhamBooks;

	}

	public BookDetails[] getScarebroughBookDetails() {
		BookDetails lordOfTheRings = new BookDetails("Lord of the Rings", "Fantacy", "JR", false);
		BookDetails narnia = new BookDetails("Prince Caspin", "Fantacy", "C S Lewis", false);
		BookDetails outlander = new BookDetails("Dragonfly in Amber", "Fiction", "Diana Gabaldon", false);
		BookDetails dune = new BookDetails("Dune", "Fiction", " Frank Herbert", false);
		BookDetails crank = new BookDetails("Crank", "Poetry", "Ellen Hopkins", false);
		BookDetails one = new BookDetails("One", "Poetry", "Sarah Crossan", false);
		BookDetails maid = new BookDetails("The Maid", "Mystery", "Nita Prose", false);
		BookDetails shutterIsland = new BookDetails("Shutter Island", "Mystery", "Dennis Lehane", false);
		BookDetails mythos = new BookDetails("Mythos", "Mythology", "Stephen Fry", false);
		BookDetails hero = new BookDetails("The Hero with a Thousand Faces", "Mythology", "Joseph Campbell", false);

		BookDetails[] scarbroughBooks = { lordOfTheRings, narnia, outlander, dune, crank, one, maid, shutterIsland,mythos,hero };

		for (int i = 0; i < scarbroughBooks.length; i++) {
			BookDetails books = scarbroughBooks[i];
			System.out.println(books.bookName + " by " + books.authorName);
		}

		return scarbroughBooks;
	}
	
	/*------------------------------------------merging all the arrays to single array------------------------------------------*/
	
	public BookDetails[] getAllBooks() {
		BookDetails[] torontoBooks = getTorontoBookDetails();
		BookDetails[] markhamBooks = getMarkhamBookDetails();
		BookDetails[] scarbroughBooks = getScarebroughBookDetails();

		int totalLength = torontoBooks.length + markhamBooks.length + scarbroughBooks.length;// size of the merged array

		BookDetails[] allBooks = new BookDetails[totalLength];// merged array

		/*Copy elements from arrays to allBooks*/
		System.arraycopy(torontoBooks, 0, allBooks, 0, torontoBooks.length); // method to copy elements from each
																				// individual array
		System.arraycopy(markhamBooks, 0, allBooks, torontoBooks.length, markhamBooks.length);
		System.arraycopy(scarbroughBooks, 0, allBooks, torontoBooks.length + markhamBooks.length,
				scarbroughBooks.length);

		/*
		 * System.arraycopy(source array,starting index of s.array,destination
		 * array,starting index of d.array, no:of elements to be copied
		 */

		return allBooks;
	}
	
	public BookGenre selectGenreOfBook() {
		  System.out.println("\nSelect genre\n---------------- \nFiction\nMythology\nFantasy\nPoetry\nMystry");
	        String genreOfBook = sc.nextLine();

	        // Convert the user input to the corresponding BookGenre enum value
	        switch (genreOfBook) {
	            case "Fiction":
	                return BookGenre.FICTION;
	            case "Mythology":
	                return BookGenre.MYTHOLOGY;
	            case "Fantasy":
	                return BookGenre.FANTACY;
	            case "Poetry":
	                return BookGenre.POETRY;
	            case "Mystery":
	                return BookGenre.MYSTERY;
	            default:
	                System.out.println("Please select a valid genre from the options.");
	                return selectGenreOfBook(); // Recursive call if invalid input
	        }
	    }

	enum BookGenre {

		FICTION("Fiction"), MYTHOLOGY("Mythology"), FANTACY("Fantacy"), POETRY("Poetry"), MYSTERY("Mystry");

		String genreOfBook;

		private BookGenre(String genre) {
			genreOfBook = genre;
		}

		String getGenreOfBook() {
			return genreOfBook;
		}

	}

	
}