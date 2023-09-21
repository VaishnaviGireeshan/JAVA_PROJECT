package practicalProgramms;

import java.util.Scanner;

public class StringPalindromeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringPalindrome str=new StringPalindrome();

		System.out.println("Enter a string to check it is palindrome or not");
		String enteredWord = sc.nextLine();

		String reversed = str.reverseString(enteredWord);
		System.out.println("Reversed String is \n" + reversed);

		if (str.isPalindrome(enteredWord)) {
			System.out.println("Entered word is palindrome");

		} else {
			System.out.println("Entered word is not palindrome");
		}
		sc.close();
	}

}