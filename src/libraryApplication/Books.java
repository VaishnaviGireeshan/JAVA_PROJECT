package libraryApplication;

import java.util.Scanner;

public class Books {

	private String bookName;
	private BookGenre genreOfTheBook;
	private String authorName;
	private boolean isBookIssued;
	private Library library;
	Scanner sc = new Scanner(System.in);

	public Books(String bookName, BookGenre genreOfTheBook, String authorName, Library library) {
		this.bookName = bookName;
		this.authorName = authorName;
		this.genreOfTheBook = genreOfTheBook;
		this.library = library;
	}

	public Books() {

	}

	public String getAuthorName() {
		return authorName;
	}

	public String getBookName() {
		return bookName;
	}

	public BookGenre getGenreOfTheBook() {
		return genreOfTheBook;
	}

	public boolean isBookIssued() {
		return isBookIssued;
	}

	public void setBookIssued(boolean isIssued) {
		this.isBookIssued = isIssued;
	}

	public Library getLibrary() {

		return library;
	}

	public static Books[] getTorontoBooks() {
		Library torontoLibrary = new Library("Toronto");

		Books tigana = new Books("Tigana", BookGenre.FANTASY, "Gavriel Kay", torontoLibrary);
		Books americanGods = new Books("American Gods", BookGenre.FANTASY, "Neil Gaiman", torontoLibrary);
		Books fightClub = new Books("Fight Club", BookGenre.FICTION, "Chuck Palahniuk", torontoLibrary);
		Books lilacGirls = new Books("Lilac Girls", BookGenre.FICTION, "Martha Hall", torontoLibrary);
		Books glimpse = new Books("Glimpse", BookGenre.POETRY, "Carol Lynch Williams", torontoLibrary);
		Books babyTeeth = new Books("Baby Teeth", BookGenre.POETRY, "Meg Grehan", torontoLibrary);
		Books dry = new Books("The Dry", BookGenre.MYSTERY, "Jane Harper", torontoLibrary);
		Books rebecca = new Books("Rebecca", BookGenre.MYSTERY, "De Maurier", torontoLibrary);
		Books odyssey = new Books("The Odyssey", BookGenre.MYTHOLOGY, "Homer", torontoLibrary);
		Books norse = new Books("Norse Mythology", BookGenre.MYTHOLOGY, "Neil Gaiman", torontoLibrary);

		Books[] torontoBooks = { tigana, americanGods, fightClub, lilacGirls, glimpse, babyTeeth, dry, rebecca, odyssey,
				norse };
		return torontoBooks;
	}

	public static Books[] getMarkhamBooks() {
		Library markhamLibrary = new Library("Markham");

		Books harryPotter = new Books("Deathly Hallows", BookGenre.FANTASY, "J K Rowling", markhamLibrary);
		Books iceAndFire = new Books("Ice and Fire", BookGenre.FANTASY, "R Martin", markhamLibrary);
		Books famousFive = new Books("On an Island", BookGenre.FICTION, "Andy Blyton", markhamLibrary);
		Books fivePointSomeone = new Books("Five Point Someone", BookGenre.FICTION, "Chetan Bhagat", markhamLibrary);
		Books bridgerton = new Books("The Duke and I", BookGenre.POETRY, "Julia Quinn", markhamLibrary);
		Books alchemist = new Books("The Alchemist", BookGenre.POETRY, "Paulo Coelho", markhamLibrary);
		Books sherlockHolmes = new Books("The Valley of Fear", BookGenre.MYSTERY, "Arthur Conan Doyle", markhamLibrary);
		Books goneGirl = new Books("Gone Girl", BookGenre.MYSTERY, "Gillian Flynn", markhamLibrary);
		Books bulfinch = new Books("Bulfinch's Mythology", BookGenre.MYTHOLOGY, "Thomas Bulfinch", markhamLibrary);
		Books iliad = new Books("The Iliad", BookGenre.MYTHOLOGY, "Homer", markhamLibrary);

		Books[] markhamBooks = { harryPotter, iceAndFire, famousFive, fivePointSomeone, bridgerton, alchemist,
				sherlockHolmes, goneGirl, bulfinch, iliad };
		return markhamBooks;
	}

	public static Books[] getScarboroughBooks() {
		Library scarboroughLibrary = new Library("Scarborough");

		Books lordOfTheRings = new Books("Lord of the Rings", BookGenre.FANTASY, "JR", scarboroughLibrary);
		Books narnia = new Books("Prince Caspian", BookGenre.FANTASY, "C S Lewis", scarboroughLibrary);
		Books outlander = new Books("Dragonfly in Amber", BookGenre.FICTION, "Diana Gabaldon", scarboroughLibrary);
		Books dune = new Books("Dune", BookGenre.FICTION, "Frank Herbert", scarboroughLibrary);
		Books crank = new Books("Crank", BookGenre.POETRY, "Ellen Hopkins", scarboroughLibrary);
		Books one = new Books("One", BookGenre.POETRY, "Sarah Crossan", scarboroughLibrary);
		Books maid = new Books("The Maid", BookGenre.MYSTERY, "Nita Prose", scarboroughLibrary);
		Books shutterIsland = new Books("Shutter Island", BookGenre.MYSTERY, "Dennis Lehane", scarboroughLibrary);
		Books mythos = new Books("Mythos", BookGenre.MYTHOLOGY, "Stephen Fry", scarboroughLibrary);
		Books hero = new Books("The Hero with a Thousand Faces", BookGenre.MYTHOLOGY, "Joseph Campbell",
				scarboroughLibrary);

		Books[] scarboroughBooks = { lordOfTheRings, narnia, outlander, dune, crank, one, maid, shutterIsland, mythos,
				hero };
		return scarboroughBooks;
	}

	public static Books[] setAllBooks() {
		Books[] torontoBooks = getTorontoBooks();
		Books[] markhamBooks = getMarkhamBooks();
		Books[] scarboroughBooks = getScarboroughBooks();

		// Combined all books from different libraries
		int totalLength = torontoBooks.length + markhamBooks.length + scarboroughBooks.length;
		Books[] allBooks = new Books[totalLength];
		System.arraycopy(torontoBooks, 0, allBooks, 0, torontoBooks.length);
		System.arraycopy(markhamBooks, 0, allBooks, torontoBooks.length, markhamBooks.length);
		System.arraycopy(scarboroughBooks, 0, allBooks, torontoBooks.length + markhamBooks.length,
				scarboroughBooks.length);

		return allBooks;
	}

	public enum BookGenre {
		FICTION("Fiction"), MYTHOLOGY("Mythology"), FANTASY("Fantasy"), POETRY("Poetry"), MYSTERY("Mystery");

		private String genreOfBook;

		private BookGenre(String genre) {
			genreOfBook = genre;
		}

		public String getGenreOfBook() {
			return genreOfBook;
		}
	}
}
