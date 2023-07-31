package libraryAssignment;

import java.util.Scanner;

public class ReaderDetails {

    String readerType;
    String readerName;
    int numOfBooksGranted;
    String readerID;
    String enteredRid;
    int numOfBukIssue = 0;
    int count = 0;
    boolean continueIssue = true;
    Scanner sc = new Scanner(System.in);

    public ReaderDetails(String rType, String rName, String rid, int numBooksGranted) {
        readerType = rType;
        readerName = rName;
        readerID = rid;
        numOfBooksGranted = numBooksGranted;
    }

    public String getReaderID() {
        return readerID;
    }

    public String getReaderType() {
        return readerType;
    }

    public int getNumOfBooksGranted() {
        return numOfBooksGranted;
    }

    public void getReaderDetails() {

        BookDetails objBkDetails = new BookDetails(null, null, null, false);

        ReaderDetails sam = new ReaderDetails("Premium", "Sam", "5346", 3);
        ReaderDetails jon = new ReaderDetails("Basic", "Jon", "7689", 2);
        ReaderDetails kate = new ReaderDetails("Basic", "Kate", "3789", 2);
        ReaderDetails rick = new ReaderDetails("Premium", "Rick", "4570", 3);

        ReaderDetails[] allReaders = { sam, jon, kate, rick };

        ReaderDetails enteredReaderId = null;
        BookDetails[] books = objBkDetails.getAllBooks();

        System.out.println("\nEnter your reader id");
        enteredRid = sc.nextLine();

        for (int i = 0; i < allReaders.length; i++) {
            if (allReaders[i].getReaderID().equals(enteredRid)) {
                enteredReaderId = allReaders[i];
                break;
            }
        }

        if (enteredReaderId != null) {
            numOfBukIssue = enteredReaderId.getNumOfBooksGranted();

            if (numOfBukIssue == 0) {
                System.out.println("Invalid reader Id");
            } else {

                while (count < numOfBukIssue && continueIssue) {

                    System.out.println("Enter the name of the book that you want to be issued");
                    String bookName = sc.nextLine();
                    boolean isBookListed = false;
                    boolean isAvailableToIssue = false;

                    for (int i = 0; i < books.length; i++) {
                        if (books[i].bookName.equalsIgnoreCase(bookName)) {
                            isBookListed = true;
                            if (!books[i].isBookIssued) {
                                isAvailableToIssue = true;
                                books[i].isBookIssued = true;
                                count++;
                                break;
                            } else {
                                System.out.println("Book is already issued");
                                break;
                            }
                        }
                    }

                    if (count == numOfBukIssue) {
                        System.out.println("Reached maximum books...Thank you for visiting");
                    } else if (!isBookListed) {
                        System.out.println("Book not found. Please select a book from the list.");
                    } else if (!isAvailableToIssue) {
                        System.out.println("The selected book is already issued. Please select another book.");
                    } else {
                        System.out.println("Book is available for issuing.");
                    }

                    if (count < numOfBukIssue) {
                        System.out.println("Do you want to continue? (yes/no)");
                        String answer = sc.nextLine();
                        continueIssue = answer.equalsIgnoreCase("yes");
                    } else {
                        continueIssue = false;
                    }

                }

                sc.close();
            }
        }
    }
}
