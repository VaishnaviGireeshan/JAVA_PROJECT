package cruiseAssignment;

import java.util.InputMismatchException;// handle invalid input
import java.util.Scanner;
import java.util.regex.Pattern;//provides classes for working with regular expressions
import java.util.regex.Matcher;

public class User implements UserDetails {
	Scanner sc = new Scanner(System.in);
	private String email;
	private String password;// A combination of uppercase letters, lowercase letters, numbers, and symbols
	private String fullName;
	private String phoneNumber;

	public User() {

	}

	public User(String email, String password, String fullName, String phoneNumber) {
		this.email = email;
		this.password = password;
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
	}

	// Getter and Setter for email
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// Getter and Setter for password
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// Getter and Setter for fullName
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	// Getter and Setter for phoneNumber
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public void signUp() {  //throws CredentialException if any validation fails.
		System.out.println("Welcome to Costa Cruises\n-------------------------");
		System.out.println("Please sign up to book a cruise.");
		try {

			System.out.print("Enter your email address\n");
			email = sc.nextLine();
			validateEmail(email);

			System.out.print("Enter the password that you want to use\n");
			password = sc.nextLine();
			validatePassword(password);

			System.out.print("Enter your Full Name\n");
			fullName = sc.nextLine();

			System.out.print("Enter your phone number\n");
			phoneNumber = sc.nextLine();
			validatePhoneNumber(phoneNumber);

			System.out.println("\nThank you for registering!");
		} catch (CredentialException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	// Validate email format
	private void validateEmail(String email) throws CredentialException {
		String emailRegex = "^[A-Za-z0-9]+@(.+)$";
		if (!Pattern.matches(emailRegex, email)) {
			throw new CredentialException("Invalid email format.");
			// The exception is instantiated with the error message
		}
	}

	// Validate password format
	private void validatePassword(String password) throws CredentialException {
		boolean hasCapital = false;
		boolean hasSmall = false;
		boolean hasNumber = false;
		boolean hasSpecialChar=false;

		for (char pw : password.toCharArray()) {
			if (Character.isUpperCase(pw)) {
				hasCapital = true;
			} else if (Character.isLowerCase(pw)) {
				hasSmall = true;
			} else if (Character.isDigit(pw)) {
				hasNumber = true;
			}else if (!Character.isLetterOrDigit(pw)) {
		            hasSpecialChar = true;
		        }
		}

		if (!(hasCapital && hasSmall && hasNumber && hasSpecialChar)) {
	        throw new CredentialException(
	                "Invalid password format. Password must contain at least one capital letter, one small letter, one number, and one special character.");
	    }
	}

	// Validate phone number format
	private void validatePhoneNumber(String phoneNumber) throws CredentialException {
		String phoneRegex = "^[0-9]{10}$";
		if (!Pattern.matches(phoneRegex, phoneNumber)) {
			throw new CredentialException("Invalid phone number format.");
		}
	}

	@Override
	public void logIn() throws CredentialException {
		System.out.print("\nPlease LogIn\nEnter your email\n");
		String enteredEmail = sc.nextLine();
		System.out.print("Enter your password\n");
		String enteredPassword = sc.nextLine();

		if (enteredEmail.equals(email) && enteredPassword.equals(password)) {
			System.out.println("\nLogin successful!");
		} else {
			throw new CredentialException("\nLogin failed. Incorrect email or password.");
		}
	}

	@Override
	public void upadteUserDetails() {
		System.out.print(
				"Do you want to change your personal information? Press Y to change, or any other key to exit: ");
		String choice = sc.nextLine();

		if (choice.equalsIgnoreCase("Y")) {
			System.out
					.println("Please enter the information you want to change\n1. Password\n2. Phone number\n3. Email");
			try {
				int option = sc.nextInt();
				sc.nextLine();

				switch (option) {
				case 1:
					System.out.print("Enter your existing password: ");
					String existingPassword = sc.nextLine();
					if (existingPassword.equals(password)) {
						System.out.print("Enter your new password: ");
						String newPassword = sc.nextLine();
						setPassword(newPassword);
						System.out.println("Your password has been changed!");
					} else {
						System.out.println("Incorrect password. Cannot change password.");
					}
					break;
				case 2:
					System.out.print("Enter your new phone number:");
					String newPhoneNumber = sc.nextLine();
					setPhoneNumber(newPhoneNumber);
					System.out.println("Your phone number has been updated!");
					break;
				case 3:
					System.out.print("Enter your new email:");
					String newEmail = sc.nextLine();
					setEmail(newEmail);
					System.out.println("Your email has been updated!");
					break;

				default:
					System.out.println("Invalid option.");
				}
			} catch (InputMismatchException e) {
				/*   is a specific type of exception that is thrown when an 
				 * input token  cannot be converted to the 
				 * expected type  using the given method  */
				System.out.println("Invalid input. Please enter a valid option.");
			} catch (Exception e) {
				System.out.println("An error occurred:" + e.getMessage());
			}
		}

		System.out.println("Thank you for using the service!");

	}

}
