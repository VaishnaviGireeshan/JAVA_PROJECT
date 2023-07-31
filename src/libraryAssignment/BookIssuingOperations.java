package libraryAssignment;

public class BookIssuingOperations {

    public void displayBooksByGenre(BookDetails[] allBooks, BookDetails.BookGenre genre) {
        if (genre == null) {
            System.out.println("No genre selected.");
            return;
        }

        BookDetails[] filteredBooks = new BookDetails[allBooks.length];
        int count = 0;

        for (int i = 0; i < allBooks.length; i++) {
            BookDetails bookByGenre = allBooks[i];
            if (bookByGenre.genreOfTheBook.equalsIgnoreCase(genre.getGenreOfBook())) {
                filteredBooks[count] = bookByGenre;
                count++;
            }
        }

        if (count > 0) {
            System.out.println("Books of genre " + genre.getGenreOfBook() + ":");
            for (int i = 0; i < count; i++) {
                System.out.println(filteredBooks[i].bookName + " by " + filteredBooks[i].authorName);
            }
        } else {
            System.out.println("No books found for the selected genre.");
        }
    }
}
