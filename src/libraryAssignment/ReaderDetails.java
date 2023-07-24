package libraryAssignment;

public class ReaderDetails {

	String readerType;
	String readerName;
	int numOfBooksGranted;
	int readerID;
	
	public ReaderDetails(String rType,String rName,int rid,int numBooksGranted) {
		readerType=rType;
		readerName=rName;
		readerID=rid;
		numOfBooksGranted=numBooksGranted;
		
		
	}
	public int getReaderID() {
        return readerID;
    }
	 public String getReaderType() {
	        return readerType;
	    }
	
}
