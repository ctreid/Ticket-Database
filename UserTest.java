import java.util.ArrayList;

public class UserTest extends User{

	public static void main(String[] args) {
		User user = new User();
		String retUN = null;
		String retP = null;
		System.out.println("***********TESTING USER CLASS***********");
		
		System.out.println("\nTESTING SET USERNAME METHOD:\n-------------------------");
		user.setUserName("Test");
		if(user.getUserName().equalsIgnoreCase("Test")) {
			System.out.println("Username was added");
		}
		else {
			System.out.println("Username was not added ");
		}
		
		System.out.println("\nTESTING GET USERNAME:\n-------------------------");
		retUN = user.getUserName();
		if(retUN != null && retUN.equalsIgnoreCase("Test")) {
			System.out.println("Username was return sucessfully");
		}
		else {
			System.out.println("Username was not returned");
		}
		
		System.out.println("\nTESTING SET PASSWORD:\n-------------------------");
		user.setPassword("Test");
		if(retP != null && retP.equalsIgnoreCase("Test")) {
			System.out.println("Password was added");
		}
		else {
			System.out.println("Password was not added");
		}
		
		System.out.println("\nTESTING GET PASSWORD:\n-------------------------");
		retP = user.getPassword();
		if (retP !=null && retP.equalsIgnoreCase("Test")) {
			System.out.println("Password was return sucessfully");
		}
		else {
			System.out.println("Password was not returned");
		}
	}

	public static ArrayList<User> getUser() {
		// TODO Auto-generated method stub
		return null;
	}
}

		
		