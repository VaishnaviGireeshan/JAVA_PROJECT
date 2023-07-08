package loopsAssignment;

//import java.util.Scanner;

public class ApplicationLogin {
	String userName,passWord;
	int count;
//	Scanner scr = new Scanner(System.in);

	void loginToApplication() {
		if(userName.equals("pivotAdmin")&&passWord.equals("Admin123")) {
			//System.out.println("Enter the password");
			//passWord=scr.next();
//			if(passWord.equals("Admin123")) {
			System.out.println("You are logged in to the application");	
//			}
			
		}
		else {
			System.out.println("Incorrect User id or password. Try again");
			
		}
		
		count++;
		
	}

}
