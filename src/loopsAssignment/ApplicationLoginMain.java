package loopsAssignment;

import java.util.Scanner;

public class ApplicationLoginMain {

	public static void main(String[] args) {
		ApplicationLogin al = new ApplicationLogin();
		Scanner sc = new Scanner(System.in);
		while(al.count<=3) {
		System.out.println("Enter the username and password");
		al.userName = sc.next();
		al.passWord =sc.next();
		al.loginToApplication();

if(al.count==3) {
	System.out.println("Account locked");
	break;
}
	}

}
}