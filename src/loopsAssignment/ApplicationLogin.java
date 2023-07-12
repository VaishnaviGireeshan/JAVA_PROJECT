package loopsAssignment;

import java.util.Scanner;

public class ApplicationLogin {
	String userName, passWord;
	int attemptCount;
	Scanner scr = new Scanner(System.in);

	void loginToApplication() {
		System.out.println("Enter the username and password");
		while (attemptCount < 3) {
			userName = scr.next();
			passWord = scr.next();
			attemptCount++;
			if (userName.equals("pivotAdmin") && passWord.equals("Admin123")) {

				System.out.println("You are logged in to the application");

			}

			else {
				if (attemptCount != 3) {
					System.out.println("Incorrect User id or password. Try again");
					if (attemptCount == 1) {
						System.out.println("You have 2 more attempts lefts!!!");
					}

					else if (attemptCount == 2) {
						System.out.println("You have 1 more attempts left!!!");
					}

				} else {
					System.out.println("Account locked");
				}
			}

		}
	}
}