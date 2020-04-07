package project;
import java.util.ArrayList;

public class Users {
	private static Users users;
	private ArrayList<User> userList;
	
	private Users() {
		userList = Database.getUsers();
	}
	
	public static Users getInstance() {
		if(users == null) {
			users = new Users();
		}
		
		return users;
	}
}
