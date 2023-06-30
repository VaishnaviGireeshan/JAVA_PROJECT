package FirstPackage;

public class LaptopMain {

	public static void main(String[] args) {
		Laptop hp = new Laptop();
		//Assigning values to variables
		hp.brandName = "HP";
		hp.modelNumber = "Elite book";
		hp.ramSize = 8;
		hp.screenSize =13;
		hp.isUptodate = true;
		//invoking methods
		hp.turnOn();
		hp.openBrowser();
		hp.sendEmail();
		hp.status();
		System.out.println("----------------------------------");

		
		Laptop dell = new Laptop();
		dell.brandName = "Dell";
		dell.modelNumber = "XPS";
		dell.ramSize = 16;
		dell.turnOn();
		dell.openBrowser();
		dell.sendEmail();
		dell.status();
		

	}

}
