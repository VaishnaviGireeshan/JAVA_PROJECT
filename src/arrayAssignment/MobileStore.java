package arrayAssignment;

import java.util.Scanner;

public class MobileStore {
	String[] samsung = { "S20", "S21", "Flip3", "Fold3" };
	String[] google = { "Google Pixel 6", "Google Pixel 6 Pro ", "Google Pixel Pro", "Google  Pixel 5" };
	String[] apple = { "Iphone12", "Iphone 12 mini", "Iphone 11", "Iphone 11" };
	String selectedBrand,selectedProduct;
	boolean validProduct;

	void selectProduct() {

		Scanner scr = new Scanner(System.in);
		System.out.println("Select Brand of your choice\nsamsung\ngoogle\napple");
		selectedBrand = scr.next();
		
		switch(selectedBrand) {
		case "samsung" :
			for (int i = 0; i < samsung.length; i++) { 

				System.out.println(samsung[i]); 

			}
			System.out.println("Please select the product:");
			selectedProduct=scr.next();
			for (int i = 0; i < samsung.length; i++) {

				if (selectedProduct.equalsIgnoreCase(samsung[i])) {
					System.out.println("Selected product is "+selectedProduct);
					validProduct=true;
				}
			}
			
			break;
		case "google" :
			for (int i = 0; i < google.length; i++) { 

				System.out.println(google[i]); 

			}
			System.out.println("Please select the product:");
			selectedProduct=scr.next();
			for (int i = 0; i < google.length; i++) {

				if (selectedProduct.equalsIgnoreCase(google[i])) {
					System.out.println("Selected product is "+selectedProduct);
					validProduct=true;
				}
			
			}
			break;
		case "apple" :
			for (int i = 0; i < apple.length; i++) { 

				System.out.println(apple[i]); 

			}
			System.out.println("Please select the product:");
			selectedProduct=scr.next();
			for (int i = 0; i < apple.length; i++) {

				if (selectedProduct.equalsIgnoreCase(apple[i])) {
					System.out.println("Selected product is "+selectedProduct);
					validProduct=true;
				}
				
			}
			break;
		default:System.out.println("Please select a product from the list");
			
	

	}
		if(validProduct!=true) {
		System.out.println("Please select a product from the list");	
		}
}}