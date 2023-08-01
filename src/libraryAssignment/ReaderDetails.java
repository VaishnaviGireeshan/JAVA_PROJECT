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
	LibraryDetails objLbDetails = new LibraryDetails(null);

	public ReaderDetails(String rType, String rName, String rid, int numBooksGranted) {
		readerType = rType;
		readerName = rName;
		readerID = rid;
		numOfBooksGranted = numBooksGranted;
	}

	public ReaderDetails() {
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

	public String getReaderName() {
		return readerName;
	}

	public void getReaderDetails() {

		ReaderDetails sam = new ReaderDetails("Premium", "Sam", "R5346", 3);
		ReaderDetails jon = new ReaderDetails("Basic", "Jon", "R7689", 2);
		ReaderDetails kate = new ReaderDetails("Basic", "Kate", "R3789", 2);
		ReaderDetails rick = new ReaderDetails("Premium", "Rick", "R4570", 3);

		ReaderDetails[] allReaders = { sam, jon, kate, rick };

		ReaderDetails enteredReaderId = null;

		System.out.println("Enter your reader id");
		enteredRid = sc.nextLine();

		String name;
		int totalBooks;

		for (int i = 0; i < allReaders.length; i++) {
			if (allReaders[i].getReaderID().equals(enteredRid)) {
				enteredReaderId = allReaders[i];
				name = allReaders[i].getReaderName();
				totalBooks = allReaders[i].getNumOfBooksGranted();
				System.out.println("Hi " + name + ", You can take " + totalBooks + " books");
				break;
			}
		}

	}

}
