package practicalProgramms;

import java.util.Scanner;

public class Practical {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 15;
		int num2 = 94;
		System.out.println("Before swapping\n---------------\nNumber 1 : " + num1 + "\nNumber 2 : " + num2);
		num1 = num1 + num2;// 7
		num2 = num1 - num2;// 5
		num1 = num1 - num2;// 2
		System.out.println("After swapping\n--------------\nNumber 1 : " + num1 + "\nNumber 2 : " + num2);
	}
}