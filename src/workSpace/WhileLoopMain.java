package workSpace;

import java.util.Scanner;

public class WhileLoopMain {

	public static void main(String[] args) {
		WhileLoop wl =new WhileLoop();
		
		Scanner sc = new Scanner(System.in); 
			System.out.println("Enter the statting number ");
		wl.number = sc.nextInt();
		System.out.println("Enter the final number ");
		wl.finalNumber = sc.nextInt(); 
		wl.printSuccessiveNumbers();
			
			
		}
		

	}


