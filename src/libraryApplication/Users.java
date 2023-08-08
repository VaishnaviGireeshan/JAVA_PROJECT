package libraryApplication;

public class Users {
	private String userName;
	private String userId;
	private String userPassword;
	private Users[] allUsers;

	public Users(String userName, String userId, String userPassword) {
		this.userName = userName;
		this.userId = userId;
		this.userPassword = userPassword;
	}

	public Users() {

	}

	public String getUserPassword() {
		return userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserId() {
		return userId;
	}

	public Users[] getUserDetails() {
		/*-------------------Admins-------------------------*/
		Users david = new Users("David", "A101", "david123");
		Users jony = new Users("Jony", "A102", "jony123");
		Users emma = new Users("Emma", "A103", "emma123");
		Users liam = new Users("Liam", "A104", "liam123");
		Users ava = new Users("Ava", "A105", "ava123");

		/*-------------------Readers-------------------------*/

		Users bella = new Users("Bella", "R101", "bella123");
		Users mica = new Users("Mica", "R102", "mica123");
		Users mia = new Users("Mia", "R103", "mia123");
		Users ross = new Users("Ross", "R104", "ross123");
		Users rona = new Users("Rona", "R105", "rona123");
		Users ella = new Users("Ella", "R106", "ella123");
		Users ethan = new Users("Ethan", "R107", "ethan123");
		Users olivia = new Users("Olivia", "R108", "olivia123");
		Users lucas = new Users("Lucas", "R109", "lucas123");
		Users kenny = new Users("Kenny", "R110", "kenny123");

		/*-------------------Guest users-------------------------*/
		Users lara = new Users("Lara", "G101", "lara123");
		Users amelia = new Users("Amelia", "G102", "amelia123");
		Users noah = new Users("Noah", "G103", "noah123");
		Users emily = new Users("Emily", "G104", "emily123");
		Users william = new Users("William", "G105", "william123");
		Users sophia = new Users("Sophia", "G106", "sophia123");
		Users michael = new Users("Michael", "G107", "michael123");
		Users oliver = new Users("Oliver", "G108", "oliver123");
		Users isabella = new Users("Isabella", "G109", "isabella123");
		Users lidiya = new Users("Lidiya", "G110", "lidiya123");

		allUsers = new Users[] { david, jony, emma, liam, ava, bella, mica, mia, ross, rona, ella, ethan, olivia, lucas,
				kenny };
		return allUsers;
	}

}