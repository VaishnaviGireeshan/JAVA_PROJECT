package FirstPackage;

public class MobileMain {

	public static void main(String[] args) {
		MobilePhone iPhone = new MobilePhone(); //instantiating a class
		iPhone.brandNmae = "IPhone";
		iPhone.modelNumber = 12;
		iPhone.screenSizeInInches = 6.2; 
		iPhone.makeCalls(); //Invoking methods
		iPhone.textMessages();
		iPhone.takePictures();
		System.out.println("----------------------------------");

		
		
		MobilePhone samsung = new MobilePhone();
		samsung.brandNmae ="Samsung";
		samsung.modelNumber = 22;
		samsung.screenSizeInInches = 6.3;
		samsung.makeCalls();
		samsung.textMessages();
		samsung.takePictures();
		
		
		

	}

}
