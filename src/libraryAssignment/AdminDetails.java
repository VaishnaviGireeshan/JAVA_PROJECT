package libraryAssignment;

public class AdminDetails {
String adminName;
String adminId;



public AdminDetails(String aName,String aId) {
	adminName=aName;
	adminId=aId;
}
public void getAdminDetails() {
	AdminDetails david=new AdminDetails("David", "D103");
	AdminDetails jony=new AdminDetails("Jony", "D104");
	
	AdminDetails[] allAdmins= {david,jony};
}

}
