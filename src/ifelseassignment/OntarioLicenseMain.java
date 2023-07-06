package ifelseassignment;

import java.util.Scanner;

public class OntarioLicenseMain {

	public static void main(String[] args) {
		OntarioLicense ol = new OntarioLicense();
		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Do you hold any level of Ontario license? (yes/no)");
			ol.alreadyHolder = new Scanner(System.in).next();
			ol.checkStatus();

		}

	}
}
