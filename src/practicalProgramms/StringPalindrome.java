package practicalProgramms;

public class StringPalindrome {

	public String reverseString(String checkString) {

		StringBuilder reversed = new StringBuilder();
		for (int i = checkString.length() - 1; i >= 0; i--) {
			reversed.append(checkString.charAt(i));
		}

		return reversed.toString();

	}

	public boolean isPalindrome(String reversedStrig) {
		String reversedString = reverseString(reversedStrig);
		return reversedStrig.equalsIgnoreCase(reversedString);
	}
}
