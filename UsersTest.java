import java.util.ArrayList;
public class UsersTest extends Users{

	public static void main(String[] args) {
		Users users = new Users();
		System.out.println("***********TESTING USERS CLASS***********");
		
		System.out.println("\nTESTING GET INSTANCE METHOD:\n-------------------------");
		Users x;
		x = UsersTest.getInstance();
		if(x != null) {
			System.out.println("Users returned");
		}
		else {
			System.out.println(" Users not returned.");
		}
		System.out.println("\nTESTING GET USER METHOD:\n-------------------------");
		ArrayList<User>retList;
		retList = UserTest.getUser();
		if(retList != null) {
			System.out.println("list returned!");
		}
		else {
			System.out.println("list not returned.");
		}
		
		System.out.println("\nTESTING ADD USER METHOD:\n-------------------------");
		User tempUser = new User("Test","Test");
		UsersTest.addUser("Test","Test");
		User compareValue;
		boolean found = false;
		for(int i = 0; i < UsersTest.userList.size(); i++) {
			compareValue = UsersTest.userList.get(i);
			if(compareValue.getUserName().equalsIgnoreCase(tempUser.getUserName())) {
				found = true;
			}
		}
		if(found) {
			System.out.println("User was added!");
		}
		else {
			System.out.println("User was not added.");
		}
	}


}