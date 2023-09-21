
package practicalProgramms;

import java.util.Arrays;
import java.util.Scanner;

public class InterviewPractical {

	Scanner sc = new Scanner(System.in);
	/* 1 : Write a program to reverse a string and check if it is a palindrome. */
	// 2: Write a Program to Check Whether a Number is Palindrome

	public void reverseString() {

		System.out.println("Enter a string to reverse");
		String inputString = sc.nextLine();

		StringBuilder reversedInput = new StringBuilder();

		for (int i = inputString.length() - 1; i >= 0; i--) {
			reversedInput.append(inputString.charAt(i));
		}
		System.out.println("Reversed String is \n" + reversedInput);
	}

	public void checkStringIsPalindrome() {

		System.out.println("enter a string to check it is palindrome or not");
		String inputString = sc.nextLine();

		StringBuilder reversedInput = new StringBuilder();
		for (int i = inputString.length() - 1; i >= 0; i--) {
			reversedInput.append(inputString.charAt(i));
		}

		if (inputString.equalsIgnoreCase(reversedInput.toString())) {
			System.out.println(inputString + " is Palindrome");
		} else {
			System.out.println(inputString + " is not Palindrome");
		}
	}
	/* 2: Write a Program to Check Whether a Number is Palindrome */

	public void checkNumberIsPalindrome() {
		System.out.println("Enter a number");
		int inputNumber = sc.nextInt();// 345
		int orginalNumber = inputNumber;

		int reversedNumber = 0;
		while (inputNumber != 0) {
			reversedNumber = reversedNumber * 10 + inputNumber % 10; // (0*10) + (345 %10) -> 0+5 reversedNumber=5
																		// (5*10) + (34%10) -> 50+4 reversedNumber=54
																		// (54*10) +(3%10) -> 540+3 reversedNumber=543
			inputNumber = inputNumber / 10; // 345/10=34 -> inputNumber=34 //34/10=3 inputNumber=3
		}
		System.out.println("Reversed number is \n" + reversedNumber);
		if (orginalNumber == reversedNumber) {
			System.out.println(orginalNumber + " is palindrome");
		} else {
			System.out.println(orginalNumber + " is not palindrome");
		}

	}

	/* 3:Write a program to find if the number is prime or not. */
	// Natural Number greater than 1
	// Which has only 2 factors 1 and itself
	public void checkNumberIsPrime() {

		System.out.println("Enter a number");
		int entredNum = sc.nextInt();
		int count = 0;
		if (entredNum > 1) {
			for (int i = 1; i <= entredNum; i++) {
				if (entredNum % i == 0)
					count++;
			}
			if (count == 2) {
				System.out.println(+entredNum + " is prime number");
			} else {
				System.out.println(+entredNum + " is not prime number");
			}

		} else {
			System.out.println("Not Prime number");
		}

	}

	/* 20: Write a Program to Find Factorial of a Number */
	public void printFactorial() {
		System.out.println("Enter the number you wanto find the factorial");
		int inputNum = sc.nextInt();
		long factiorial = 1;
		for (int i = 1; i <= inputNum; i++) {
			factiorial = factiorial * i;
		}

		System.out.println("Factorial Of " + inputNum + " is " + factiorial);

	}

	/* 26: Write a Program to Display Factors of a Number */
	public void printFactors() {
		System.out.println("Enter a number");
		int inputNum = sc.nextInt();
		System.out.println("Factors of " + inputNum);
		for (int i = 1; i <= inputNum; i++) {
			if (inputNum % i == 0) {
				System.out.println(i + "\t");
			}
		}

	}

	/* 22: Write a Program to Display Fibonacci Series */
	// 0 1 1 2 3 5 8 13 21
	public void printFibonanciiSeries() {
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		System.out.println("Enter the range");
		int range = sc.nextInt();
		System.out.println(+num1 + "\n" + num2);
		for (int i = 2; i < range; i++) {
			sum = num1 + num2;
			System.out.println(sum);
			num1 = num2;
			num2 = sum;
		}

	}

	/* 9 : Write a program to find the length of a string. */
	public void printLengthOfString() {
		System.out.println("Enter a string");
		String enteredString = sc.nextLine();
		int count = 0;
		for (int i = 0; i < enteredString.length(); i++) {
			char currentChar = enteredString.charAt(i);
			if (currentChar != ' ')
				count++;
		}

		System.out.println("length of the string is " + count);

	}
	/* 16: Write a program to Check Whether an Alphabet is Vowel or Consonant. */

	public void vowelOrConsonant() {

		String vowels[] = { "a", "e", "i", "o", "u" };
		boolean isVowel = false;

		System.out.println("Enter a alphabet");
		String inputAlpha = sc.nextLine().toLowerCase();
		if (inputAlpha.length() == 1) {

			for (String alpha : vowels) {
				if (inputAlpha.equals(alpha)) {
					isVowel = true;

				}
			}
			if (isVowel) {
				System.out.println(inputAlpha + " is vowel");
			} else {
				System.out.println(inputAlpha + " is consonant");
			}

		} else {
			System.out.println("Invalid entry");
		}
		sc.close();
	}

	/*
	 * 10: Write a program to change all letter form small case to capital case in a
	 * string
	 */
	public void covertToUppercase() {
		System.out.println("Enter a string to covert into uppercase");
		String inputString = sc.nextLine().toUpperCase();
		System.out.println("Converted string is " + inputString);

	}

	/* 6 : Write a program to replace 2 number without using third variable. */
	public void swap() {
		int num1 = 2;
		int num2 = 3;
		System.out.println("Before swapping\nNumber 1 is " + num1 + "\nNumber 2 is " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("After swapping\nNumber 1 is " + num1 + "\nNumber 2 is " + num2);

	}

	/* 7 : Write a program to find if a string is a substring of another String. */
	public void checkSubString() {
		String mainString = "sai vaishnavi";
		String subString = "vaishnavi";
		boolean isContainsSubstring = mainString.contains(subString);
		if (isContainsSubstring) {
			System.out.println(mainString + " contains " + subString);
		} else {
			System.out.println(mainString + " doesn't contains " + subString);
		}

	}

	/* 17: Write a Program to Check Whether a Number is Positive or Negative */
	public void negativeOrPositive() {
		System.out.println("Enter a number to check if it is negative or positive");
		double inputNum = sc.nextDouble();
		if (inputNum < 0) {
			System.out.println("Entered number is negative");
		} else if (inputNum > 0) {
			System.out.println("Entered number is positive");
		} else {
			System.out.println("Entered number is zero");
		}

	}

	/* 18: Write a Program to Check Whether a Character is Alphabet or Not */
	public void checkCharacter() {
		System.out.println("Enter a character");
		char inputChar = sc.next().charAt(0);
		sc.close();
		if (Character.isLetter(inputChar)) {
			System.out.println(inputChar + " is an alphabet");
		} else {
			System.out.println(inputChar + " is not an alphabet");
		}

	}

	/* 19: Write a Program to Calculate the Sum of Natural Numbers */
	public void sumOfNaturalNumbers() {
		System.out.println("Enter a positive number");
		int num = sc.nextInt();
		if (num <= 0) {
			System.out.println("please Enter a positive number");
		} else {
			int sum = 0;
			for (int i = 1; i <= num; i++) {
				sum = sum + i;
			}
			System.out.println("Sum of natural numbers fro 1 to " + num + " is " + sum);
		}

	}

	/* 21: Write a Program to Generate Multiplication Table */
	public void multiplicationTable() {
		System.out.println("Entr the number for which you want to print the multiplication table");
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println("Enter the range");
			int range = sc.nextInt();

			System.out.println("Multiplication table for " + num + "\n-----------------------------");
			for (int i = 1; i <= range; i++) {
				int product = num * i;
				System.out.println(num + " * " + i + " = " + product);
			}

		} else {
			System.out.println("please enter a number greater than 0");
		}
	}

	/* Write a Program to Calculate the Power of a Number */
	public void powerOfNumber() {
		System.out.println("Enter the base ");
		int baseNum = sc.nextInt();
		System.out.println("Enter the exponent ");
		int exponentNum = sc.nextInt();
		var result = Math.pow(baseNum, exponentNum);
		System.out.println(baseNum + " raised to the power of " + exponentNum + " is " + result);

	}

	/* Write a program to remove second character of every word in a sentence */
	public void removeSecondCharacter() {
		System.out.println("Enter a sentence");
		String orgSentence = sc.nextLine();
		String[] words = orgSentence.split(" ");
		StringBuilder result = new StringBuilder();

		for (String word : words) {
			if (word.length() >= 2) {
				String modifiedWord = word.substring(0, 1) + word.substring(2);
				result.append(modifiedWord).append(" ");
			} else {
				result.append(word).append(" ");
			}
		}

		String modifiedSentence = result.toString().trim();
		System.out.println("Modified sentence: " + modifiedSentence);
	}

	/* even and odd numbers in an array */
	public void evenAndOdd() {

		int[] numArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 34, 57 };
		System.out.println("Even numbers");
		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] % 2 == 0) {
				System.out.println(numArray[i]);
			}
		}
		System.out.println("odd numbers");
		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] % 2 != 0) {
				System.out.println(numArray[i]);
			}
		}
	}

	/* 3 : Write a program to find the maximum number in an array. */
	/* 8 : Write a program to find smallest and largest number in an array. */
	public void maxInArray() {
		int numArray[] = { 23, 5, 67, 37 };
		System.out.println("Array elements are " + Arrays.toString(numArray));
		int max = numArray[0];
		for (int i = 1; i < numArray.length; i++) {
			if (numArray[i] < max) {
				max = numArray[i];
			}
		}
		System.out.println("Maximum number in the array is " + max);

	}

	public void minInArray() {
		int numArray[] = { 3, 6, 2, 90, 24 };
		int min = numArray[0];
		System.out.println("Array elements are " + Arrays.toString(numArray));
		for (int i = 1; i < numArray.length; i++) {
			if (numArray[i] < min)
				min = numArray[i];
		}
		System.out.println("Minumum number in the array is " + min);

	}

	/* 4:Write a program to print the numbers in an array in descending order. */
	/* 11: Write a program to sort an array of number. */

	public void descendingArray() {

		int numArray[] = { 3, 456, 6, 2, 90, 24 };
		int n = numArray.length;
		System.out.println("Array elements before sorting " + Arrays.toString(numArray));

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (numArray[j] < numArray[j + 1]) {
					int temp = numArray[j];
					numArray[j] = numArray[j + 1];
					numArray[j + 1] = temp;
				}
			}
		}
		System.out.println("Array elements after sorting in descending order " + Arrays.toString(numArray));

	}

	public void ascendingArray() {
		int numArray[] = { 3, 456, 6, 2, 90, 24 };
		int n = numArray.length;
		System.out.println("Array elements before sorting " + Arrays.toString(numArray));

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (numArray[j] > numArray[j + 1]) {
					int temp = numArray[j];
					numArray[j] = numArray[j + 1];
					numArray[j + 1] = temp;
				}
			}
		}
		System.out.println("Array elements after sorting ascending order " + Arrays.toString(numArray));

	}

	/* 27: Write a Program to Display Prime Numbers Between Two Intervals */
	public void primeWithinRange() {
		System.out.println("Enter the minimum of range ");
		int min = sc.nextInt();
		System.out.println("Enter the maximum of range ");
		int max = sc.nextInt();

		System.out.println("prime numbers within " + min + " and " + max + " are");
		for (int i = min; i <= max; i++) {
			int counter = 0;
			for (int j = 2; j < i; j++) {// starts with j=2 bcoz the samllest prime number is
				if (i % j == 0) {
					counter = 1;
					break;
				}

			}

			if (counter == 0 && i > 1) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
