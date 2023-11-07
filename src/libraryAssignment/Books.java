package libraryAssignment;

import java.util.Scanner;

public class Books {

	String bookName;
	String genreOfTheBook;
	String authorName;
	boolean isBookIssued;

	Scanner sc = new Scanner(System.in);
	

	Books(String nameOfBook, String genreBook, String nameOfAuthor, boolean isIssued) {
		bookName = nameOfBook;
		authorName = nameOfAuthor;
		isBookIssued = isIssued;
		genreOfTheBook = genreBook;
	}
public Books() {

}

	public Books[] getTorontoBookDetails() {

		Books tigana = new Books("Tigana", "Fantacy", "Gavriel Kay", false);
		Books americanGods = new Books("American Gods", "Fantacy", "Neil Gaiman", false);
		Books fightClub = new Books("Fight Club", "Fiction", "  Chuck Palahniuk", false);
		Books lilacGirls = new Books("Lilac Girls", "Fiction", "  Martha Hall", false);
		Books glimpse = new Books("Glimpse", "Poetry", "Carol Lynch Williams", false);
		Books babyTeeth = new Books("Baby Teeth", "Poetry", "Meg Grehan", false);
		Books dry = new Books("The Dry", "Mystery", "Jane Harper", false);
		Books rebecca = new Books("Rebecca", "Mystery", "De Maurier ", false);
		Books odyssey = new Books("The Odyssey", "Mythology", "Homer", false);
		Books norse = new Books("Norse Mythology", "Mythology", "Neil Gaiman", false);

		Books[] torontoBooks = { tigana, americanGods, fightClub, lilacGirls, glimpse, babyTeeth, dry, rebecca,odyssey,norse };
		for (int i = 0; i < torontoBooks.length; i++) {
			Books books = torontoBooks[i];
			System.out.println(books.bookName + " by " + books.authorName);
		}
		return torontoBooks;

	}

	public Books[] getMarkhamBookDetails() {
		Books harryPotter = new Books("Deathly Hallows", "Fantacy", "J K Rowling", false);
		Books iceAndFire = new Books("Ice and Fire", "Fantacy", "R Martin", false);
		Books famousFive = new Books("On an Island", "Fiction", "Andy Blyton", false);
		Books fivePointSomeone = new Books("Five Point Someone", "Fiction", "Chetan Bhagat", false);
		Books bridgerton = new Books("The Duke and I", "Poetry", "Julia Quinn", false);
		Books alchemist = new Books("The Alchemist", "Poetry", "Paulo Coelho", false);
		Books sherlockHolmes = new Books("The Valley of Fear", "Mystery", "Arthur Conan Doyle", false);
		Books goneGirl = new Books("Gone Girl", "Mystery", "Gillian Flynn", false);
		Books bulfinch = new Books("Bulfinch's Mythology", "Mythology", "Thomas Bulfinch", false);
		Books iliad = new Books("The Iliad", "Mythology", "Homer", false);

		Books[] markhamBooks = { harryPotter, iceAndFire, famousFive, fivePointSomeone, bridgerton, alchemist,
				sherlockHolmes, goneGirl,bulfinch,iliad };
		for (int i = 0; i < markhamBooks.length; i++) {
			Books books = markhamBooks[i];
			System.out.println(books.bookName + " by " + books.authorName);
		}
		return markhamBooks;

	}

	public Books[] getScarebroughBookDetails() {
		Books lordOfTheRings = new Books("Lord of the Rings", "Fantacy", "JR", false);
		Books narnia = new Books("Prince Caspin", "Fantacy", "C S Lewis", false);
		Books outlander = new Books("Dragonfly in Amber", "Fiction", "Diana Gabaldon", false);
		Books dune = new Books("Dune", "Fiction", " Frank Herbert", false);
		Books crank = new Books("Crank", "Poetry", "Ellen Hopkins", false);
		Books one = new Books("One", "Poetry", "Sarah Crossan", false);
		Books maid = new Books("The Maid", "Mystery", "Nita Prose", false);
		Books shutterIsland = new Books("Shutter Island", "Mystery", "Dennis Lehane", false);
		Books mythos = new Books("Mythos", "Mythology", "Stephen Fry", false);
		Books hero = new Books("The Hero with a Thousand Faces", "Mythology", "Joseph Campbell", false);

		Books[] scarbroughBooks = { lordOfTheRings, narnia, outlander, dune, crank, one, maid, shutterIsland,mythos,hero };

		for (int i = 0; i < scarbroughBooks.length; i++) {
			Books books = scarbroughBooks[i];
			System.out.println(books.bookName + " by " + books.authorName);
		}

		return scarbroughBooks;
	}
	
	/*------------------------------------------merging all the arrays to single array------------------------------------------*/
	
	public Books[] getAllBooks() {
		Books[] torontoBooks = getTorontoBookDetails();
		Books[] markhamBooks = getMarkhamBookDetails();
		Books[] scarbroughBooks = getScarebroughBookDetails();

		int totalLength = torontoBooks.length + markhamBooks.length + scarbroughBooks.length;// size of the merged array

		Books[] allBooks = new Books[totalLength];// merged array

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

	public enum BookGenre {

		FICTION("Fiction"), MYTHOLOGY("Mythology"), FANTACY("Fantacy"), POETRY("Poetry"), MYSTERY("Mystry");

		String genreOfBook;

		private BookGenre(String genre) {
			genreOfBook = genre;
		}

		String getGenreOfBook() {
			return genreOfBook;
		}

	}

	public BookGenre getGenreOfTheBook() {
		// TODO Auto-generated method stub
		return getGenreOfTheBook();
	}

	
}