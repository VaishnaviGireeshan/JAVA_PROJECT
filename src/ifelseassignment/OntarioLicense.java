package ifelseassignment;

import java.util.Scanner;

public class OntarioLicense {
	int age;
	String currentLevel, alreadyHolder;
	Scanner scr = new Scanner(System.in);

	void checkStatus() {
		// if (alreadyHolder="yes");
		if (alreadyHolder.equals("yes")) {
			System.out.println("Enter your license type: \nG1\nG2\nG");
			currentLevel = scr.next();
			if (currentLevel.equals("G1")) {
				System.out.println("You can applay for G2 and G");
			} else if (currentLevel.equals("G2")) {
				System.out.println("You can applay  G");

			}else if(currentLevel.equals("G")) {
				System.out.println("Please visit the wepsite for more services...");
			}
			else {
				System.out.println("Invalid llicense type!!!");

			}
		} else {
			System.out.println("Enter your age ");
			age = scr.nextInt();
			if (age >= 16) {
				System.out.println("You are eligible for G1");
			} else {
				System.out.println("You are not eligible");
			}
		}

	}
}